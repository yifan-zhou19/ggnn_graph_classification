//****************************************************************
//* ? ??4.cpp                                                 *
//* ? ??? ? 1200012916                                      *
//* ? ??2012?12?15?                                        *
//* ? ????????                                          *
//****************************************************************

public class people // ?????
{
	public int x;
	public int y;
}

package <missing>;

public class GlobalMembers
{
	public static people p = new people();

	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[10000];
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			p.x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p.y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (p.x == 0 && p.y == 0)
			{
				break;
			}
			if (p.x != p.y) // ????????????????
			{
				a[p.x] = 10000; // ??????????????????
			}
			a[p.y] += 1; // a[p, y]??????????
		}
		for (i = 0; i < 10000; i++)
		{
			if (a[i] == n - 1) //???n - 1???????????????
			{
				System.out.print(i);
				System.out.print("\n");
				t = 1; // ?t?????????????
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}

		return 0;
	}
}

