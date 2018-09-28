package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		int b;
		for (i = 0;i < 20000;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0 && n == 0)
			{
				break;
			}
			else
			{
			   if (n == 1)
			   {
				  System.out.printf("%d\n",n);
			   }
			   else
			   {
				  k = 0;
				  for (b = 2;b <= n;b++)
				  {
					 k = ((m % b) + k) % b;
				  }
				  System.out.printf("%d\n",k + 1);
			   }
			}
		}
		return 0;
	}
}

