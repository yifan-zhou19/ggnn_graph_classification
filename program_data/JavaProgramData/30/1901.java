package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				s = s + 0;
			}
			else if (i / 10 == 7)
			{
				s = s + 0;
			}
			else if (i % 10 == 7)
			{
				s = s + 0;
			}
			else
			{
				s = s + i * i;
			}
		}
		System.out.printf("%d",s);

	}

}

