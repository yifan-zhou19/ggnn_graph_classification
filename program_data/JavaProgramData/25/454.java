package <missing>;

public class GlobalMembers
{
	public static void once(int[] a)
	{
		for (int i = 0;i <= 999;i++)
		{
		a[i] *= 2;
		}

		for (int i = 0;i <= 999 - 1;i++)
		{
			if (a[i] >= 10)
			{
				a[i + 1] = a[i] / 10 + a[i + 1];
				a[i] = a[i] % 10;
			}
		}
	}

	public static int Main()
	{

		int[] a = new int[1000];
		a[0] = 1;

		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (;n >= 1;n--)
		{
		once(a);
		}

		int end;
		for (int i = 999;i >= 0;i--)
		{
		if (a[i] != 0)
		{
		end = i;
		break;
		}
		}

		for (int i = end;i >= 0;i--)
		{
		System.out.print(a[i]);
		}
		System.out.print("\n");
	}

}

