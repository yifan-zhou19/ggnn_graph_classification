public class shuju
{
	public String xh = new String(new char[20]);
	public String xm = new String(new char[20]);
	public char sex;
	public int age;
	public String fen = new String(new char[10]);
	public String dorm = new String(new char[20]);
	public shuju next;
}

package <missing>;

public class GlobalMembers
{
	public static int i = 0;

	public static shuju create()
	{

		shuju head;
		shuju p1;
		shuju p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (shuju)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.xh = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.xm = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p1.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.fen = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.dorm = tempVar6.charAt(0);
		}
		head = p1;
		while (true)
		{
			i++;
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (shuju)malloc(len);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.xh = tempVar7.charAt(0);
			}
			if (strcmp(p1.xh,"end") == 0)
			{
				p1 = null;
				break;
			}
			else
			{
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					p1.xm = tempVar8.charAt(0);
				}
				String tempVar9 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar9 != null)
				{
					p1.sex = tempVar9.charAt(0);
				}
				String tempVar10 = ConsoleInput.scanfRead(" ");
				if (tempVar10 != null)
				{
					p1.age = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead(" ");
				if (tempVar11 != null)
				{
					p1.fen = tempVar11.charAt(0);
				}
				String tempVar12 = ConsoleInput.scanfRead(" ");
				if (tempVar12 != null)
				{
					p1.dorm = tempVar12.charAt(0);
				}
			p2.next = p1;
			}
		}
		p2.next = null;
		return (head);
	}

	/*struct shuju*create()
	{
	    struct shuju *head,*p1,*p2;
	    p1=(struct shuju *)malloc(len);
	    scanf("%s",p1->xh);
	    if (strcmp(p1->xh,"end")!=0){
	    scanf("%s %c %d %d %s",p1->xm,&p1->sex,&p1->age,&p1->fen,p1->dorm);
	    p1->next=NULL;
	    head=p1;
	    p2=p1;
	    do
	    {
	    	i++;
	    	p1=(struct shuju* )malloc(len);
	    	scanf("%s",p1->xh);
	    	if (strcmp(p1->xh,"end")==0)
	    	{
	    	    free(p1);break;
	    	}
	    	else
	    	{
	    		scanf("%s %c %d %d %s",p1->xm,&p1->sex,&p1->age,&p1->fen,p1->dorm);
	    		p1->next=NULL;
	    		p2->next=p1;
	    		p2=p1;
	    	}
	    }
	    while(1);}
	    else{head=NULL;}
	    return(head);
	}*/

	public static void print(shuju head)
	{
		int j;
		shuju p;
		shuju pre;

		for (j = 0;j < i;j++)
		{
			p = head;
		pre = p;
			while (p.next != null)
			{
			pre = p;
			p = p.next;
			}
		System.out.printf("%s %s %c %d %s %s\n",p.xh,p.xm,p.sex,p.age,p.fen,p.dorm);

		pre.next = null;
		}
	}

	public static void Main()
	{


		shuju p;
		p = create();

		print(p);
	}
}

