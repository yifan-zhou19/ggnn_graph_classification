package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;
	int b;
	int k;
	int i;
	int t;
	int sum;
	i = 10000;
	sum = 0;
	t = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 10000;i >= 1;i = i / 10)
	{
	 a = k / i;
	 b = k % i;
	 k = b;
	 if (a == 0)
	 {
	  t = t + 1;
	 }
	 else
	 {
	  sum = sum + a * Math.pow(10,5 - t) / i;
	 }
	}
	System.out.printf("%d",sum);
	}


}

