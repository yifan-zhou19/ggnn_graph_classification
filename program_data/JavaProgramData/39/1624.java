public class SCL
{
	public String stu = new String(new char[20]);
	public int avg;
	public int rev;
	public char ldr;
	public char wst;
	public int ppr;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static SCL[] SCL = tangible.Arrays.initializeWithDefaultSCLInstances(100);

	public static int Main()
	{
		int n;
		int max = 0;
		int sum = 0;
		String name;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		SCL * p = new SCL();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (p = SCL; p < SCL + n; p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.stu = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.avg = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.rev = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.ldr = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.wst = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.ppr = Integer.parseInt(tempVar7);
			}
			p.sum = 0;

			if (p.avg > 80 && p.ppr > 0)
			{
				p.sum += 8000;
			}
			if (p.avg > 85 && p.rev > 80)
			{
				p.sum += 4000;
			}
			if (p.avg > 90)
			{
				p.sum += 2000;
			}
			if (p.avg > 85 && p.wst == 'Y')
			{
				p.sum += 1000;
			}
			if (p.rev > 80 && p.ldr == 'Y')
			{
				p.sum += 850;
			}
		}

		for (p = SCL; p < SCL + n; p++)
		{
			if (p.sum > max)
			{
				max = p.sum;
				name = p.stu;
			}
			sum += p.sum;
		}

		System.out.printf("%s\n%d\n%d\n", name, max, sum);

		return 0;
	}
}

