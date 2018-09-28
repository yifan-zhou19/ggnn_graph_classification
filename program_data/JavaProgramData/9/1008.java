public class student
{
	public String str = new String(new char[10]);
	public int a;

	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(int n)
	{
		int i = 0;
		student head;
		student p1;
		student p2;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.a = Integer.parseInt(tempVar2);
		}
		head = null;
		while (i < n - 1)
		{
			i = i + 1;
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.str = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.a = Integer.parseInt(tempVar4);
			}
		}
		p2.next = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (student)malloc(LEN);
		p2 = p1;
		p2.next = null;

		return (head);
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		student head;
		student p1;
		student p2;
		student p3;
		student p4;
		student p5;
		student p6;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);

		String c = new String(new char[10]);
		int t;


	  for (i = 0;i < n;i++)
	  {
		  p1 = head;
		  p2 = p1.next;

		for (j = 0;j < n - 1 - i;j++)
		{
			 if (p2.a > 59 && p2.a > p1.a)


			 {
					c = p2.str;
					p2.str = p1.str;
					p1.str = c;
					t = p1.a;
					p1.a = p2.a;
					p2.a = t;
			 }


				 p1 = p1.next;
				 p2 = p2.next;

		}

	  }
	  p5 = head;

	  for (i = 0;i < n;i++)
	  {

		  {
			  System.out.printf("%s\n",p5.str);
	  }
		  p5 = p5.next;
	  }
	}
}

