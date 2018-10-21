package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int s = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			s = s + i * i;
			if (i % 7 == 0)
			{
			   sum = sum + i * i;
			}
			else if (i % 10 == 7)
			{
					sum = sum + i * i;
			}
			else if (i > 70 && i < 80)
			{
					sum = sum + i * i;
			}
		}
		s = s - sum;
		System.out.printf("%d\n",s);
		return 0;
	}
}

