package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int[] b = new int[101];
		int c;
		int i;
		int j;
		int n;
		for (i = 10;i <= 100;i++)
		{
			b[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				c = a[i];
				if (b[c] == 0)
				{
					b[c]++;
				}
				else
				{
					a[i] = 0;
				}
		}
		System.out.print(a[0]);
		for (j = 1;j < n;j++)
		{
				if (a[j] != 0)
				{
					System.out.print(" ");
					System.out.print(a[j]);
				}
		}


			return 0;
	}

}

