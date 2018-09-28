package <missing>;

public class GlobalMembers
{
	public static int n1;
	public static int n2;
	public static int[] num1 = new int[100];
	public static int[] num2 = new int[100];
	public static void in(int n, int[] a)
	{
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void com(int n, int[] a)
	{
		int temp;
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = 0; j < n - i - 1; j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	public static int Main() //???
	{
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		in(n1, num1);
		com(n1, num1);
		in(n2, num2);
		com(n2, num2);
		for (int i = 0; i < n1; i++)
		{
			System.out.print(num1[i]);
			System.out.print(' ');
		}
		for (int j = 0; j < n2 - 1; j++)
		{
			System.out.print(num2[j]);
			System.out.print(' ');
		}
		System.out.print(num2[n2 - 1]);
		System.out.print("\n");
		return 0;
	}


}

