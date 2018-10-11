#include "skiplist.h"

skiplist::~skiplist()
{
	skipnode * p = head;
	skipnode * q;
	while (p)                                        //����ɾ��ÿ���ڵ�
	{
		q = p;
		p = p->next_nodes[0];
		delete q;
	}
}

skipnode * skiplist::search(double k)
{
	cout << "��������ݣ�" << endl;
	show_list();
	skipnode * p, *q = nullptr;
	p = head;
	int i;
	for (i = num_floor; i >= 0; i--)                   //�ҵ�ÿһ��Ĳ���λ��
	{
		cout << "�ڵ�" << i << "����ҵĹ���";
		while ((q = p->next_nodes[i]) && q->key < k)        //�ڵ�pֵʼ��С��k��qΪ�ڵ�p��һ���ϵ���һ���ڵ�
		{
			p = q;
			cout << p->key << "   ";
		}
		cout << endl;
		if (q && q->key == k)                         //һ�ֲ��ҽ�����������Ƿ�ɹ�
		{
			cout << "���ҳɹ�! "<< k << "���ڽڵ���ڵ���߲����ǣ�" << i << endl << endl;
			return q;
		}
	}
	cout << "����ʧ�ܣ�" << endl << endl;
	return nullptr;
}

skipnode * position[MAX_FLOOR];
bool skiplist::insert(double k)
{
	int i, num_f = random_floor();                      //num_fΪ������ɵ�Ҫ����ڵ�Ĳ���
	skipnode * node_insert = new skipnode(k);
	if (!node_insert) return false;
	if (num_f > num_floor)                              //����ڵ�Ĳ�������������ǰ����,ֱ�Ӳ��뵽head���
	{
		for (i = num_floor + 1; i <= num_f; i++)
		{
			position[i] = head;
		}
	}
	skipnode * p = head;
	skipnode * q;
	for (i = num_floor ; i >= 0; i--)                   //�ҵ�ÿһ��Ĳ���λ��
	{
		while ((q = p->next_nodes[i]) && q->key < k)        //�ڵ�pֵʼ��С��k��qΪ�ڵ�p��һ���ϵ���һ���ڵ�
		{
			p = q;
		}
		position[i] = p;
	}                                                       //forѭ��������pָ������ڵ�Ӧ�ò����λ��
	if (num_f > num_floor)                                  //�����������
	{
		num_floor = num_f;
	}
	for (i = 0; i <= num_f; i++)
	{
		node_insert->next_nodes[i] = position[i]->next_nodes[i];
		position[i]->next_nodes[i] = node_insert;
	}
	
	return true;
}

skipnode * remove_position[MAX_FLOOR];
bool skiplist::remove(double k)
{
	cout << "ɾ��ǰ��������ݣ�" << endl;
	show_list();

	int i;
	for (i = 0; i < MAX_FLOOR; i++)
	{
		remove_position[i] = nullptr;
	}
	skipnode * p, *q = nullptr;
	p = head;
	/*���ҵĹ���*/
	for (i = num_floor; i >= 0; i--)                   //�ҵ��ڵ���ÿһ���λ��
	{
		//cout << "�ڵ�" << i << "����ҵĹ���";
		while ((q = p->next_nodes[i]) && q->key < k)        //�ڵ�pֵʼ��С��k��qΪ�ڵ�p��һ���ϵ���һ���ڵ�
		{
			p = q;
		}
		remove_position[i] = p;
	}
	if (!q || (q->key != k))                             //������û��k
	{
		cout << "ɾ��ʧ�ܣ�������û�и�Ԫ��" << endl;
		return false;
	}

	/*ɾ���Ĺ���*/
	for (i = num_floor; i >= 0; i--)                   //�ҵ��ڵ���ÿһ���λ��
	{
		if (remove_position[i]->next_nodes[i]->key == k)
		{
			remove_position[i]->next_nodes[i] = q->next_nodes[i];
		}
		if (!head->next_nodes[i])
		{
			num_floor--;
		}
	}

	delete q;
	cout << "ɾ������������ݣ�" << endl;
	show_list();
	return true;
}

void skiplist::show_list()
{
	if (!(head->next_nodes[0]))
	{
		cout << "Skiplist is empty!" << endl;
		return;
	}
	skipnode * p;
	skipnode * q;
	int i;
	for (i = 0; i <= num_floor; i++, cout << endl)
	{
		p = head;
		cout << "��" << i << "�㣺" << "	";
		while (q = p->next_nodes[i])        //������i��
		{
			cout << "   " << q->key  << "   ";
			p = q;
		}
		
	}
}
