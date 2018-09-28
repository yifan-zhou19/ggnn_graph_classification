package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //n?????????????,t??????????,m????????
		int t;
		int m = 0;
		int[] a = new int[500]; //??a??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (t % 2 == 1)
			{
				a[m++] = t; //???????a
			}
		}
		for (int i = 0;i < m - 1;i++) //???a??????
		{
			for (int j = i + 1;j < m;j++)
			{
				if (a[i] > a[j])
				{
					int p = a[i];
					a[i] = a[j];
					a[j] = p;
				}
			}
		}
		System.out.print(a[0]);
		for (int k = 1;k < m;k++) //???????
		{
			System.out.print(',');
			System.out.print(a[k]);
		}
		return 0;
	}
}

