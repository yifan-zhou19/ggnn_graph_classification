package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty");
		}
		for (i = 3;i <= n - 2;i++)
		{
			for (j = 2,k = 2;j <= Math.sqrt(i),k <= Math.sqrt(i + 2);j++,k++)
			{
			   if (i % j == 0 || (i + 2) % k == 0)
			   {
				   break;
			   }
			}
				  if (j > Math.sqrt(i) && k > Math.sqrt(i + 2))
				  {
					  System.out.printf("%d %d\n",i,i + 2);
				  count++;
				  }


		}


		if (count = 0)
		{
			System.out.print("empty");
		}
	}

}

