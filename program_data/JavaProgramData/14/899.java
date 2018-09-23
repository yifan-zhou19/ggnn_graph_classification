public class stu
{
  public int num;
  public int a;
  public int b;
  public int total;
  public int flag;
  public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

	  stu p;
	  stu head;
	  stu p1;
	  stu p2;
	  stu pmax;
	  int N;
	  int i;
	  int max;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  N = Integer.parseInt(tempVar);
	  }

	  //??
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p1 = p2 = (stu)malloc(LEN);
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p1.num = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  p1.a = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  p1.b = Integer.parseInt(tempVar4);
	  }
	  p1.total = p1.a + p1.b;
	  p1.flag = 0;
	  p1.next = null;

	  head = p1;


	  for (i = 0;i < N - 1;i++)
	  {
		p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(LEN);
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.num = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.a = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			p1.b = Integer.parseInt(tempVar7);
		}
		p1.total = p1.a + p1.b;
		p1.flag = 0;
		p1.next = null;

		p2.next = p1;
	  }

	  for (i = 0;i < 3;i++)
	  {

		for (p = head,max = 0;p != null;p = p.next)
		{
		   if (max < p.total && p.flag == 0)
		   {
			 max = p.total;
			 pmax = p;
		   }
		}
		pmax.flag = 1;
		System.out.printf("%d %d\n",pmax.num,pmax.total);
	  }


	 /*  p=head;
	  do
	  {
	    printf("%d*,",p->num);
		p=p->next;
	  }while(p!=NULL);*/

	 // for(i=0;i<3;i++)
	   //  printf("%d %d\n",pmax[i]->num,pmax[i]->total);




	}
}

