public class stu
{
	public int num;
	public int chinese;
	public int math;
	public int sum;
	public stu next;

}
i = 0,f1 = head;
i = 0,f2 = head;
i = 0,f3 = head;

package <missing>;

public class GlobalMembers
{
	public static int[] first = new int[3];
	public static int[] firsti = new int[3];
	public static stu p1;
	public static stu p2;
	public static stu creat(int n)
	{
		stu head = null;
	   p1 = p2 = new stu();
	   while (n-- != 0)
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   p1.num = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead(" ");
		   if (tempVar2 != null)
		   {
			   p1.chinese = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   p1.math = Integer.parseInt(tempVar3);
		   }
		   if (head == null)
		   {
			   head = p1;
		   }
		   else
		   {
			   p2.next = p1;
		   }
		   p2 = p1;
		   p1 = new stu();

	   }
	   p2.next = null;
	return (head);
	}
	public static stu sum(stu head, int n)
	{
		p1 = head;
		while (n-- != 0)
		{
			p1.sum = p1.chinese + p1.math;
		p1 = p1.next;
		}
		return (head);
	}

	public static int Main()
	{
		int n;
		int i;
		int check = 0;
	stu head;
	stu f1;
	stu f2;
	stu f3;
	f1 = new stu();
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	head = creat(n);
	head = sum(head, n);
	p1 = head;
	if (n == 1)
	{
		System.out.printf("%d %d\n",p1.num,p1.sum);
		return 0;
	}

	for (i = 0,f1 = head;i < n;i++,p1 = p1.next)
	{
	if (f1.sum < p1.sum)
	{
		f1 = p1;
	}
	}
		 p1 = head;
		   for (i = 0;i < n;i++)
		   {
			   p2 = p1;
			   p1 = p1.next;
		   if (head == f1)
		   {
			   head = p1;
			   break;
		   }
			else if (p1 == f1)
			{
				p2.next = p1.next;
			}
		   }
	p1 = head;
	for (i = 0,f2 = head;i < n - 1;i++,p1 = p1.next)
	{
		if (f2.sum < p1.sum)
		{
			f2 = p1;
		}
	}
	  if (n == 2)
	  {
		  System.out.printf("%d %d\n",f1.num,f1.sum);
			  System.out.printf("%d %d\n",f2.num,f2.sum);
			  return 0;
	  }
	  p1 = head;
		   for (i = 0;i < n - 1;i++)
		   {
			   p2 = p1;
			   p1 = p1.next;
		   if (head == f2)
		   {
			   head = p1;
			   break;
		   }
			else if (p1 == f2)
			{
				p2.next = p1.next;
			}
		   }
	p1 = head;
	for (i = 0,f3 = head;i < n - 2;i++,p1 = p1.next)
	{
		if (f3.sum < p1.sum)
		{
			f3 = p1;
		}
	}
	   System.out.printf("%d %d\n",f1.num,f1.sum);
	   System.out.printf("%d %d\n",f2.num,f2.sum);
	   System.out.printf("%d %d\n",f3.num,f3.sum);

	return 0;
	}
}

