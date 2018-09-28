package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int tr;
		int i;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		i--;
		for (int j = 0;j < i;j++,i--)
		{
			tr = a[j];
			a[j] = a[i];
			a[i] = tr;
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
	return 0;
	}

}

