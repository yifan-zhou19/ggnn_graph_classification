public class stu
{
	public String num = new String(new char[100]);
	public String name = new String(new char[100]);
	public String sex = new String(new char[3]);
	public String age = new String(new char[10]);
	public String score = new String(new char[10]);
	public String ad = new String(new char[100]);
	public stu next;
	public stu pre;
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int cal = 0;
		int i = 0;
		String end = new String(new char[100]);
		stu head;
		stu p1;
		stu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(len);
		String tempVar = ConsoleInput.scanfRead(" ");
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.age = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.ad = tempVar6.charAt(0);
		}
		p1.next = null;
		p1.pre = null;
		head = p1;
		p2 = p1;
		while (true)
		{
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				end = tempVar7.charAt(0);
			}
			if (end.charAt(0) == 'e')
			{
				break;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(len);
			p1.num = end;
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.sex = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.age = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				p1.score = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.ad = tempVar12.charAt(0);
			}
			cal++;
			p1.next = null;
			p1.pre = p2;
			p2.next = p1;
			p2 = p1;
		}
		while (p2 != null)
		{
			System.out.printf("%s %s %s %s %s %s\n",p2.num,p2.name,p2.sex,p2.age,p2.score,p2.ad);
			p1 = p2;
			p2 = p2.pre;
			p1 = null;
		}
	}

}

