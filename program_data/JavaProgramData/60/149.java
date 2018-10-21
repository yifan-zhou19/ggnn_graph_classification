package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
		int flag;
		int[] a = new int[5000];
		int t;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		t = 0;
		for (i = 3; i <= n; i++)
		{
			flag = 0;
			for (m = 2; m < i; m++)
			{
				if (i % m == 0)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				a[t] = i;
				t++;
			}
		}

		if (a[1] == 0)
		{
			System.out.print("empty");
		}
		else
		{
		for (i = 0; i < t - 1; i++)
		{
			if (a[i + 1] - a[i] == 2)
			{
				System.out.printf("%d %d\n", a[i], a[i + 1]);
			}
		}
		}
	}
}

