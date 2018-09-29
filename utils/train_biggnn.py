import torch
from torch.autograd import Variable
import model

def train(epoch, dataloader, net, criterion, optimizer, opt):
    # net.train()
    
    for i, (adj_matrices, annotations, target) in enumerate(dataloader, 0):
    
        net.zero_grad()
        # optimizer.zero_grad()
        # print("------------------")
        left_adj_matrix = adj_matrices[0]
        right_adj_matrix = adj_matrices[1]
        # print(left_adj_matrix)
        # print(right_adj_matrix)
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
        # print(target)

        if opt.loss == 1:
            left_output, right_output = net(left_init_input, left_annotation, left_adj_matrix, right_init_input, right_annotation, right_adj_matrix)
            loss = criterion(left_output,right_output, target) 
    
        else:
            output = net(left_init_input, left_annotation, left_adj_matrix, right_init_input, right_annotation, right_adj_matrix)
            loss = criterion(output, target) 
           
        # 

        loss.backward()
        optimizer.step()

        if i % int(len(dataloader) / 10 + 1) == 0 and opt.verbal:
            print('[%d/%d][%d/%d] Loss: %.4f' % (epoch, opt.niter, i, len(dataloader), loss.data[0]))

    print("Saving model................")
    torch.save(net, opt.model_path)