public class student
{
	public int a;
	public String num = new String(new char[20]);
		public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static student creat()
	{
		student head;
		student headtwo;
		student p1;
		student p2;
		student p3;
		student p4;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.a = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (student)malloc(len);
		head.next = p1;
		p2 = head;
		p1.next = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		headtwo = (student)malloc(len);
		p4 = headtwo;
		p4.next = null;
		int i;
		int t = 0;
		for (i = 0;i < n - 1;i++)
		{
			t = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p3 = (student)malloc(len);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p3.num = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p3.a = Integer.parseInt(tempVar4);
			}
			if (p3.a >= 60)
			{
				p2 = head;
				p1 = head.next;
				while (p1 != null)
				{
					if (p3.a > p1.a)
					{
						p3.next = p1;
						p2.next = p3;
						t = 1;
						break;
					}
					p2 = p1;
					p1 = p1.next;
				}
				if (t == 0)
				{
					p2.next = p3;
					p3.next = null;
				}
			}
			if (p3.a < 60)
			{
				p4.next = p3;
				p4 = p3;
				p4.next = null;
			}
		}
		p1 = head;
		while (p1.next != null)
		{
			p1 = p1.next;
		}
		p1.next = headtwo.next;
		return head;
	}
	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student head;
		student p;
		head = creat();
		p = head.next;
		while (p != null)
		{
			System.out.printf("%s\n",p.num);
			p = p.next;
		}
	}









}

