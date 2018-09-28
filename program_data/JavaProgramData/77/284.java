package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int num = 0;
	public static int[] v = new int[100];
	public static char c;
	public static void f()
	{
		char b;
		int m;
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (num == 0)
		{
			c = b;
		}
		if (b == c)
		{
			a[num] = 0;
			num++;
			f();
		}
		if (b != c)
		{
			a[num] = 1;
			for (m = num;;m--)
			{
				if (a[m] == 0 && v[m] == 0)
				{
					v[m] = 1;
					System.out.print(m);
					System.out.print(" ");
					System.out.print(num);
					System.out.print("\n");
					break;
				}
			}
			if (m != 0)
			{
				num++;
				f();
			}

		}

	}

	public static int Main()
	{
		int i;
		for (i = 0;i <= 99;i++)
		{
			v[i] = 0;
		}
		f();
		return 0;
	}
}

