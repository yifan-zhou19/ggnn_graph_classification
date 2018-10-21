package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //?????n?x?y????i?j???i??j???0?i,j<n?i?????
		int x;
		int y;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++) //a[n]?????????????0
		{
			a[i] = 0;
		}
		while (true)
		{ //???
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x == 0 && y == 0)
			{
				break; //?????0????
			}
			a[y] = a[y] + x; //????????
		}
		for (i = 0;i < n;i++) //??a[n]
		{
			if (a[i] == n * (n - 1) / 2 - i)
			{ //??????????
				System.out.print(i);
				return 0;
			}
		}
		System.out.print("NOT FIUND");
		return 0;
	}
}

