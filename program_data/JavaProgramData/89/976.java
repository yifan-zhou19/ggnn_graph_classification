package <missing>;

public class GlobalMembers
{
	/*
	*@author: ??? 1100012986
	*@date?2011.12.07
	*@description???????
	*/
	public static int Main()
	{
		int i;
		int n;
		int x;
		int y;
		int[] a = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true) // ???????????????????????
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x == 0 && y == 0)
			{
				break;
			}
			a[y]++;
		}
		for (i = 0; i < n; i++) // ??????
		{
			if (a[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}
		if (i == n) // ??????????NOT FOUND
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

