package <missing>;

public class GlobalMembers
{
	public static void paixu()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int sizea;
		int sizeb;
		int i;
		int j;
		int t;
		sizea = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sizeb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= sizea; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= sizeb; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = sizea; i >= 1; i--)
		{
		for (j = 1; j < i; j++)
		{
			if (a[j] > a[j + 1])
			{
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
			}
		}
		}
		for (i = sizeb; i >= 1; i--)
		{
		for (j = 1; j < i; j++)
		{
			if (b[j] > b[j + 1])
			{
				t = b[j];
				b[j] = b[j + 1];
				b[j + 1] = t;
			}
		}
		}
		for (i = 1; i <= sizea; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		for (i = 1; i <= sizeb; i++)
		{
			System.out.print(b[i]);
			if (i < sizeb)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("\n");
			}
		}
	}
	public static int Main()
	{
		paixu();
		return 0;
	}

}

