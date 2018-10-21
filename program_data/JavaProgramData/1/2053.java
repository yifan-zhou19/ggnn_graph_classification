package <missing>;

public class GlobalMembers
{
	public static void factor(int x, int limit)
	{
		int remainder;
		if (x < limit)
		{
			return;
		}
		for (int i = limit;i <= x;i++)
		{
			remainder = x % i;
			if (remainder == 0)
			{
				if (x / i >= i)
				{
					result++;
					factor(x / i, i);
				}
			}
		}
	}
	public static int result;
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int input;
		for (int i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input = Integer.parseInt(tempVar2);
			}
			result = 1; //limit?2?????result=1;
			factor(input, 2); //limit?2?????result=1;
			System.out.printf("%d\n",result);
		}
		return 0;
	}
}

