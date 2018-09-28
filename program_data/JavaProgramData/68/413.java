package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int j;
	int k;
	int m;
	int l = 0;
	int yinru;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		yinru = Integer.parseInt(tempVar);
	}
	for (i = 6;i <= yinru;i += 2)
	{
	for (n = 2;n < i;n++)
	{
	for (j = 2,k = 1;j <= (int)Math.sqrt(n);j++)
	{
	if (n % j == 0)
	{
		k = 0;
	}

	}
	if (k != 0)
	{
	for (j = 2,m = 1;j <= (int)Math.sqrt(i - n);j++)
	{
	if ((i - n) % j == 0)
	{
		m = 0;
	}

	}
	}
	if (m != 0)
	{
	System.out.printf("%d=%d+%d\n",i,n,i - n);

	break;
	}
	}

	}

	}


}

