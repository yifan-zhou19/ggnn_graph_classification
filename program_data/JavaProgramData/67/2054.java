public class p
{
	public String name = new String(new char[100]);
	public float t;
	public int judge;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		double c;
		double d;
		c = (double)y / x;
		int a1;
		int a2;
		for (int i = 0;i <= m - 2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a1 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				a2 = Integer.parseInt(tempVar5);
			}
			d = (double)a2 / a1;
			if (c - d > 0.05)
			{
				System.out.print("worse\n");
			}
			else if (d - c > 0.05)
			{
				System.out.print("better\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
	}

}

