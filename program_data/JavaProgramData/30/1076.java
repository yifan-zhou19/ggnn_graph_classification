package <missing>;

public class GlobalMembers
{
	public static int t;
	public static int fun(int n)
	{
	int x;
	if (n % 7 == 0)
	{
		return 0;
	}
	while (n >= 10)
	{
	x = n - n / 10 * 10;
	if (x == 7)
	{
		return 0;
	}
	n = n / 10;
	}
	if (n % 7 == 0)
	{
		return 0;
	}
	return 1;
	}

	public static int Main()
	{
	 int n;
	 int i;
	 int s = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;++i)
	 {
	// printf("i=%d %d\n",i,fun(i));
	s = s + i * i * fun(i);
	 }
	 System.out.printf("%d",s);
	 return 0;
	}
}

