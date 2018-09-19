package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j = 0;
		int k = 0;
		int h = 1;
		int a;
		for (i = 1;i <= n * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 255)
			{
				j++;
			}
			if (a == 0)
			{
				break;
			}
		}
		for (i = 1;i <= n * n - j - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			if (a == 255)
			{
				k++;
			}
			if (a == 0)
			{
				k = 0;
				h++;
			}
		}
		int x;
		x = (n - j % n - k % n - 2) * (h - 2 * (n - j % n - k % n)) / 2;
		System.out.printf("%d\n",x);
		return 0;
	}

}

