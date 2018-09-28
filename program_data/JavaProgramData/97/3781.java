package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int q;
		int[] sz = {100, 50, 20, 10, 5, 1};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (int i = 0;i <= 5;i++)
		{
			q = a / sz[i];
		System.out.printf("%d\n",q);
			a = a - sz[i] * q;
		}
		return 0;

	}

}

