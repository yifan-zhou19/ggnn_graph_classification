package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[101]; //b??????
	public static int[] b = new int[101];
	public static int n;
	public static void f(int i)
	{
		int j;
		if (i == n)
		{
			return;
		}
		else
		{

			for (j = 0;j < 101;j++)
			{
				b[j] = 0;
			}
			for (j = 100;j >= 0;j--)
			{
				a[j] = a[j] * 2 + b[j]; //????
				if (a[j] >= 10)
				{
						a[j] = a[j] - 10;
				b[j - 1] = 1;
				}
			}
			f(i + 1);
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[100] = 1;
		f(0);
		int i;
		for (i = 0; ;i++)
		{
			if (a[i] != 0)
			{
				break;
			}
		}
		for (i;i <= 100;i++)
		{
			System.out.print(a[i]);
		}
	}
}

