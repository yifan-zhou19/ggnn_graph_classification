package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int s = 0;
	for (;;)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	if (n == 0 && m == 0)
	{
		break;
	}
	if (n == 1)
	{
		System.out.printf("%d\n",n);
	}
	else
	{
		s = 0;
	for (i = 2;i <= n;i++)
	{
	s = (s + m) % i;
	}
	System.out.printf("%d\n",s + 1);
	}

	}

	}
}

