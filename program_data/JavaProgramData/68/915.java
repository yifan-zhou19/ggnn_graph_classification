package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] p = new int[50001];
		int n;
		int i;
		int j;
		int count = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
						p[i] = 1;
		}
		for (i = 2;i <= n / 2;i++)
		{
		 if (p[i] != 0)
		 {
		  for (j = i + i;j <= n;j += i)
		  {
							  p[j] = 0;
		  }
		 }
		}

		for (i = 6;i <= n;i += 2)
		{
						  for (j = 2;j <= n / 2;j++)
						  {
						  if (p[j] != 0 && p[i - j] != 0)
						  {
							  System.out.printf("%d=%d+%d\n",i,j,i - j);
							  break;
						  }
						  }
		}

	}
}

