package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int a;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			if (i % 7 == 0 || i % 10 == 7 || i == 71 || i == 72 || i == 73 || i == 74 || i == 75 || i == 76 || i == 78 || i == 79)
			{
				a = 0;
			}
			else
			{
				a = i;
			}
			i++;
			s = s + a * a;
		}
	 System.out.printf("%d",s);
	return 0;
	}

}

