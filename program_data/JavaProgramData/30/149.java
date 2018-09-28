package <missing>;

public class GlobalMembers
{
	public static int ref(int num)
	{
		if ((num % 10 == 7) || (num / 10 == 7) || (num % 7 == 0))
		{
			return 0;
		}
		return num;
	}

	public static int Main()
	{
		int n;
		int i;
		int sum = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
			sum += ref(i) * ref(i);
		}

		System.out.printf("%d",sum);

		return 0;
	}
}

