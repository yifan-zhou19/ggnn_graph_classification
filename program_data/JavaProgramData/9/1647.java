public class pa
{
	public String num = new String(new char[15]);
	public int age;
	public pa next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		pa p;
		pa p1;
		pa p2;
		int i = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (pa)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.age = Integer.parseInt(tempVar3);
		}
		p1.next = null;
		p2 = p1;
		p = p2;
		for (i = 1;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (pa)malloc(LEN);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.age = Integer.parseInt(tempVar5);
			}
			if (p1.age < 60)
			{
				while (p2.next != null)
				{
					p2 = p2.next;
				}
				p2.next = p1;
				p1.next = null;
			}
			else
			{
				if (p.age < p1.age)
				{
					p1.next = p;
					p = p1;
				}
				else
				{
					while (p2.next != null && (p2.next).age >= p1.age)
					{
					p2 = p2.next;
					}
				p1.next = p2.next;
				p2.next = p1;
				}
			}
			p2 = p;
		}
		while (p != null)
		{
			System.out.printf("%s\n",p.num);
			p = p.next;
		}
		return 0;
	}
}

