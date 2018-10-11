//ð������
//1.ÿ����ǰ��һ��������ͽ����� 
//2.һ��֮��������+1�� 
void Bubblesort1(ElementType A[],int N)
{
	int i=0,j=0;
	for(i=N-1;i>=0;i--)
	{
		for(j=0;j<i-1;j++)
		{
			if(A[j]<=A[j+1])  break;
			else swap(A[j],A[j+1]);
		}		
	} 
} 
//�Ľ���
//��ʱ�����ܺã���һ��ԭ��������
//��ס���һ��swap��λ�ã��´�ֱ������˳�򲿷�
 void Bubblesort(ElementType A[],int N)
{
	int i=0,j=0;
	int flag=N-1; //�������һ�ν�����λ��--�����±� 
	for(i=N-1;i>=0;i--)
	{
		for(j=0;j<flag;j++) 
		{
			if(A[j]<=A[j+1])  break;
			else 
			{
				swap(A[j],A[j+1]);
				flag=j;
			}
		}		
	} 
} 
 














 
