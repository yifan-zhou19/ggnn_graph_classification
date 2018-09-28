package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sushu = new int[2];
		int i;
		int j;
		int k = 0;
		int n;
		int flag;
		int fl = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i++)
		{
			flag = 1;
			for (j = 2;j <= i / 2;j++)
			{
				if (i % j == 0)
				{
					flag = 0;
					break;
				}
			}
			if (flag != 0)
			{
				sushu[k] = i;
				k = k + 1;
			}
			if (k == 2)
			{
				if (sushu[0] + 2 == sushu[1])
				{
					System.out.printf("%d %d\n",sushu[0],sushu[1]);
					fl = 1;
				}
				sushu[0] = sushu[1];
				k = 1;
			}

		}
		if (fl == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

