package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int e = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i++)
		{
			for (j = 2;j <= i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				i = i - 2;
			  for (j = 2;j <= i;j++)
			  {
				if (i % j == 0)
				{
					break;
				}
			  }
			  if (j == i)
			  {
				  System.out.printf("%d %d\n",i,i + 2);
				  e++;
			  }
			  i = i + 2;
			}
		}
		if (e == 0)
		{
			System.out.print("empty\n");
		}



		return 0;
	}
}

