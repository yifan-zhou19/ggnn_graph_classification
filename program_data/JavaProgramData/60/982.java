package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int k;
		int i;
		k = Math.sqrt(a);
		for (i = 2;i <= k;i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		if (i > k)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int js = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] ss = new int[100000];
		for (i = 3;i + 2 <= n;i++)
		{
			if (sushu(i) != 0 && sushu(i + 2) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				js++;
			}
		}
		if (js == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}

}

