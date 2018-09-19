public class linknode
{
	public int id;
	public int chinese;
	public int math;
	public int total;
	public int mark;
	public linknode next;
}

package <missing>;

public class GlobalMembers
{
	public static linknode CreateLinkList()
	{
		int n;
		int i;
		linknode head;
		linknode p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = new linknode();
		p = head;
		if (p == null)
		{
			System.out.print("fail");
			System.exit(-1);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.math = Integer.parseInt(tempVar4);
			}
			p.total = p.chinese + p.math;
			p.mark = 0;
			if (i == n)
			{
				p.next = null;
			}
			else
			{
				p.next = new linknode();
				p = p.next;
			}
		}
		return head;
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void DisplayLinkList(linknode linklist1);
	public static void qiansan(linknode linklist2)
	{
	   linknode head;
	   linknode p;
	   linknode max;

	   head = linklist2;
	   p = head;
	   max = new linknode();
	   int j;
	   for (j = 1;j <= 3;j++)
	   {
		   p = head;
		   max.total = 0;
		   while (p != null)
		   {
			   if (p.total > max.total && p.mark == 0)
			   {
				   max = p;
			   }
			   p = p.next;
		   }
		   max.mark = 1;
		   System.out.printf("%d %d\n",max.id,max.total);
	   }
	}
	public static int Main()
	{
		qiansan(CreateLinkList());

	}
}

