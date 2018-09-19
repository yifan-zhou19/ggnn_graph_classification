import argparse
import random

import torch
import torch.nn as nn
import torch.optim as optim

from model import GGNN
from utils.train import train
from utils.test import test
from utils.data.dataset import bAbIDataset
from utils.data.dataset import bAbIDataset2
from utils.data.dataloader import bAbIDataloader
import os

parser = argparse.ArgumentParser()
parser.add_argument('--task_id', type=int, default=4, help='bAbI task id')
parser.add_argument('--question_id', type=int, default=0, help='question types')
parser.add_argument('--workers', type=int, help='number of data loading workers', default=2)
parser.add_argument('--train_batch_size', type=int, default=32, help='input batch size')
parser.add_argument('--test_batch_size', type=int, default=32, help='input batch size')
parser.add_argument('--state_dim', type=int, default=5, help='GGNN hidden state size')
parser.add_argument('--n_steps', type=int, default=5, help='propogation steps number of GGNN')
parser.add_argument('--niter', type=int, default=150, help='number of epochs to train for')
parser.add_argument('--lr', type=float, default=0.01, help='learning rate')
parser.add_argument('--cuda', action='store_true', help='enables cuda')
parser.add_argument('--verbal', type=bool, default=True, help='print training info or not')
parser.add_argument('--manualSeed', type=int, help='manual seed')
parser.add_argument('--n_classes', type=int, default=104, help='manual seed')
parser.add_argument('--directory', default="program_data/babi_format", help='program data')
parser.add_argument('--model_path', default="model/model.ckpt", help='path to save the model')
parser.add_argument('--n_hidden', type=int, default=100, help='number of hidden layers')
parser.add_argument('--training', action="store_true",help='is training')
parser.add_argument('--testing', action="store_true",help='is testing')



opt = parser.parse_args()
print(opt)

if not os.path.isdir("model"):
    os.mkdir("model")

if opt.manualSeed is None:
    opt.manualSeed = random.randint(1, 10000)
print("Random Seed: ", opt.manualSeed)
random.seed(opt.manualSeed)
torch.manual_seed(opt.manualSeed)

opt.dataroot = 'babi_data/processed_1/train/%d_graphs.txt' % opt.task_id

if opt.cuda:
    torch.cuda.manual_seed_all(opt.manualSeed)

def main(opt):
    train_dataset = bAbIDataset(opt.dataroot, opt.question_id, True)
    train_dataloader = bAbIDataloader(train_dataset, batch_size=opt.train_batch_size, \
                                      shuffle=True, num_workers=0)

    test_dataset = bAbIDataset(opt.dataroot, opt.question_id, False)
    test_dataloader = bAbIDataloader(test_dataset, batch_size=opt.test_batch_size, \
                                     shuffle=True, num_workers=2)

    opt.annotation_dim = 1  # for bAbI
    opt.n_edge_types = train_dataset.n_edge_types
    opt.n_node = train_dataset.n_node

    net = GGNN(opt)
    net.double()
    

    criterion = nn.CrossEntropyLoss()

    if opt.cuda:
        net.cuda()
        criterion.cuda()

    optimizer = optim.Adam(net.parameters(), lr=opt.lr)

    for epoch in range(0, opt.niter):
        train(epoch, train_dataloader, net, criterion, optimizer, opt)
        test(test_dataloader, net, criterion, optimizer, opt)


# This part is the implementation to illustrate Graph-Level output from program data
def main2(opt):
    opt.data_percentage = 1
    train_dataset = bAbIDataset2(opt.directory, True, opt.n_classes,opt.data_percentage)
    train_dataloader = bAbIDataloader(train_dataset, batch_size=opt.train_batch_size, \
                                      shuffle=True, num_workers=2)

    test_dataset = bAbIDataset2(opt.directory, False, opt.n_classes)
    test_dataloader = bAbIDataloader(test_dataset, batch_size=opt.test_batch_size, \
                                     shuffle=True, num_workers=2)

    opt.annotation_dim = 1  # for bAbI
    opt.n_edge_types = train_dataset.n_edge_types
    opt.n_node = train_dataset.n_node
    # print("Max node : " + str(opt.n_node))
    if os.path.isfile(opt.model_path):
        print("Using the saved model....")
        net = torch.load(opt.model_path)
    else:
        net = GGNN(opt)
        net.double()
    

    criterion = nn.CrossEntropyLoss()

    if opt.cuda:
        net.cuda()
        criterion.cuda()

    optimizer = optim.Adam(net.parameters(), lr=opt.lr)

    if opt.training:
        for epoch in range(0, opt.niter):
            train(epoch, train_dataloader, net, criterion, optimizer, opt)
    # if opt.testing:
            test(test_dataloader, net, criterion, optimizer, opt)



if __name__ == "__main__":
    main2(opt)

