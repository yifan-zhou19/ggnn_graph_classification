package <missing>;

public class GlobalMembers
{
	public static void getnum(int[] a, int[] b)
	{
			len1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			len2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			for (int i = 0; i < len1; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int j = 0; j < len2; j++)
			{
				b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			return;
	}
	public static void sort(int[] a, int len)
	{
			int temp = 0;

			for (int i = 0; i < len - 1; i++)
			{
					for (int j = 0; j < len - i - 1; j++)
					{
							if (a[j] > a[j + 1])
							{
									temp = a[j];
									a[j] = a[j + 1];
									a[j + 1] = temp; //put the biggest to the end
							}
					}
			}
			return;
	}
	public static void combine(int[] a, int[] b, int len1, int len2)
	{
			int pin = 0;

			for (int i = len1; i < len1 + len2; i++)
			{
					a[i] = b[i - len1];
			}

			for (int j = 0; j < len1 + len2; j++)
			{
					if (pin == 0)
					{
						System.out.print(a[j]);
						pin = 1;
					}
					else
					{
						System.out.print(" ");
						System.out.print(a[j]);
					}
			}
			return;
	}
	public static int len1;
	public static int len2;

	public static int Main()
	{
			int[] a = new int[1000];
			int[] b = new int[1000];

			getnum(a, b);
			sort(a, len1);
			sort(b, len2);
			combine(a, b, len1, len2);

			return 0;
	}

}

