package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] zz = new int[20000];
		int i;
		int j;
		for (i = 0 ; i < n ; i++)
		{
			zz[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0 ; i < n ; i++)
		{
			for (j = i + 1 ; j < n ; j++)
			{
				if (zz[i] == zz[j])
				{
					zz[j] -= zz[i];
				}
			}
		}
		System.out.print(zz[0]);
		for (i = 1 ; i < n ; i++)
		{
			if (zz[i] != 0)
			{
				System.out.print(" ");
				System.out.print(zz[i]);
			}
		}
	}
}

