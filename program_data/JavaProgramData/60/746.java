package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int s;
	int p;
	int q = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n - 2;i++)
	{
	s = 0;
	p = 0;
	for (j = 1;j <= i;j++)
	{
	if (i % j == 0)
	{
	s++;
	}
	if ((i + 2) % j == 0)
	{
	p++;
	}
	}
	if (s == 2 && p == 1)
	{
	System.out.printf("%d %d\n",i,i + 2);
	q++;
	}
	}
	if (q == 0)
	{
	System.out.print("empty");
	}
	return 0;
	}


}

