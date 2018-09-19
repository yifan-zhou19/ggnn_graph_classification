package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int i = 0;
		while (i < n)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}
		System.out.print(a[0]);
		i = 1;
		while (i < n)
		{

			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
			}
			if (((j == i) && (a[i] != a[i - 1])) == 1)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
			i++;
		}
		return 0;

	}
}

