package <missing>;

public class GlobalMembers
{
	public static int Main()
	{ //?????
		int m; //??n,m
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int i;
		for (i = 0;i < n;i++) //??n??
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int j;
		int temp;
		for (j = 0;j < m;j++)
		{
			temp = a[(n - m + j)];
			for (i = n - m + j - 1;i >= j;i--)
			{
				a[(i + 1)] = (a + i);
			}
			a[j] = temp;
			temp = 0;
		} //????m????
		for (i = 0;i < n - 1;i++)
		{
			System.out.print((a + i));
			System.out.print(" ");
		}
		System.out.print((a + (n - 1)));
		System.out.print("\n");
		return 0;
	} //????

}

