package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int k;
		int a;
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
		for (a = 1;a <= m;a++)
		{
			m = a * n + k;
		 for (i = 1;i <= n - 1;i++)
		 {
			 if (m % (n - 1) != 0)
			 {
				 break;
			 }
		  m = m / (n - 1) * n + k;
		 }
		  if (i == n)
		  {
			  System.out.printf("%ld\n",m);
		   break;
		  }
		}
	}

}

