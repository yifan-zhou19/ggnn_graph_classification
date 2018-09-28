package <missing>;

public class GlobalMembers
{
	/**
	* @author ??
	* @date 2010-12-8
	* @description
	* ??????:?????? 
	*/

	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int x;
		int y;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (x != 0 || y != 0)
		{
			a[x]++;
			b[y]++;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < n; i++)
		{
			if (a[i] == 0 && (b[i] == n - 1))
			{
				System.out.print(i);
				System.out.print("\n");
				flag = 1;
			}
			if (flag != 0)
			{
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}

		return 0;
	}

}

