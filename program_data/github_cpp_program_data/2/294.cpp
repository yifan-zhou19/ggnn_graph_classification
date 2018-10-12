#include "skiplist.h"


skiplist::skiplist()
{
}
skiplist::~skiplist()
{
}
skiplistnode *sklistCreateNode(int level, double score, robj *obj)
{
	skiplistnode *sknode = (skiplistnode*) operator new(sizeof(*sknode) + level*sizeof(skilistLevel));
	sknode->obj = obj;
	sknode->score = score;
	return sknode;
}
skiplist * sklistCreate()
{
	skiplist *sl = new skiplist();
	//��ʼ��
	sl->length = 0;
	sl->level = 0;
	sl->tail = NULL;
	sl->header = sklistCreateNode(SKIPLIST_MAXLEVEL, 0, NULL);
	for (int i = 0; i < SKIPLIST_MAXLEVEL - 1; i++)
	{
		sl->header->level[i].forward = NULL;
		sl->header->level[i].span = NULL;
	}
	sl->header->backward = NULL;
	return sl;
}
int getrandomLevel()
{
	int level = 1;
	srand((unsigned)time(NULL));
	while (rand() % 2)
		level++;
	return level < SKIPLIST_MAXLEVEL ? level : SKIPLIST_MAXLEVEL;

}
//�ַ����Ƚ�
int comparestring(void *str1, void *str2)
{
	//str1 < str2 �򷵻�-1�������򷵻�1�����򷵻�0
	return 0;
}
skiplistnode *sklistInsert(skiplist *sl, double score, robj *obj)
{
	skiplistnode *update[SKIPLIST_MAXLEVEL], *node;
	unsigned int rank[SKIPLIST_MAXLEVEL];
	int i, level,cmpresult;
	//����updateָ������
	//2:��������������
	for (i = sl->level - 1; i >= 0; i--)
	{
		node = sl->header->level[i].forward;
		cmpresult = comparestring(node->obj, obj);
		//node��ΪNULL ���߷�����ͬ��obj ��С
		while (node && (node->score < score || (node->score < score&&cmpresult < 0)))
		{
			node = node->level[i].forward;
			rank[i] = i == (sl->level - 1) ? 0 : rank[i + 1];
		}
		//��ÿһ���ҵ��ĵĲ���λ�ø��µ�update����
		update[i] = node;
	}
	//�������ɵĲ����ȵ�ǰ��level������
	level = getrandomLevel();
	if (level > sl->level)
	{
		for (i = sl->level; i < level; i++)
		{
			update[i] = sl->header;
			update[i]->level[i].span = sl->length;
		}
		sl->level = level;
	}
	for (i = 0; i < level; i++)
	{
		node->level[i].forward = update[i]->level[i].forward;
		update[i]->level[i].forward = node;
		node->level[i].span = update[i]->level[i].span - (rank[0] - rank[i]);

		// �����½ڵ����֮����;�ڵ�� span ֵ
		// ���е� +1 ��������½ڵ�
		update[i]->level[i].span = (rank[0] - rank[i]) + 1;
	}
	for (i = level; i < sl->level; i++) {
		update[i]->level[i].span++;
	}
	node->backward = (update[0] == sl->header) ? NULL : update[0];
	if (node->level[0].forward)
		node->level[0].forward->backward = node;
	else
		sl->tail = node;

	// ��Ծ��Ľڵ������һ
	sl->length++;
	return node;
}
void sklistDeleteNode(skiplist *sl, skiplistnode *sknode)
{
	//����update����
	skiplistnode *update[SKIPLIST_MAXLEVEL], *node = NULL;
	unsigned int rank[SKIPLIST_MAXLEVEL];
	int i, level, cmpresult;
	//����updateָ������
	//2:��������������
	for (i = sl->level - 1; i >= 0; i--)
	{
		node = sl->header->level[i].forward;
		cmpresult = comparestring(node->obj, sknode->obj);
		//node��ΪNULL ���߷�����ͬ��obj ��С
		while (node && (node->score < sknode->score || (node->score < sknode->score&&cmpresult < 0)))
		{
			node = node->level[i].forward;
			rank[i] = i == (sl->level - 1) ? 0 : rank[i + 1];
		}
		//��ÿһ���ҵ��ĵĲ���λ�ø��µ�update����
		update[i] = node;
	}
	node = node->level[0].forward;
	if (node &&sknode->score == node->score&&comparestring(node->obj, sknode->obj) == 0)
	{
		//ɾ���ڵ�
		for (i = sl->level - 1; i >= 0; i--)
		{
			
			if (update[i]->level[i].forward == node) {
				update[i]->level[i].span += node->level[i].span - 1;
				update[i]->level[i].forward = node->level[i].forward;
			}
			else {
				update[i]->level[i].span -= 1;
			}
		}
		//forwardָ�벻Ϊ��
		if (node->level[0].forward)
		{
			node->level[0].forward->backward = node->backward;
		}
		else
		{
			//��Ϊ�գ���ɾ���������һ���ڵ�
			sl->tail = node->backward;
		}
		sl->length--;
		//�����Ƿ�Ҫ��1;
		while (sl->level > 1 && sl->header->level[sl->level - 1].forward == NULL)
			sl->level--;
	}
}

void sklistFree(skiplist *sl)
{
		skiplistnode *node = sl->header->level[0].forward, *next;
		// �ͷű�ͷ
		delete sl->header;
		// �ͷű������нڵ�
		// T = O(N)
		while (node) {
			next = node->level[0].forward;
			delete node;
			node = next;
		}
		// �ͷ���Ծ��ṹ
		delete sl;
}

