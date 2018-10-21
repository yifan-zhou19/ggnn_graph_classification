package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] b = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		int count = 0;
		for (i = m;i <= n;i++)
		{
			for (j = 2;j < i;j += 1)
			{
				if (i % j == 0)
				{
					break;
				}

				else if (j == i - 1)
				{
					b[count] = i;
					count++;

				}
			}
		}

		int end;
		int t;
		int num = 0;
		int[] c = new int[5000];


		for (i = 0;i < count;i++)
		{
			t = b[i];
			j = 0;
			end = 0;
			while (t != 0)
			{
				j = t % 10;
				end = end * 10 + j;
				t = t / 10;
			}
			if (end == b[i])
			{
				c[num] = b[i];
				num++;
			}
		}
		if (num == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < num - 1;i++)
			{
				System.out.printf("%d,",c[i]);
			}
			System.out.printf("%d",c[num - 1]);
		}
		return 0;
	}
}

