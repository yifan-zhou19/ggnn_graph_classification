import argparse
import random

import torch
import torch.nn as nn
import torch.optim as optim

from utils.model import GGNN
from utils.model import ClassPrediction
from utils.train_ggnn import train
from utils.test_ggnn import test
from utils.data.dataset import MonoLanguageProgramData
from utils.data.dataloader import bAbIDataloader
import os

parser = argparse.ArgumentParser()
parser.add_argument('--workers', type=int, help='number of data loading workers', default=2)
parser.add_argument('--train_batch_size', type=int, default=32, help='input batch size')
parser.add_argument('--test_batch_size', type=int, default=32, help='input batch size')
parser.add_argument('--state_dim', type=int, default=5, help='GGNN hidden state size')
parser.add_argument('--n_steps', type=int, default=10, help='propogation steps number of GGNN')
parser.add_argument('--niter', type=int, default=150, help='number of epochs to train for')
parser.add_argument('--lr', type=float, default=0.01, help='learning rate')
parser.add_argument('--cuda', action='store_true', help='enables cuda')
parser.add_argument('--verbal', type=bool, default=True, help='print training info or not')
parser.add_argument('--manualSeed', type=int, help='manual seed')
parser.add_argument('--n_classes', type=int, default=104, help='manual seed')
parser.add_argument('--directory', default="program_data/cpp_babi_format_3", help='program data')
parser.add_argument('--model_path', default="model/model.ckpt", help='path to save the model')
parser.add_argument('--n_hidden', type=int, default=50, help='number of hidden layers')
parser.add_argument('--size_vocabulary', type=int, default=59, help='maximum number of node types')
parser.add_argument('--is_training_ggnn', type=bool, default=True, help='Training GGNN or BiGGNN')
parser.add_argument('--training', action="store_true",help='is training')
parser.add_argument('--testing', action="store_true",help='is testing')
parser.add_argument('--training_percentage', type=float, default=1.0 ,help='percentage of data use for training')
parser.add_argument('--log_path', default="logs/ggnn" ,help='percentage of data use for training')

opt = parser.parse_args()
print(opt)

if not os.path.isdir("model"):
    os.mkdir("model")

if opt.manualSeed is None:
    opt.manualSeed = random.randint(1, 10000)
print("Random Seed: ", opt.manualSeed)
random.seed(opt.manualSeed)
torch.manual_seed(opt.manualSeed)

if opt.cuda:
    torch.cuda.manual_seed_all(opt.manualSeed)

# This part is the implementation to illustrate Graph-Level output from program data
def main(opt):
    train_dataset = MonoLanguageProgramData(opt.size_vocabulary, opt.directory, True, opt.n_classes, opt.training_percentage)
    train_dataloader = bAbIDataloader(train_dataset, batch_size=opt.train_batch_size, \
                                      shuffle=True, num_workers=2)

    test_dataset = MonoLanguageProgramData(opt.size_vocabulary, opt.directory, False, opt.n_classes)
    test_dataloader = bAbIDataloader(test_dataset, batch_size=opt.test_batch_size, \
                                     shuffle=True, num_workers=2)

    opt.annotation_dim = 1  # for bAbI
    opt.n_edge_types = train_dataset.n_edge_types
    opt.n_node = train_dataset.n_node

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
            test(test_dataloader, net, criterion, optimizer, opt)

    if opt.testing:
        test(test_dataloader, net, criterion, optimizer, opt)


if __name__ == "__main__":
    main(opt)

