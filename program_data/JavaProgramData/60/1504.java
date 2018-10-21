package <missing>;

public class GlobalMembers
{
	public static int sushu(int i)
	{
		int n;
		int sj = 0;
		for (n = 2;n < i;n++)
		{
			if (i % n == 0)
			{
				sj = 1;
			}
		}
		if (sj == 1)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 4;i <= n;i++)
		{
			if (sushu(i) != 0 && sushu(i - 2) != 0)
			{
				j++;
				System.out.printf("%d %d\n",i - 2,i);
			}

		}
		if (j == 0)
		{
			System.out.print("empty");
		}


		return 0;
	}

}

