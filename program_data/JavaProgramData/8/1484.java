package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int num1;
	public static int num2;
	public static void getin()
	{
		int i;
		int j;
		num1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= num1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1;j <= num2;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void order(int[] aa, int num)
	{
		int t;
		int i;
		int j;
		for (i = 1;i < num;i++)
		{
			for (j = 1;j < num;j++)
			{
				if (aa[j] > aa[j + 1])
				{
					t = aa[j];
					aa[j] = aa[j + 1];
					aa[j + 1] = t;
				}
			}
		}
	}
	public static void print(int[] a, int[] b, int num1, int num2)
	{
		System.out.print(a[1]);
		int i;
		for (i = 2;i <= num1;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		for (i = 1;i <= num2;i++)
		{
			System.out.print(" ");
			System.out.print(b[i]);
		}
		System.out.print("\n");
	}

	public static int Main()
	{


		getin();
		order(a, num1);
		order(b, num2);
		print(a, b, num1, num2);
		return 0;
	}
}

