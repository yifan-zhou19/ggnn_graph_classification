package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[200][3];
		int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] c = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int j;
		int y;
		int p;
		int q;
		int e;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0 ; j < n ; j++)
		{
			for (i = 0 ; i < 3 ; i++)
			{
				a[j][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 0 ; j < n ; j++)
		{
				sum = 0;
				  if (a[j][0] % 4 != 0 || (a[j][0] % 100 == 0 && a[j][0] % 400 != 0))
				  {
					p = a[j][1];
					q = a[j][2];
					if (p < q)
					{
							for (e = p - 1;e < q - 1;e++)
							{
								sum += b[e];
							}
					}
					else
					{
							for (e = q - 1;e < p - 1;e++)
							{
								sum += b[e];
							}
					}
					if (sum % 7 == 0)
					{
						System.out.print("YES");
						System.out.print("\n");
					}
					else
					{
						System.out.print("NO");
						System.out.print("\n");
					}
				  }
				 else
				 {
					p = a[j][1];
					q = a[j][2];
					if (p < q)
					{
							for (e = p - 1;e < q - 1;e++)
							{
								sum += c[e];
							}
					}
					else
					{
							for (e = q - 1;e < p - 1;e++)
							{
								sum += c[e];
							}
					}
					if (sum % 7 == 0)
					{
						System.out.print("YES");
						System.out.print("\n");
					}
					else
					{
						System.out.print("NO");
						System.out.print("\n");
					}
				 }
		}
	}
}

