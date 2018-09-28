package <missing>;

public class GlobalMembers
{
	public static int[] ans = new int[100];
	public static void multi(int[] a)
	{
		int i;
		int l;
		int[] aa = new int[100];
		for (i = 99;i >= 0;i--)
		{
			if (a[i] != 0)
			{
			l = i + 1;
			break;
			}
		}
		for (i = 0;i < l;i++)
		{
			aa[i] += a[i] * 2;
			aa[i + 1] += aa[i] / 10;
			aa[i] = aa[i] % 10;
		}
		for (i = 0;i < 100;i++)
		{
			ans[i] = aa[i];
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ans[0] = 1;
		for (i = 0;i < n;i++)
		{
			multi(ans);
		}
		for (i = 99;i >= 0;i--)
		{
			if (ans[i] != 0)
			{
			l = i + 1;
			break;
			}
		}
		for (i = l - 1;i >= 0;i--)
		{
			System.out.print(ans[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

