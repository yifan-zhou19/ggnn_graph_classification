package <missing>;

public class GlobalMembers
{
	public static void Sort(int[] b, int n)
	{
		int i;
		int j;
		int temp;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
	}
	public static int chouqu(int[] a, int[] b, int n)
	{
		int count = 0;
		int i;
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 == 1)
			{
				b[count] = a[i];
				count++;
			}
		}
		return count;
	}
	public static int Main()
	{
		int[] a = new int[501];
		int n;
		int i;
		int[] b = new int[501];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		n = chouqu(a, b, n);
		Sort(b, n);
		System.out.print(b[0]);
		for (i = 1;i < n;i++)
		{
			System.out.print(",");
			System.out.print(b[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

