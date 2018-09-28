package <missing>;

public class GlobalMembers
{
	public static int prime(int m)
	{
	  int i;
	  int k;
	k = Math.sqrt(m);
	for (i = 2;i <= k;i++)
	{
	if (m % i == 0)
	{
		break;
	}
	}
	if (i > k)
	{
		return (1);
	}
	else
	{
		return (0);
	}
	}

	public static void Main()
	{

	int n;
	int x;
	int e;
	int f;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (x = 6;x <= n;x = x + 2)
	{
	e = 2;
	while (e <= x / 2)
	{
	f = x - e;
	if (prime(e) == 1 && prime(f) == 1)
	{
	System.out.printf("%d=%d+%d\n",x,e,f);
	break;
	}
	else
	{
		e++;
	}
	}
	}

	}
}

