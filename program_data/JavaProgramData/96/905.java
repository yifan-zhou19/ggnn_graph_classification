package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int[] a = new int[100];
		int b = 0;
		int m = 0;
		int i;
		while ((c = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			b = b * 10 + (int)c - 48;
			a[m] = b / 13;
			b = b - a[m] * 13;
			m++;
		}
		for (i = 0; a[i] == 0; i++)
		{
			;
		}
			 if (i >= m)
			 {
				 System.out.print('0');
			 }
		for (; i < m; i++)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		System.out.print(b);
		System.out.print("\n");
		return 0;
	}
}

