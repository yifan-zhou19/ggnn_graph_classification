package <missing>;

public class GlobalMembers
{
	public static void read(int[] a, int[] b)
	{
		int i;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n2;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sort(int[] a, int[] b)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < n1 - 1;i++)
		{
		   for (j = i + 1;j < n1;j++)
		   {
			if (a[j] < a[i])
			{
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		   }
		}
		for (i = 0;i < n2 - 1;i++)
		{
		   for (j = i + 1;j < n2;j++)
		   {
			if (b[j] < b[i])
			{
				temp = b[j];
				b[j] = b[i];
				b[i] = temp;
			}
		   }
		}
	}
	public static void link(int[] a, int[] b)
	{
		int i;
		for (i = 0;i < n2;i++)
		{
			a[n1 + i] = b[i];
		}
	}
	public static void output(int[] a)
	{
		int i;
		for (i = 0;i < n1 + n2 - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n1 + n2 - 1]);
	}
	public static int[] input1 = new int[100];
	public static int[] input2 = new int[100];
	public static int n1;
	public static int n2;
	public static int Main()
	{
		read(input1, input2);
		sort(input1, input2);
		link(input1, input2);
		output(input1);
		return 0;
	}
}

