package <missing>;

public class GlobalMembers
{
	public static void cheng(int[] a, int n, int flag)
	{
		int i = 0;
		int j = 0;
		int count = 0;
		int l = 0;
		int k = 0;
		int[] b = new int[100];
		count = 99;
		while (a[count] == 0)
		{
			count--;
		}
		if (flag == n - 1)
		{
			for (i = 0; i <= count; i++)
			{
				System.out.print(a[i]);
			}
		}
		else
		{
			for (i = count; i >= 0; i--)
			{
				b[j++] = a[i];
			}
			for (i = 0; i <= count; i++)
			{
				b[i] = b[i] * 2;
			}
			for (i = 0; i <= count; i++)
			{
				if (b[i] >= 10)
				{
					b[i] = b[i] - 10;
					b[i + 1]++;
				}
			}
			l = count + 1;
			while (b[l] == 0)
			{
				l--;
			}
			for (i = l; i >= 0; i--)
			{
				a[k++] = b[i];
			}
			flag++;
			cheng(a, n, flag);
		}
	}
	public static int Main()
	{
		int n;
		int[] a = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			cheng(a, n, 0);
		}
		return 0;
	}
}

