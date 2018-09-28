package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			if (i % 7 == 0)
			{
			s = s;
			}
			else if (i <= 10)
			{
			s = s + i * i;
			}
			else if (((i % 10) != 7) && (((i - (i % 10)) / 10) != 7))
			{
			s = s + i * i;
			}
			i++;
		}
		System.out.printf("%d",s);
	return 0;
	}
}

