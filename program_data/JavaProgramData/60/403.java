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
		int j;
		int count = 0;
		int[] a = new int[50000];
		int[] flag = new int[50000];
		for (i = 1;2 * i + 1 <= n;i++)
		{
			flag[i] = 1;
			for (j = 2;j <= i + 1;j++)
			{
				if ((2 * i + 1) % j == 0)
				{
					flag[i] = flag[i] * 0;
				}
				else
				{
					flag[i] = flag[i] * 1;
				}
			}
			if (flag[i] == 1)
			{

				a[count] = 2 * i + 1;
				count++;
			}
		}
		if (n <= 4)
		{
			System.out.print("empty");
		}
		for (i = 0;i < count - 1;i++)
		{
			if (a[i] == a[i + 1] - 2)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
			}
		}
		return 0;

	}

}

