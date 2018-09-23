import numpy as np
import os
from os import listdir
from os.path import isfile, join
import collections
import re
from tqdm import trange
from tqdm import *
import random

def load_graphs_from_file(file_name):
    data_list = []
    edge_list = []
    target_list = []
    
    with open(file_name,'r') as f:
        for line in f:
            if len(line.strip()) == 0:
                data_list.append([edge_list,target_list])
                edge_list = []
                target_list = []
            else:
                digits = []
                line_tokens = line.split(" ")

                if line_tokens[0] == "?":
                    for i in range(1, len(line_tokens)):
                        
                        digits.append(int(line_tokens[i]))
                    target_list.append(digits)
                else:
                    for i in range(len(line_tokens)):
                        digits.append(int(line_tokens[i]))
                    edge_list.append(digits)
    # print(data_list)
    return data_list

def load_program_graphs_from_directory(directory,is_train=True,n_classes=3, data_percentage=1):
    data_list = []
    if is_train == True:
            dir_path =  os.path.join(directory,"train")
    else:
            dir_path =  os.path.join(directory,"test")
    filenames = []
    for f in listdir(dir_path):
      if isfile(join(dir_path, f)):
         filenames.append(f)
    int_filenames = [int(re.search('_(.*).txt', x).group(1)) for x in filenames]
    ordered_filenames = sorted(int_filenames)
    lookup = {}
    for i in range(1, 1+len(ordered_filenames)):
        if is_train == True:
           lookup[i] = join(dir_path, "train_%s.txt" % str(ordered_filenames[i-1]))
        else:
           lookup[i] = join(dir_path, "test_%s.txt" % str(ordered_filenames[i-1]))
    for i in trange(1, 1+n_classes):
        path = lookup[i]
        # print(path)
        label = i
        data_list_class_i = []
        edge_list_class_i = []
        target_list_class_i = []

        with open(path,'r') as f:
            for line in f: 
                if len(line.strip()) == 0:

                    data_list_class_i.append([edge_list_class_i,target_list_class_i])
                    edge_list_class_i = []
                    target_list_class_i = []
                else:
                    digits = []
                    line_tokens = line.split(" ")
                    
                    if line_tokens[0] == "?":

                        target_list_class_i.append([label])
                    else:
                        for j in range(len(line_tokens)):
                            digits.append(int(line_tokens[j]))
                        edge_list_class_i.append(digits)

        if data_percentage != 1:
            slicing = int(len(data_list_class_i)*data_percentage)
            data_list_class_i = data_list_class_i[:slicing]

        data_list.extend(data_list_class_i)

    return data_list

def find_max_edge_id(data_list):
    max_edge_id = 0
    for data in data_list:
        edges = data[0]
        for item in edges:
            if item[1] > max_edge_id:
                max_edge_id = item[1]
    return max_edge_id

def find_max_node_id(data_list):
    max_node_id = 0
    for data in data_list:
        edges = data[0]
        for item in edges:
            if item[0] > max_node_id:
                max_node_id = item[0]
            if item[2] > max_node_id:
                max_node_id = item[2]
    return max_node_id
    # return 48

def find_max_task_id(data_list):
    max_node_id = 0
    for data in data_list:
        targe = data[1]
        for item in targe:
            if item[0] > max_node_id:
                max_node_id = item[0]
    return max_node_id

def split_set(data_list,num):
    n_examples = len(data_list)
    idx = range(n_examples)
    train = idx[:num]
    val = idx[-num:]
    return np.array(data_list)[train],np.array(data_list)[val]

def split_set_by_percentage(data_list,percentage):
    n_examples = len(data_list)
    train_num = int(n_examples * percentage)

    idx = range(n_examples)
    train = idx[:train_num]
    val = idx[train_num:n_examples]
    return np.array(data_list)[train],np.array(data_list)[val]

def data_convert(data_list, n_annotation_dim):
    n_nodes = find_max_node_id(data_list)
    n_tasks = find_max_task_id(data_list)
    task_data_list = []
    for i in range(n_tasks):
        task_data_list.append([])

    for item in data_list:
        edge_list = item[0]
        target_list = item[1]
        for target in target_list:
            task_type = target[0]
            task_output = target[-1]
            annotation = np.zeros([n_nodes, n_annotation_dim])
            annotation[target[1]-1][0] = 0
            task_data_list[task_type-1].append([edge_list, annotation, task_output])
    return task_data_list

def convert_program_data(data_list, n_annotation_dim, n_nodes):
    # n_nodes = find_max_node_id(data_list)
    class_data_list = []
 
    for item in data_list:
        edge_list = item[0]
        target_list = item[1]
        for target in target_list:
            task_type = target[0]
            task_output = target[-1]
            annotation = np.zeros([n_nodes, n_annotation_dim])   
            for edge in edge_list:
                src_idx = edge[0]
                
                # print(src_idx)
                annotation[src_idx-1][0] = 1
          
            class_data_list.append([edge_list, annotation, task_output])
    return class_data_list

def convert_program_data_into_group(data_list, n_annotation_dim, n_nodes, n_classes):
    class_data_list = []
    
    for i in range(n_classes):
        class_data_list.append([])
   
    for item in data_list:
        edge_list = item[0]
        target_list = item[1]
        for target in target_list:
            class_output = target[-1]
            annotation = np.zeros([n_nodes, n_annotation_dim])   
            for edge in edge_list:
                src_idx = edge[0]
                # print(src_idx)
                annotation[src_idx-1][0] = 1
            # print(class_output)
            class_data_list[class_output-1].append([edge_list, annotation, class_output])
    return class_data_list

