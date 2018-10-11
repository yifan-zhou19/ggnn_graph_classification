
#include "suffixtree.h" 
using namespace std; 
/****************************************************************************
*****************************************************************************
*****************************************************************************
*****************************************************************************
****************************************************************************/
void initial()
{
	cout<<"\n\n\n\n\n\t\t\t ��ӭ����!"<<endl;//��ӭ���� 
    cout<<"\n\n\n\t\t\t ��׺����������"<<endl;//׼����ʼ
    getch(); 
    system("cls");
}
void inout()
{
	SuffixTree *a=new SuffixTree();
	string b,x;
	int fl=1,n=1;
	
	do
	{
		
		if(fl==1)
		{
			if(n==1)
			{
				cout<<"\n������ԭ�ַ���:";
			    cin>>b;//abbbabbbabbbd
			    //b="ababaaabbbabbbba$";
			    cout<<"ԭ�ַ���Ϊ: "<<b<<"\n";//vvhhhvvhhv$hhvh//lkjjlllllj%
			    a->build(b);
			    n=0;
			    cout<<"0.�˳�  1.���������ַ���  2.׷���ַ���  3.��ʾ��׺��  4.�ַ�������  5.��ظ��ַ�������  6.��ʾ�ַ���  7.��ʾҪ��  8.����\n"; 
			}
			else
			{
				//buildstep=0;
				cout<<"�����������ַ���:";
				cin>>b;
				cout<<"�����ַ���Ϊ: "<<b<<endl;
				a->~SuffixTree();
				a=new SuffixTree();
				a->build(b);
			}
			
		}
		else if(fl==2)
		{
		 
			cout<<"������׷���ַ���:";
			cin>>b;
			b=a->getallstr()+b;
			cout<<b<<"\n"; 
			a->~SuffixTree();
			a->build(b);
			cout<<"�����ַ���Ϊ: "<<a->getallstr()<<endl;
		} 
	    else if(fl==3)
	    {
	    	cout<<"���ַ����ĺ�׺��Ϊ:"<<endl;
			a->showtree();
			cout<<"0.�˳�  1.���������ַ���  2.׷���ַ���  3.��ʾ��׺��  4.�ַ�������  5.��ظ��ַ�������  6.��ʾ�ַ���  7.��ʾҪ��  8.����\n"; 
		}
	    else if(fl==4)
	    {
	    	cout<<"����������Ҫ���ҵ��ַ���:";
			cin>>x;
			cout<<"Ҫ���ҵ��ַ���Ϊ: "<<x<<endl;
			bool signal=a->findstr(x);
			cout<<"1.���ҽ��:";
			if(signal==true)
	            cout<<"�ҵ�";
	        else
	            cout<<"δ�ҵ�";
	        cout<<"\n";
	        int y=a->count(x);
	        cout<<"2.Ƶ�ʲ���:"; 
	        cout<<"�ַ���\""<<x<<"\"���ֵĴ���Ϊ"<<y<<"��"; 
	        cout<<endl;
		}
	    else if(fl==5)
	    {
	    	string temp=a->findlongeststr();
	        cout<<"��ظ��ַ�������:"; 
	        if(temp!="")
	            cout<<"��ظ��ַ���(֮һ)Ϊ\""<<temp<<"\"\n";
	        else
	            cout<<"û����ظ��ַ���\n";
		}
		else if(fl==6)
		    cout<<"ԭ�ַ���Ϊ: "<<a->getallstr()<<endl;
		else if(fl==7)
		    cout<<"0.�˳�  1.���������ַ���  2.׷���ַ���  3.��ʾ��׺��  4.�ַ�������  5.��ظ��ַ�������  6.��ʾ�ַ���  7.��ʾҪ��  8.����\n"; 
        else if(fl==8)
        {
        	system("cls"); 
        	cout<<"\n�ַ���Ϊ: "<<a->getallstr()<<endl;
        	cout<<"0.�˳�  1.���������ַ���  2.׷���ַ���  3.��ʾ��׺��  4.�ַ�������  5.��ظ��ַ�������  6.��ʾ�ַ���  7.��ʾҪ��  8.����\n"; 
		}
		     
		else
            cout<<"������Ч������������\n";
		cin>>fl;
    }while(fl!=0);
    cout<<"���˳�\n"; 
}
int main()
{
	initial();
	inout(); 
	
	system("pause"); 
	return 0;
}//fdasjojiofdasjifodajifaeojifadsjio$
//fdjojiofdjifojifajif$
//fdjojiofdjifojifaji$
