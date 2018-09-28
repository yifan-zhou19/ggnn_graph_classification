package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int a = 0;
		int b;
		int c = 1;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		while (c != 0)
		{
			   a++;
			   b = a * n + k;
			   for (i = 1;i < n;i++)
			   {
								if (b % (n - 1) != 0)
								{
									break;
								}
								b = b / (n - 1) * n + k;
			   }
			   if (i == n)
			   {
				   System.out.printf("%d\n",b);
				   return (0);
			   }
		}
	}


}

