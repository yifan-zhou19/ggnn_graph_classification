package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 6;i <= n;i = i + 2)
	{
		for (k = 3;k <= i / 2;k = k + 2)
		{
		 m = i - k;
		for (t = 3;t <= Math.sqrt(k);t = t + 2)
		{
		 if (k % t == 0)
		 {
			 break;
		 }
		}
	 if (t > Math.sqrt(k))
	 {
		 for (t = 3;t <= Math.sqrt(m);t = t + 2)
		 {
		if (m % t == 0)
		{
		  break;
		}
		 }
		if (t > Math.sqrt(m))
		{
			System.out.printf("%d=%d+%d\n",i,k,m);
		break;
		}
	 }
		}

	}



	}
}

