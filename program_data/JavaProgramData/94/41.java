package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int i;
		int j = 0;
		int k;
		int l;
		int temp;
		int n;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a [i] = l;
			if (a [i] % 2 != 0)
			{
				b [j] = a [i];
				j++;
			}
		}
		for (p = 0; p < j - 1; p++)
		{
		for (k = 0; k < j - 1 - p; k++)
		{
			if (b [k] > b [k + 1])
			{
				temp = b [k];
				b [k] = b [k + 1];
				b [k + 1] = temp;
			}
		}
		}
		System.out.print(b[0]);
		for (p = 1; p < j; p++)
		{
			System.out.print(",");
			System.out.print(b[p]);
		}
		return 0;
	}
}

