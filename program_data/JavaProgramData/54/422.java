package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int i;
		int m;
		int k;
		int r;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
			 for (m = n;;m++)
			 {
				 t = m;
				 for (i = 1;i <= n;i++)
				 {
					 if (t < n)
					 {
						 break;
					 }

				   r = t % n;
				   if (r != k)
				   {
					   break;
				   }
				   t = (t - k) * (n - 1) / n;
				 }
				 if (i > n)
				 {
					 System.out.printf("%d",m);
					 break;
				 }

			 }
	}

}

