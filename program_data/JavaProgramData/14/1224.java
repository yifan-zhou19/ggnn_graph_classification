public class stu
{
	public String num = new String(new char[15]);
	public int chi;
	public int math;
	public int sum;
	public stu next;
}
	p = head,i = 0;

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static stu creat()
	{
		stu head;
		stu p;
		stu g;
		stu h;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (stu)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p.chi = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p.math = Integer.parseInt(tempVar3);
		}
		p.sum = p.chi + p.math;
		for (i = 0;;i++)
		{
			if (i == 0)
			{
				head = p;
				head.next = null;
			}
			else if (i < 3)
			{
				 for (h = head,j = 0;j < i;j++)
				 {
					 if (p.sum > h.sum)
					 {
						 break;
					 }
					 else
					 {
						 g = h;
						 h = h.next;
					 }
				 }
				 if (j == 0)
				 {
					 p.next = head;
					 head = p;
				 }
				 else if (j == i)
				 {
					 g.next = p;
					 p.next = null;
				 }
				 else
				 {
					 g.next = p;
					 p.next = h;
				 }
			}
			 else
			 {
				 for (h = head,j = 0;j < 3;j++)
				 {
					 if (p.sum > h.sum)
					 {
						 break;
					 }
					 else
					 {
						 g = h;
						 h = h.next;
					 }
				 }
				 if (j == 0)
				 {
					 p.next = head;
					 head = p;
				 }
				 else
				 {
					 g.next = p;
					 p.next = h;
				 }
			 }
			 if (i == n - 1)
			 {
				 break;
			 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p = (stu)malloc(LEN);
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 p.num = tempVar4.charAt(0);
			 }
			 String tempVar5 = ConsoleInput.scanfRead(" ");
			 if (tempVar5 != null)
			 {
				 p.chi = Integer.parseInt(tempVar5);
			 }
			 String tempVar6 = ConsoleInput.scanfRead(" ");
			 if (tempVar6 != null)
			 {
				 p.math = Integer.parseInt(tempVar6);
			 }
			 p.sum = p.chi + p.math;
		}
		return (head);
	}
	public static void print(stu head)
	{
		stu p;
		int i;
		for (p = head,i = 0;i < 3;i++,p = p.next)
		{
				System.out.printf("%s %d\n",p.num,p.sum);
		}
	}
	public static void Main()
	{
		stu head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat();
		print(head);
	}

}

