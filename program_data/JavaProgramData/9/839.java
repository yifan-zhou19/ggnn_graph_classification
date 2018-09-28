public class p
{
	public String i = new String(new char[10]);
	public int a;
	public p next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		p p1;
		p p2;
		p head;
		p head2;
		p q1;
		p q2;
		int n;
		int i;
		int k = 0;
		int b = 0;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (p)malloc(len);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.i = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.a = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			k++;
			if (k == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (p)malloc(len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.i = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.a = Integer.parseInt(tempVar5);
			}
		}
		p2.next = null;
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			if (p1.a >= 60)
			{
				x++;
			}
		}
		k = 0;
		for (p1 = head;p1 != null;p1 = p1.next)
		{
		if (p1.a >= 60 && p1.a > b)
		{
		b = p1.a;
		p2 = p1;
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q1 = q2 = (p)malloc(len);
		q1.i = p2.i;
		q1.a = p2.a;
		p2.a = 0;
		for (i = 0;i < x - 1;i++)
		{
			k++;
		if (k == 1)
		{
			head2 = q1;
		}
		else
		{
			q2.next = q1;
		}
		q2 = q1;
		b = 0;
		for (p1 = head;p1 != null;p1 = p1.next)
		{
		if (p1.a >= 60 && p1.a > b)
		{
		b = p1.a;
		p2 = p1;
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q1 = (p)malloc(len);
		q1.i = p2.i;
		q1.a = p2.a;
		p2.a = 0;
		}
		q2.next = q1;
		q2 = q1;


		for (p1 = head;p1 != null;p1 = p1.next)
		{
			if (p1.a > 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				q1 = (p)malloc(len);
				q1.i = p1.i;
				q1.a = p1.a;
				p1.a = 0;
			q2.next = q1;
			q2 = q1;
			}
		}
			q2.next = null;
		for (q1 = head2;q1 != null;q1 = q1.next)
		{
			System.out.printf("%s\n",q1.i);
		}






	}



}

