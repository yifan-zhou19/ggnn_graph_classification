import torch
from torch.autograd import Variable

def test(dataloader, net, criterion, optimizer, opt):
    # net.train()
    test_loss = 0
    correct = 0
    net.eval()
    for i, (adj_matrices, annotations, target) in enumerate(dataloader, 0):
    
        net.zero_grad()
       
        left_adj_matrix = adj_matrices[0]
        right_adj_matrix = adj_matrices[1]
        
        left_annotation = annotations[0]
        right_annotation = annotations[1]

        left_padding = torch.zeros(len(left_annotation), opt.n_node, opt.state_dim - opt.annotation_dim).double()
        right_padding = torch.zeros(len(right_annotation), opt.n_node, opt.state_dim - opt.annotation_dim).double()
      
        left_init_input = torch.cat((left_annotation, left_padding), 2)
        right_init_input = torch.cat((right_annotation, right_padding), 2)

        if opt.cuda:
            # print("Using cuda for training.......")
            left_init_input = left_init_input.cuda()
            right_init_input = right_init_input.cuda()
            left_adj_matrix = left_adj_matrix.cuda()
            right_adj_matrix = right_adj_matrix.cuda()
            left_annotation = left_annotation.cuda()
            right_annotation = right_annotation.cuda()
            target = target.cuda()

        left_init_input = Variable(left_init_input)
        right_init_input = Variable(right_init_input)

        left_adj_matrix = Variable(left_adj_matrix)
        right_adj_matrix = Variable(right_adj_matrix)

        left_annotation = Variable(left_annotation)
        right_annotation = Variable(right_annotation)

        target = Variable(target)
     
        output = net(left_init_input, left_annotation, left_adj_matrix, right_init_input, right_annotation, right_adj_matrix)
       
        test_loss += criterion(output, target).data[0]

        pred = output.data.max(1, keepdim=True)[1]
        # print(pred)

        correct += pred.eq(target.data.view_as(pred)).cpu().sum()

    test_loss /= len(dataloader.dataset)
    print('Test set: Average loss: {:.4f}, Accuracy: {}/{} ({:.0f}%)'.format(
        test_loss, correct, len(dataloader.dataset),
        100. * correct / len(dataloader.dataset)))
