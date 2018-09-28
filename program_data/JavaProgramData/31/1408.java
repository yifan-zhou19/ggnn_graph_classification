public class stu
{ //????????
	public String stunum = new String(new char[10]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[3]);
	public String age = new String(new char[10]);
	public String mark = new String(new char[10]);
	public String add = new String(new char[20]);
	public stu next; //??
	public stu before;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu p;
		stu pt;
		stu head;
		int i = 0;
		int n = 0;
		String a = new String(new char[4]);
		a = "end";
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pt = p = head = (stu)malloc(Len);
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.stunum = tempVar.charAt(0);
			}
			if (strcmp(p.stunum,a) == 0)
			{
				pt.next = null;
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.age = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p.mark = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p.add = tempVar6.charAt(0);
			}
			pt = p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (stu)malloc(Len);
			pt.next = p;
			p.before = pt;
		}
		p = pt;
		if (p != head)
		{
			for (i = 0;;i++)
			{
				System.out.printf("%s %s %s %s %s %s", p.stunum, p.name, p.sex, p.age, p.mark, p.add);
				if (p == head)
				{
					break;
				}
				System.out.print("\n");
				p = p.before;
			}
		}
		System.out.print("\n");
	}
}

