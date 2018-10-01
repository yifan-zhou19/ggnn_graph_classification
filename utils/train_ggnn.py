import torch
from torch.autograd import Variable
from tensorboardX import SummaryWriter

def train(epoch, dataloader, net, criterion, optimizer, opt, writer):
    # net.train()
    
    for i, (adj_matrix, target) in enumerate(dataloader, 0):
        net.zero_grad()

        # padding = torch.zeros(len(annotation), opt.n_node, opt.state_dim - opt.annotation_dim).double()
        # init_input = torch.cat((annotation, padding), 2)
        init_input = torch.zeros(len(adj_matrix), opt.n_node, opt.state_dim).double()

        if opt.cuda:
            init_input = init_input.cuda()
            adj_matrix = adj_matrix.cuda()
            # annotation = annotation.cuda()
            target = target.cuda()

        init_input = Variable(init_input)
        adj_matrix = Variable(adj_matrix)
        # annotation = Variable(annotation)
        target = Variable(target)
        output = net(init_input, adj_matrix)
        
        writer.add_graph(net, (init_input, adj_matrix), verbose=False)

        loss = criterion(output, target)
       
        loss.backward()
        optimizer.step()

        writer.add_scalar('loss', loss.data.item(), epoch)
       
        
        if i % int(len(dataloader) / 10 + 1) == 0 and opt.verbal:
            # print('[%d/%d][%d/%d] Loss: %.4f' % (epoch, opt.niter, i, len(dataloader), loss.data[0]))
            print('[%d/%d][%d/%d] Loss: %.4f' % (epoch, opt.niter, i, len(dataloader), loss.item()))

    torch.save(net, opt.model_path)