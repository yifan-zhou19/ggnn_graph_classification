package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] mth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int i;
		int j;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			for (j = 0;j < i - 1;j++)
			{
				sum = sum + mth[j];
			}
			if ((sum + 13 + n - 1) % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
			sum = 0;
		}
	}


}

