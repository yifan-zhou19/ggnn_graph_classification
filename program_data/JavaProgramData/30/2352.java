package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100];
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i <= n;i++)
		{
		if (i % 10 != 7 && i % 7 != 0 && (i < 70 || i>79))
		{
		sum = sum + i * i;
		}
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

