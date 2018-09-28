package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[501];
		int[] b = new int[501];
		int count = 0;
		int temp;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 == 1)
			{
				b[count++] = a[i];
			}
		}

		for (i = 0; i < count - 1; i++)
		{
			for (j = 0; j < count - 1 - i; j++)
			{
			if (b[j] > b[j + 1])
			{
				temp = b[j + 1];
				b[j + 1] = b[j];
				b[j] = temp;
			}
			}
		}
		System.out.print(b[0]);
		for (i = 1; i < count; i++)
		{
			System.out.print(",");
			System.out.print(b[i]);
		}
		System.out.print("\n");

		return 0;
	}
}

