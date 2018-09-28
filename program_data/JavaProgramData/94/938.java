package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //?????????
		int m = 0;
		int k = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[500]; //???
		for (k = 0;k < n;k++)
		{
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a % 2 != 0) //??????????
			{
				num[m] = a;
				m++;
			}
		}
		for (k = 0;k < m - 1;k++) //????
		{
			for (j = 0;j < m - k - 1;j++)
			{
				if (num[j] > num[j + 1])
				{
					int t;
					t = num[j];
					num[j] = num[j + 1];
					num[j + 1] = t;
				}
			}
		}
		System.out.print(num[0]);
		for (k = 1;k < m;k++) //??
		{
			System.out.print(',');
			System.out.print(num[k]);
		}
		return 0;
	}
}

