package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N; //??????ab
		int[] a = new int[501];
		int i;
		int m;
		int j;
		int[] b = new int[501];
		int p = 1;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 500;i++) //???ab??????-1
		{
			a[i] = -1;
			b[i] = -1;
		}
		for (i = 1;i <= N;i++) //???????a?
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= N - 1;i++) //???a??????????
		{
			for (j = 1;j <= N - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					m = a[j];
					a[j] = a[j + 1];
					a[j + 1] = m;
				}

			}
		}
		for (i = 1;i <= 499;i++) //???a?????????b?
		{
			if (a[i] % 2 != 0 && a[i] != -1)
			{
				b[p] = a[i];
				p = p + 1;
			}
		}
		for (i = 1;i <= 499;i++) //????????b????
		{
			if (b[i] != -1 && b[i + 1] != -1)
			{
				System.out.print(b[i]);
				System.out.print(",");
				m = i + 1;
			}
		}
		System.out.print(b[m]);
		System.out.print("\n");
		return 0;
	}



}

