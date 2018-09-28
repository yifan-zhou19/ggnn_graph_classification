package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int reverse = int num;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",reverse(n));
		}
		return 0;
	}

	public static int reverse(int num)
	{
		int ans = 0;
		do
		{
			ans = ans * 10 + num % 10;
			num = num / 10;
		} while (num != 0);
		return ans;
	}

}

