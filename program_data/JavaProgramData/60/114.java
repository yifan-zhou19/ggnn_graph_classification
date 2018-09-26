package <missing>;

public class GlobalMembers
{
	public static int sushu(int i)
	{
		int j;
		int k;
		k = 1;
		for (j = 2;j < i;j++)
		{
						if (i % j == 0)
						{
							  k = 0;
							  break;
						}
		}
		return k;
	}

	public static int Main()
	{
		int n;
		int i;
		int out;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		out = 0;
		for (i = 4;i <= n;i++)
		{
			if (sushu(i) != 0 && sushu(i - 2) != 0)
			{
				System.out.printf("%d %d\n",i - 2,i);
				out = 1;
			}
		}
		if (out == 0)
		{
				   System.out.print("empty");
		}
		return 0;
	}

}

