package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	s = 0;
	i = 0;
	while (i <= n)
	{
	if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7)
	{
		s = s;
	}
	else
	{
		s = s + i * i;
	}
	i++;
	}
	System.out.printf("%d",s);
	return 0;
	}
}

