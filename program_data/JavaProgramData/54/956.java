package <missing>;

public class GlobalMembers
{
	public static int getup(int now,int n,int k)
	{
	   return now * n + k;
	}

	public static int Main()
	{
	int monkey = 1;
	int n;
	int k;
	int now = 1;
	int total;
	int start;
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
	total = k;
	start = k;
	for (;monkey < n;)
	{
	   total = getup(total, n, k);
	   if (total % (n - 1) == 0)
	   {
		  ++monkey;
		  total /= (n - 1);
	   }
	   else
	   {
		  start++;
		  total = start;
		  monkey = 1;
	   }
	}
	System.out.printf("%d\n",getup(total, n, k));
	}
}

