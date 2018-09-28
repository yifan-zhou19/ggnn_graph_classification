package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int k = 0;
		int[] a = new int[100000];
		int i = 0;
		int x = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			if (a[i] != k) //?????k???
			{
				if (x != 1) //????????????????
				{
					System.out.print(a[i]);
					x = 1; //?x??1
				}
				else
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}
			}
		}
		return 0;
	}


}

