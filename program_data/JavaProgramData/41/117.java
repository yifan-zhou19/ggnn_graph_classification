package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a; //???????a,b,c,d,e???
	int b;
	int c;
	int d;
	int e;
	for (a = 1;a <= 5;a++)
	{
	for (b = 1;b <= 5;b++)
	{
	for (c = 1;c <= 5;c++)
	{
	for (d = 1;d <= 5;d++)
	{
	for (e = 1;e <= 5;e++)

	{
		if ((((e == 1) && (a == 1 || a == 2)) || ((e != 1) && (a != 1) && (a != 2))) && (((b == 2) && (b == 1 || b == 2)) || ((b != 2) && (b != 1) && (b != 2))) && (((a == 5) && (c == 1 || c == 2)) || ((a != 5) && (c != 1) && (c != 2))) && (((c != 1) && (d == 1 || d == 2)) || ((c == 1) && (d != 1) && (d != 2))) && (((d == 1) && (e == 1 || e == 2)) || ((d != 1) && (e != 1) && (e != 2))) && (e != 2) && (e != 3) && ((a - b) * (b - c) * (c - d) * (d - e) * (a - c) * (a - d) * (a - e) * (b - d) * (b - e) * (c - e) != 0))
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
	}
		//??a,b,c,d,e????
	return 0;
	}



}
