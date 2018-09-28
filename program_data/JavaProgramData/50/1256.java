package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
		int i;
		int w;
		int[] b = {0, 5, 4, 3, 2, 1, 0, 6};
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 12;i++)
		{
			if (a[i] == b[w])
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}



}

