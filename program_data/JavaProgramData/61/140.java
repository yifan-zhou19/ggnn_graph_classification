package <missing>;

public class GlobalMembers
{
	public static int ferbo(int r)
	{
		if (r == 1 || r == 2)
		{
		return 1;
		}
		else
		{
		return ferbo(r - 1) + ferbo(r - 2);
		}
	}
	public static int Main()
	{
		int[] b = new int[20];
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",ferbo(b[i]));
		}
	}


}

