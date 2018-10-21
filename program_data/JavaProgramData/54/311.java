package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ss;
		int s;
		int n;
		int k;
		int i;
		int o;
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
	ss = 1;
	while (true)
	{
		ss = ss + 1;
	s = ss;
	o = 0;
	for (i = 1;i <= n;i++)
	{
		if ((s * (n - 1) - (n - 1) * k) % n == 0 && s * (n - 1) - (n - 1) * k != 0)
		{
			s = (s * (n - 1) - (n - 1) * k) / n;
		}
	else
	{
		o = 1;
		break;
	}
	}
	if (o == 0)
	{
		break;
	}
	}
	System.out.printf("%d",ss);
	}

}

