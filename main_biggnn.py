import argparse
import random

import torch
import torch.nn as nn
import torch.optim as optim

from utils.model import GGNN
from utils.model import BiGGNN
from utils.model import ContrastiveLoss

from utils.train_biggnn import train
from utils.test_biggnn import test
from utils.data.dataset import CrossLingualProgramData
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
parser.add_argument('--left_directory', default="program_data/cll_github_cpp_babi_format_Sep-29-2018-0000006", help='left encoded program data')
parser.add_argument('--right_directory', default="program_data/cll_github_java_babi_format_Sep-29-2018-0000006", help='right encoded program data')
parser.add_argument('--model_path', default="model/model.ckpt", help='path to save the model')
parser.add_argument('--n_hidden', type=int, default=50, help='number of hidden layers')
parser.add_argument('--size_vocabulary', type=int, default=60, help='maximum number of node types')
parser.add_argument('--is_training_ggnn', type=bool, default=False, help='Training GGNN or BiGGNN')
parser.add_argument('--training', action="store_true",help='is training')
parser.add_argument('--testing', action="store_true",help='is testing')
parser.add_argument('--loss', type=int, default=0 ,help='1 is contrastive loss, 0 is cross entropy loss')



opt = parser.parse_args()
print(opt)
if opt.manualSeed is None:
    opt.manualSeed = random.randint(1, 10000)
print("Random Seed: ", opt.manualSeed)
random.seed(opt.manualSeed)
torch.manual_seed(opt.manualSeed)

if opt.loss == 1:
    print("Training Bi-GGNN with contrastive loss................")
if opt.loss == 0:
    print("Training Bi-GGNN with cross entropy loss................")
# model_path = "model/bi_ggnn_%s-%s-%d.ckpt" % (opt.left_directory, opt.right_directory, opt.n_classes)
# opt.model_path = model_path

if opt.cuda:
    torch.cuda.manual_seed_all(opt.manualSeed)

def main(opt):
    opt.data_percentage = 1
    print("Loading data...............")
    train_dataset = CrossLingualProgramData(opt.size_vocabulary, opt.left_directory,opt.right_directory, True, opt.loss, opt.n_classes,opt.data_percentage)
    train_dataloader = bAbIDataloader(train_dataset, batch_size=opt.train_batch_size, \
                                      shuffle=True, num_workers=2)


    test_dataset = CrossLingualProgramData(opt.size_vocabulary, opt.left_directory,opt.right_directory, False,opt.loss, opt.n_classes,opt.data_percentage)
    test_dataloader = bAbIDataloader(train_dataset, batch_size=opt.train_batch_size, \
                                      shuffle=True, num_workers=2)

    opt.annotation_dim = 1  # for bAbI
    opt.n_edge_types = train_dataset.n_edge_types
    opt.n_node = train_dataset.n_node
    # print("Max node : " + str(opt.n_node))

    if os.path.isfile(opt.model_path):
        print("Using the saved model....")
        net = torch.load(opt.model_path)
    else:
        net = BiGGNN(opt)
        net.double()

    if opt.loss == 1:
        criterion = ContrastiveLoss()
    else:
        criterion = nn.CrossEntropyLoss()

    if opt.cuda:
        net.cuda()
        criterion.cuda()
        
    optimizer = optim.Adam(net.parameters(), lr=opt.lr)

    if opt.training:
        for epoch in range(0, opt.niter):
            train(epoch, train_dataloader, net, criterion, optimizer,  opt)
            test(test_dataloader, net, criterion, optimizer, opt)

    if opt.testing:
        test(test_dataloader, net, criterion, optimizer, opt)



if __name__ == "__main__":
    main(opt)

