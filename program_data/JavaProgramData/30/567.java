package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i = 1;
	int s = 0;
	while (i <= n)
	{
	a = i % 10;
	c = i % 7;
	int b = (int)(i / 10);
	if ((a != 7) && (b != 7) && (c != 0))
	{
		s = s + i * i;
	}
	i++;
	}
	System.out.printf("%d",s);
	return 0;
	}
}

