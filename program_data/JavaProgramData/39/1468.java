public class student
{
  public String name = new String(new char[20]);
  public int qimo;
  public int zongping;
  public char ganbu;
  public char xibu;
  public int lunwen;
  public int total;
  public student next;
} //????????

package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static int N;

	public static void Main()
	{
	  student head;
	  student pmax;
	  student p;
	  student p1;
	  student p2;
	  int n;
	  int max = 0;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  N = Integer.parseInt(tempVar);
	  }



	/*
	  p1=p2=(struct student*)malloc(LEN);
	  scanf("%s %d %d %c %c %d",p1->name,&p1->qimo,&p1->zongping,&p1->ganbu,&p1->xibu,&p1->lunwen);
	  p1->total=0;
	  
	  p1->next=NULL;  //???p1->next???
	  head=p1;
	  
	  for(n=0;n<N-1;n++)
	  {
	   	p2=p1;
		p1=(struct student*)malloc(LEN);
	    scanf("%s %d %d %c %c %d",&p1->name,&p1->qimo,&p1->zongping,&p1->ganbu,&p1->xibu,&p1->lunwen);
		p1->total=0;
		p1->next=NULL;
		p2->next=p1;
	  }
	  */



	  for (n = 0;n < N;n++)
	  {


		p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.qimo = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.zongping = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.ganbu = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p1.xibu = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p1.lunwen = Integer.parseInt(tempVar7);
		}
		p1.total = 0;
		p1.next = null;

		if (n == 0)
		{
			head = p1;
		}
		else
		{
			p2.next = p1;
		}
	  }




	   for (max = 0,p = pmax = head;p != null;p = p.next)
	   {
		if (p.qimo > 80 && p.lunwen >= 1)
		{
			p.total = p.total + 8000;
		}
		if (p.qimo > 85 && p.zongping > 80)
		{
			p.total = p.total + 4000;
		}
		if (p.qimo > 90)
		{
			p.total = p.total + 2000;
		}
		if (p.qimo > 85 && p.xibu == 'Y')
		{
			p.total = p.total + 1000;
		}
		if (p.zongping > 80 && p.ganbu == 'Y')
		{
			p.total = p.total + 850;
		}

		sum = sum + p.total;
		if (max < p.total)
		{
			max = p.total;
			pmax = p;
		}
	   }





	 // head=creat();
	  //pmax=cal(head);
	  System.out.printf("%s\n%d\n%d\n",pmax.name,pmax.total,sum);
	}


}

