package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int i;
		int j;
		int[] b = new int[20000];
		int m = 0;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		b[0] = a[0];
		for (i = 1,j = 1;i < n;i++)
		{
			for (k = 0;k < j;k++)
			{
				if (a[i] == b[k])
				{
					m = 1;
				}
			}
			if (m != 1)
			{
				b[j] = a[i];
				j++;
			}
			m = 0;
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(' ');
		}
		System.out.print(b[j - 1]);
		System.out.print("\n");
		return 0;
	}

}

