package <missing>;

public class GlobalMembers
{
	public static void read(int[] a, int[] b, int num1, int num2)
	{
		int i;
		for (i = 0;i < num1;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < num2;i++)
		{
			b[i] = ConsoleInput.readToWhiteSpace(true);
		}
	}
	public static void sort(int[] a, int num1)
	{
		int i;
		int j;
		for (i = 0;i < num1;i++)
		{
			for (j = i + 1;j < num1;j++)
			{
				if (a[i] > a[j])
				{
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void merge(int[] a, int[] b, int[] c, int num1, int num2)
	{
		int i;
		for (i = 0;i < num1;i++)
		{
			c[i] = a[i];
		}
		for (i = num1;i < num1 + num2;i++)
		{
			c[i] = b[i - num1];
		}
	}
	public static void print(int[] a, int num1)
	{
		int i;
		for (i = 0;i < num1 - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[num1 - 1]);
		System.out.print("\n");
	}
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];
		int num1;
		int num2;
		num1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		read(a, b, num1, num2);
		sort(a, num1);
		sort(b, num2);
		merge(a, b, c, num1, num2);
		print(c, num1 + num2);
		return 0;
	}
}

