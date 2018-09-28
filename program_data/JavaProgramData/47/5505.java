package <missing>;

public class GlobalMembers
{
	public static void invert(int[] ip, int n)
	{

		int i;
		int s = 1;

		for (i = 0;i < n;i++)
		{
			if (s == 1)
			{
				System.out.printf("%d",ip[n - 1 - i]);
				s = 0;
			}
			else
			{
				System.out.printf(" %d",ip[n - 1 - i]);
			}

		}
		return;

	}

	public static int Main()
	{

		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] ip = new int[n];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(ip[i]) = Integer.parseInt(tempVar2);
			}
		}
		invert(ip, n);

		return 0;
	}
}

