package <missing>;

public class GlobalMembers
{
	public static int[] s = new int[110];

	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int sum = 0;
		int c = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			if (a <= 140 && a >= 90 && b >= 60 && b <= 90)
			{
				s[i] = 1;
			}
		}

		for (i = 0;i < n;i++)
		{
			if (s[i] != 0)
			{
				c++;
			}
			else
			{
				c = 0;
			}
			if (sum < c)
			{
				sum = c;
			}
		}
		System.out.printf("%d\n",sum);
	}
}

