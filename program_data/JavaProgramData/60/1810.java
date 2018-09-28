package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int k;
		int n;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n - 2;i++)
		{
			a = 1;
			for (j = 2;j <= i / 2;j++)
			{
				if (i % j == 0)
				{
				a = 0;
				break;
				}
			}
			if (a != 0)
			{
			  for (k = 2;k <= (i + 2) / 2;k++)
			  {
				if ((i + 2) % k == 0)
				{
				a = 0;
				break;
				}
			  }
			}
			if (a == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
				b++;
			}
		}
		if (b == 0)
		{
		  System.out.print("empty");
		}
	}
}

