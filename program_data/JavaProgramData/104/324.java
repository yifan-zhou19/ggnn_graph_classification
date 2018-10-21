package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i = 0;
		int j = 0;
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a[i] > 1)
		{
			a[i + 1] = a[i] / 2;
		 i++;
		}
		while (b[j] > 1)
		{
			b[j + 1] = b[j] / 2;
		j++;
		}

		while (a[i] == b[j])
		{
			i--;
			j--;
		}
		System.out.print(a[i + 1]);
		return 0;
	}
}

