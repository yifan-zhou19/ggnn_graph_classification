package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int k;
		int i;
		int j;
		int l = 0;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < n;j++)
		{
			if (a[j] != k)
			{
				b[l] = a[j];
				l++;
			}
		}
		for (m = 0;m < l - 1;m++)
		{
			System.out.print(b[m]);
			System.out.print(" ");
		}
		System.out.print(b[l - 1]);
		System.out.print("\n");
		return 0;
	}

}

