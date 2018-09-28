package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static void jisuan(int[] a)
	{
		int l;
		int i;
		int flag;
		for (i = 999;i >= 0;i--)
		{
			if (a[i] != 0)
			{
				l = i;
				break;
			}
		}
		a[0] = a[0] * 2;
		flag = a[0] / 10;
		a[0] = a[0] % 10;
		for (i = 1;i <= l + 1;i++)
		{
			a[i] = 2 * a[i] + flag;
			flag = a[i] / 10;
			a[i] = a[i] % 10;
		}
	}
	public static int Main()
	{
		int N;
		int i;
		int l;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 1000;i++)
		{
			a[i] = 0;
		}
		a[0] = 1;
		for (i = 0;i < N;i++)
		{
			jisuan(a);
		}
		for (i = 999;i >= 0;i--)
		{
			if (a[i] != 0)
			{
				l = i;
				break;
			}
		}
		for (i = l;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
		return 0;

	}

}

