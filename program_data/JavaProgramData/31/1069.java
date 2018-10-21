public class stu
{
	public String name = new String(new char[20]);
	public String num = new String(new char[10]);
	public String x = new String(new char[5]);
	public int y;
	public float f;
	public String add = new String(new char[100]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu p1;
		stu p2;

		p1 = new stu();

		p1.next = null;



		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}

		while (p1.num.charAt(0) != 'e')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.x = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.y = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.f = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
			p2 = p1;
			p1 = new stu();
			p1.next = p2;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
		}

		p1 = p1.next;
		System.out.printf("%s %s %s %d %g %s\n",p1.num,p1.name,p1.x,p1.y,p1.f,p1.add);
		while (p1.next != 0)
		{
			p1 = p1.next;
			System.out.printf("%s %s %s %d %g %s\n",p1.num,p1.name,p1.x,p1.y,p1.f,p1.add);
		}

		return 0;
	}


}

