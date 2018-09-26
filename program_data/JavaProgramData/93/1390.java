package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int[] t = {3, 5, 7};
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

	for (i = 0;i < 3;i++)
	{
		if (n % t[i] == 0)
		{

		k = k + 1;
		}
	}
		if (k == 0)
		{
			System.out.print("n");
		}
		else
		{
		for (i = 0;i < 3;i++)
		{
			if (n % t[i] == 0)
			{
				System.out.printf("%d",t[i]);
			f++;

			if (f < k && f >= 1)
			{
				System.out.print(" ");
			}
			}

		}
		}

		return 0;
	}


}

