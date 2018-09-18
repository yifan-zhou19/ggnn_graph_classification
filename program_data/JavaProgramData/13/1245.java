package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int num;
		int[] a = new int[100];
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[num] == 0)
			{
				a[num]++;
				b[k] = num;
				k++;
			}
		}
		for (i = 0; i < k - 1; i++)
		{
			System.out.print(b[i]);
			System.out.print(" ");
		}
		System.out.print(b[k - 1]);
		return 0;
	}



}

