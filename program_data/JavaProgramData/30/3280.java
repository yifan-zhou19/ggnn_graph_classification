package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = i;j > 0;j = (j - (j % 10)) / 10)
			{
		   if (j % 10 == 7)
		   {
			   break;
		   }
			}
		   if (i % 7 != 0 && j <= 0)
		   {
			   sum += i * i;
		   }
		}

			System.out.printf("%d",sum);

		return 0;
	}

}

