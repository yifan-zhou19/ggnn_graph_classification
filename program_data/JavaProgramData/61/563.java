package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] z = new int[1001];
		int a;
		int n;
		z[1] = 1;
		z[2] = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 1;a <= 998;a++)
		{
			z[a + 2] = z[a + 1] + z[a];
		}
		for (a = 1;a <= n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[0] = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",z[z[0]]);
		}
		return 0;
	}

}

