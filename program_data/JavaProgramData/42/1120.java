package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[1000000];
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] != k)
			{
				System.out.print(a[i]);
				break;
			}
		}
		for (j = i + 1;j < n;j++)
		{
			if (a[j] != k)
			{
				System.out.print(" ");
				System.out.print(a[j]);
			}
		}
		return 0;
	}

}

