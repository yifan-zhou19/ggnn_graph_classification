package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[1000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] y = new int[30];
		for (i = 0;i < n;i++)
		{
		  for (j = 0;j < a[i];j++)
		  {
			if (j == 0)
			{
				y[0] = 1;
			}
			else if (j == 1)
			{
				y[1] = 1;
			}
			else
			{
				y[j] = y[j - 1] + y[j - 2];
			}
		  }
		   System.out.printf("%d\n",y[j - 1]);

		}

	}

}

