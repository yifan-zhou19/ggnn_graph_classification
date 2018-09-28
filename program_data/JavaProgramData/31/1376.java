public class student
{
	public String num = new String(new char[100]);
	public String nam = new String(new char[100]);
	public String sex = new String(new char[2]);
	public String age = new String(new char[100]);
	public String sco = new String(new char[100]);
	public String add = new String(new char[100]);
	public student prev;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student create()
	{
		student head;
		student end;
		student p1;
		student p2;
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		while (strcmp(p1.num,"end") != 0)
		{
			n++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.nam = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.age = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.sco = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
			if (n == 1)
			{
				head = p1;
				p1.prev = null;
			}
			else
			{
				p2.next = p1;
				p1.prev = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
		}
		p2.next = null;
		end = p2;
		return (end);
	}

	public static void print(student end)
	{
		student p;
		p = end;
		do
		{
			System.out.printf("%s %s %s %s %s %s\n",p.num,p.nam,p.sex,p.age,p.sco,p.add);
			p = p.prev;
		}while (p != null);
	}

	public static void Main()
	{
		student end;
		end = create();
		print(end);
	}

}

