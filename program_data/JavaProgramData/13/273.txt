package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int[] count = new int[100];
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < 100;i++)
		{
			count[i] = 0;
		}
		System.out.print(a[0]);
		count[a[0]]++;
		for (i = 0, j = 1; j < n; j++)
		{
			if (count[a[j]] == 0)
			{
				i++;
				a[i] = a[j];
				count[a[j]]++;
			}
		}
		for (j = 1;j <= i;j++)
		{
			System.out.print(" ");
			System.out.print(a[j]);
		}
		System.out.print("\n");
		return 0;
	}

}

