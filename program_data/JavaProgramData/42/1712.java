package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int k;
		int m;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = 0;
		i = 0;
		j = 0;
		while (j < n)
		{

			if (a[j] != k)
			{
				a[i] = a[j];
				i = i + 1;
			}
			j = j + 1;
		}


		for (j = 0;j < i;j++)
		{
			if (j == 0)
			{
				System.out.print(a[j]);
			}
			else
			{
				System.out.print(' ');
				System.out.print(a[j]);
			}
		}
		return 0;
	}

}

