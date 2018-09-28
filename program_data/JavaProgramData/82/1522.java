package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int s;
	int l;
	int a;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	s = 0;
	l = 0;
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		{
			s = s + 1;
		}
		else
		{
			if (s >= l)
			{
				l = s;
				s = 0;
			}
			else
			{
				s = 0;
			}
		}
	}
	if (l >= s)
	{
	System.out.printf("%d\n",l);
	}
	else
	{
	System.out.printf("%d\n",s);
	}
	}


}

