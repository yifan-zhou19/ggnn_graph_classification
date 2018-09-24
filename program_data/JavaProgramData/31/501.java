public class student
{
	public String num = new String(new char[20]);
public String name = new String(new char[20]);
public String sex = new String(new char[2]);
public int old;
public float grade;
public String address = new String(new char[100]);
public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student p1;
		student p2;
		p1 = p2 = null;
		p1 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		if (p1.num.charAt(0) == 'e')
		{
			return 0;
		}
	do
	{

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
				p1.old = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.grade = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.address = tempVar6.charAt(0);
			}
			p1.next = p2;
			p2 = p1;
			p1 = new student();
			p1.next = p2;
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		p1.num = tempVar7.charAt(0);
	}

	} while (p1.num.charAt(0) != 'e');

		while (p2 != null)
		{
			System.out.printf("%s %s %s %d %g %s\n",p2.num,p2.name,p2.sex,p2.old,p2.grade,p2.address);
			p1 = p2.next;
			p2 = p1;
		}

		return 0;

	}
}