def create_adjacency_matrix(edges, n_nodes, n_edge_types):
    a = np.zeros([n_nodes, n_nodes * n_edge_types * 2])
    
    for edge in edges:
        src_idx = edge[0]
        e_type = edge[1]
        tgt_idx = edge[2]
       
        a[tgt_idx-1][(e_type - 1) * n_nodes + src_idx - 1] =  1
        a[src_idx-1][(e_type - 1 + n_edge_types) * n_nodes + tgt_idx - 1] =  1
    return a


class bAbIDataset():
    """
    Load bAbI tasks for GGNN

    Example data:
        1 1 2
        2 1 3
        ? 1 2 1
    Explaination of last line : ? 1 2 1 
    ==> question_types = 2
    ==> task_type = 1
    ==> task_output = 1
    """

    def __init__(self, path, question_types, is_train):
       
        all_data = load_graphs_from_file(path)
      
        self.n_edge_types =  find_max_edge_id(all_data)
        self.n_tasks = find_max_task_id(all_data)
        self.n_node = find_max_node_id(all_data)
        all_task_train_data, all_task_val_data = split_set(all_data,50)
       
        if is_train:
            all_task_train_data = data_convert(all_task_train_data, 1)

            self.data = all_task_train_data[question_types]

        else:
            all_task_val_data = data_convert(all_task_val_data, 1)
            self.data = all_task_val_data[question_types]

    def __getitem__(self, index):
        # print(self.data[index])
        
        am = create_adjacency_matrix(self.data[index][0], self.n_node, self.n_edge_types)
        annotation = self.data[index][1]
        target = self.data[index][2] - 1
        return am, annotation, target

    def __len__(self):
        return len(self.data)

class bAbIDataset2():
   
    def __init__(self, path, is_train, n_classes=3,data_percentage=1):
       
        all_data = load_program_graphs_from_directory(path,is_train,n_classes,data_percentage)
        all_data = np.array(all_data)[0:len(all_data)]
       
        if is_train == True:
            print("Number of all training data : " + str(len(all_data)))
        else:
            print("Number of all testing data : " + str(len(all_data)))
        self.n_edge_types =  find_max_edge_id(all_data)
        # print("Edge types : " + str(self.n_edge_types))
        self.n_tasks = find_max_task_id(all_data)
        potential_max_node = find_max_node_id(all_data)
        print("Potential max node id : " + str(potential_max_node))
        self.n_node = 60
        
        all_data = convert_program_data(all_data,1, self.n_node)

        
        self.data = all_data
     
    def __getitem__(self, index):
        # print(index)
        # print(self.data)
        # print(self.data[index])
        # print(self.data[index][0])
        # print(self.data[index][1])
        # print(self.data[index])
        am = create_adjacency_matrix(self.data[index][0], self.n_node, self.n_edge_types)
        annotation = self.data[index][1]
        target = self.data[index][2] - 1
        # print("Target : " + str(target))
        return am, annotation, target

    def __len__(self):
        return len(self.data)


class CrossLingualProgramData():
   
    def __init__(self, left_path, right_path, is_train, n_classes=3, data_percentage=1):
       
        left_all_data = load_program_graphs_from_directory(left_path,is_train,n_classes,data_percentage)
        right_all_data = load_program_graphs_from_directory(right_path,is_train,n_classes,data_percentage)

        left_all_data = np.array(left_all_data)[0:len(left_all_data)]
        right_all_data = np.array(right_all_data)[0:len(right_all_data)]
       
        if is_train == True:
            print("Number of all left training data : " + str(len(left_all_data)))
            print("Number of all right training data : " + str(len(right_all_data)))
        else:
            print("Number of all left testing data : " + str(len(left_all_data)))
            print("Number of all right testing data : " + str(len(right_all_data)))

        self.n_edge_types =  find_max_edge_id(left_all_data)

        # self.n_node = find_max_node_id(all_data)
        self.n_node = 63
        max_left_node = find_max_node_id(left_all_data)
        max_right_node = find_max_node_id(right_all_data)
        print("Left max node id : " + str(max_left_node))
        print("Right max node id : " + str(max_right_node))

        left_all_data_by_classes = convert_program_data_into_group(left_all_data,1, self.n_node, n_classes)

        right_all_data_by_classes = convert_program_data_into_group(right_all_data,1, self.n_node, n_classes)

        pairs_1 = []
        pairs_0 = []

        for i, left_class in tqdm(enumerate(left_all_data_by_classes)):
            right_class = right_all_data_by_classes[i]

            remaining_right_class = []

            for j, other_right_class in enumerate(right_all_data_by_classes):
                if j != i:
                    remaining_right_class.extend(other_right_class)

            if len(left_class) > len(right_class):
                left_class = left_class[:len(right_class)]
            
            for k, left_data_point in enumerate(left_class):
                righ_data_point = right_class[k]
                pairs_1.append((left_data_point,righ_data_point))
                pairs_0.append((left_data_point, random.choice(remaining_right_class)))

        print("Number of all 1 pairs data : " + str(len(pairs_1)))
        print("Number of all 0 pairs data : " + str(len(pairs_0)))
        data = []
        data.extend(pairs_1)
        data.extend(pairs_0)
        random.shuffle(data)
        self.data = data

     
    def __getitem__(self, index):
        
        left_data_point = self.data[index][0]
        right_data_point = self.data[index][1]

        left_am = create_adjacency_matrix(left_data_point[0], self.n_node, self.n_edge_types)
        right_am = create_adjacency_matrix(right_data_point[0], self.n_node, self.n_edge_types)

        left_annotation = left_data_point[1]
        right_annotation = right_data_point[1]

        if left_data_point[2] == right_data_point[2]:
            target = 1.0
        else:
            target = 0.0

        return (left_am,right_am), (left_annotation,right_annotation), target

    def __len__(self):
        return len(self.data)

