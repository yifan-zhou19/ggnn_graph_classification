package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000];
		int i;
		int l;
		while (n != 0)
		{

			i = 1;
			for (i = 1;i <= n;i++)
			{
				a[i] = i;
			}
			i = 1;
			while (n > 1)
			{


				i = i + m - 1;
				while (i > n)
				{
					i = i - n;
				}


					for (l = i;l < n;l++)
					{
						a[l] = a[l + 1];
					}
					n--;

			}
			System.out.print(a[1]);
			System.out.print("\n");
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}

}

