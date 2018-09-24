package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			int r;
			int shiwei;
			r = i % 10;
			shiwei = (i - r) / 10;
			if (i % 7 == 0)
			{
			  sum = sum + 0;
			}
			else if ((i - 7) % 10 == 0)
			{
				   sum = sum + 0;
			}
				 else if (shiwei == 7)
				 {
						 sum = sum + 0;
				 }
					  else
					  {
						  sum = sum + i * i;
					  }
		}
		System.out.printf("%d\n",sum);
		return 0;
	}
}

