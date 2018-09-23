package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[11];
	public static int[] b = new int[11];
	public static int num1 = 1;
	public static int num2 = 1;
	public static void f1(int x)
	{
		a[1] = x;
		if (x != 1)
		{
			do
			{
				num1++;
				a[num1] = x / 2;
				x = a[num1];
			}while (a[num1] != 1);
			a[num1] = 1;
		}
	}
	public static void f2(int y)
	{
		b[1] = y;
		if (y != 1)
		{
			do
			{
				num2++;
				b[num2] = y / 2;
				y = b[num2];
			}while (b[num2] != 1);
			b[num2] = 1;
		}
	}
	public static int Main()
	{
		int x;
		int y;
		int p = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f1(x);
		f2(y);
		for (int i = 1;i <= num1;i++)
		{
			for (int j = 1;j <= num2;j++)
			{
				if (a[i] == b[j])
				{
					System.out.print(a[i]);
					System.out.print("\n");
					p++;
					break;
				}
			}
			if (p != 0)
			{
				break;
			}
		}
		return 0;
	}
}

