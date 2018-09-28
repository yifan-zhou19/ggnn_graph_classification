public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[5]);
	public int age;
	public String score = new String(new char[10]);
	public String address = new String(new char[30]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int Main()
	{
		student p1;
		student p2;
		student p;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		while (p1.num.charAt(0) != 'e')
		{
			n++;
			if (n == 1)
			{
				p1.next = null;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.sex = tempVar3.charAt(0);
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
				p1.address = tempVar6.charAt(0);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
			p1.next = p2;
			p2 = p1;
		}

		p = p1.next;
		while (p != 0)
		{
			System.out.printf("%s %s %s %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.address);
			p = p.next;
		}
		return 0;
	}
}

