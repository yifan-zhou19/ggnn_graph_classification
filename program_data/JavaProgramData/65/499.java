package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int n;
		int i;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			e = d - c;
			f = c - d;
			if (e == 1 || f == 2)
			{
				a++;
			}
			else if (f == 1 || e == 2)
			{
				b++;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else if (b > a)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}
		return 0;

	}
}

