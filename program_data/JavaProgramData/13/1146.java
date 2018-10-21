package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 1;
		int l;
		int m;
		int n;
		int[] a = new int[20000];
		int[] b = new int[90];
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		b[0] = a[0];
		for (j = 0; j < n; j++)
		{
			for (l = 0; l < k; l++)
			{
				if (a[j] == b[l])
				{
					m = 1;
				}
			}
			if (m != 1)
			{
				b[k] = a[j];
				k++;
			}
			m = 0;
		}
		System.out.print(b[0]);
		for (x = 1; x < k; x++)
		{
			System.out.print(" ");
			System.out.print(b[x]);
		}
		return 0;
	}
}

