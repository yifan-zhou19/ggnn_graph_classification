package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int i;
		for (a = 1; a < 6; a++)
		{
			for (b = 1; b < 6; b++)
			{
				for (c = 1; c < 6; c++)
				{
					for (d = 1; d < 6; d++)
					{
						e = 15 - a - b - c - d;
						if (a != b && b != c && c != d && d != a && a != c && b != d && (((a == 1 || a == 2) && (e == 1)) || (!(a == 1 || a == 2) && !(e == 1))) && (((b == 1 || b == 2) && (b == 2)) || (!(b == 1 || b == 2) && !(b == 2))) && (((c == 1 || c == 2) && (a == 5)) || (!(c == 1 || c == 2) && !(a == 5))) && (((d == 1 || d == 2) && (c != 1)) || (!(d == 1 || d == 2) && !(c != 1))) && (((e == 1 || e == 2) && (d == 1)) || (!(e == 1 || e == 2) && !(d == 1))) && (e != 2 && e != 3))
						{
						  System.out.print(a);
						  System.out.print(" ");
						  System.out.print(b);
						  System.out.print(" ");
						  System.out.print(c);
						  System.out.print(" ");
						  System.out.print(d);
						  System.out.print(" ");
						  System.out.print(e);
						  System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;

	}

}
