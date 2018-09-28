package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int x;
	int j;
	int k;
	int n;
	int m;
	int l = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 6;i <= n;i += 2)
	{
	for (x = 2;x < i;x++)
	{
	for (j = 2,k = 1;j <= (int)Math.sqrt(x);j++)
	{
	if (x % j == 0)
	{
		k = 0;
	}

	}
	if (k != 0)
	{
	for (j = 2,m = 1;j <= (int)Math.sqrt(i - x);j++)
	{
	if ((i - x) % j == 0)
	{
		m = 0;
	}

	}
	}
	if (m != 0)
	{
	System.out.printf("%d=%d+%d\n",i,x,i - x);
	l++;
	break;
	}
	}
	if (x == i)
	{
		System.out.printf("error %d\n",i);
	}
	}

	}
}

