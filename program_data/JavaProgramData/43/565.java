package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int j;
		int l;
		int a;
		int b;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++)
		{
			k = Math.sqrt(i);
		 for (j = 2;j <= k;j++) //??i?????
		 {

		 if (i % j == 0)
		 {
			 break;
		 }
		 }

		 if (j >= k + 1)
		 {
			 p = Math.sqrt(m - i);
					   for (l = 2;l <= p;l++) //???m-i?????
					   {
					   if ((m - i) % l == 0)
					   {
						   break;
					   }
					   }
					   if (l >= p + 1)
					   {
						   System.out.printf("%d %d\n",i,m - i);
					   }
		 }

		}
	}
}

