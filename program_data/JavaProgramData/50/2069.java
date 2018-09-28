package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int pd = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			for (j = 1;j <= a[i];j++)
			{
				if ((i != 0) || (j != 1))
				{
					n++;
					if (n == 8)
					{
						n = 1;
					}
					if ((n == 5) && (j == 13))
					{
						if (pd == 0)
						{
							System.out.printf("%d",i + 1);
							pd = 1;
						}
						else
						{
							System.out.printf("\n%d",i + 1);
						}
					}
				}
			}
		}


		return 0;
	}
}

