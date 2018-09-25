package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[20];
	public static int[] b = new int[20];
	public static int i = 0;

	public static void f(int x)
	{
		if (x == 1)
		{
			a[i] = x;
			i++;
		}
		else
		{
			f(x / 2);
			a[i] = x;
			i++;
		}
	}


	public static int Main()
	{
		int x;
		int y;
		int j;
		int counter = 0;
		int k;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(y);
		for (j = 0;j < 20;j++)
		{
			b[j] = a[j];
			a[j] = 0;
		}
		i = 0;
		f(x);
		for (j = 0;j < 20;j++)
		{
			if (b[j] == a[j] && b[j] > 0)
			{
				counter++;
			}
			else
			{
				break;
			}
		}
		System.out.print(a[counter - 1]);
		System.out.print("\n");
		return 0;
	}
}

