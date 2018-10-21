public class student
{
	public String num = new String(new char[30]);
	public String name = new String(new char[20]);
	public String a = new String(new char[3]);
	public int age;
	public String score = new String(new char[10]);
	public String add = new String(new char[30]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: void *malloc(unsigned int size);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//Object malloc(uint size);
	public static void Main()
	{
		int l = 0;
		int i = 0;
		student head;
		student p1;
		student p2;
		student newhead;
		student new1;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.a = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.add = tempVar6.charAt(0);
		}
		head = null;
		while (strcmp(p1.num,"end") != 0)
		{
			n = n + 1;
			if (n == 1)
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
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				p1.a = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				p1.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				p1.score = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				p1.add = tempVar12.charAt(0);
			}
		}
		p2.next = null;
		for (i = 0;i < n;i++)
		{
			p2 = p1 = head;
			while (p1.next != null)
			{
				 p2 = p1;
				   p1 = p1.next;
			}
			if (i == 0)
			{
				newhead = new1 = p1;
			}
			else
			{
				new1 = new1.next = p1;
			}
			p2.next = null;
		}
		p1 = newhead;
		for (l = 0;l < n;l++)
		{
			System.out.printf("%s %s %s %d %s %s\n",p1.num,p1.name,p1.a,p1.age,p1.score,p1.add);
			p1 = p1.next;
		}
	}

}

