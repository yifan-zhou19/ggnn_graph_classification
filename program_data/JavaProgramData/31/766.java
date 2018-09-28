public class student
{
	public String number = new String(new char[20]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[2]);
	public int year;
	public float score;
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
		p1 = new student();
		p1.next = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.number = tempVar.charAt(0);
		}
		while (p1.number.charAt(0) != 'e')
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
				p1.year = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.address = tempVar6.charAt(0);
			}
			p2 = p1;
			p1 = new student();
			p1.next = p2;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.number = tempVar7.charAt(0);
			}
		}
		while (p2 != null)
		{
			System.out.printf("%s %s %s %d %g %s\n",p2.number,p2.name,p2.sex,p2.year,p2.score,p2.address);
			p2 = p2.next;
		}
		return 0;
	}
}

