package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int i;
		int t;
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

	  for (m = n + k;;m += n)
	  {
		t = m;
	   for (i = 1;i <= n;i++)
	   {
		if (i == n)
		{
			break;
		}
	if (t % n != k || t < n + k)
	{
		break;
	}
		   t = (t - k) * (n - 1) / n;
	   }
		if (i == n && t % n == k && t > n + k)
		{
			break;
		}
	  }
		System.out.printf("%d",m);
	}

}

