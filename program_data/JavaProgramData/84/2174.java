package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int a;
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			s = Integer.parseInt(tempVar2);
		}
		a = s;
		b = s;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				s = Integer.parseInt(tempVar3);
			}
			if (a > s && b > s)
			{
				a = a;
				b = b;
			}
			else if (a > s && b <= s)
			{
				a = a;
				b = s;
			}
			else
			{
				b = a;
				a = s;
			}
		}
		System.out.printf("%d\n%d\n",a,b);
		return 0;
	}
}

