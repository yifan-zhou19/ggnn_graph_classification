package <missing>;

public class GlobalMembers
{
	public static int sushu(int p)
	{
		int i;
		for (i = 2;i <= (int)Math.sqrt(p);i++)
		{
			if (p % i == 0)
			{
				return 0;
			}
		}
		return 1;

	}

	public static void Main(String[] args)
	{
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 6;i <= n;i += 2)
		{
			for (k = 2;k <= i / 2;k++)
			{
				if (sushu(k) == 1 && sushu(i - k) == 1)
				{

					System.out.printf("%d=%d+%d\n",i,k,i - k);
					break;
				}
			}
		}


	}

}

