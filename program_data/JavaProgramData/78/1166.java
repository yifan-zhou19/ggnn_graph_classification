package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int z;
	int q;
	int s;
	int l;


	for (z = 1;z <= 5;z++)
	{
	for (q = 1;q <= 5;q++)
	{
	for (s = 1;s <= 5;s++)
	{
	l = z + q - s;
	if ((l >= 1) && (l <= 5) && (z + l> s + q) && (z + s < q) && (z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l))
	{
	System.out.print('l');
	System.out.print(" ");
	System.out.print(l * 10);
	System.out.print("\n");

	System.out.print('q');
	System.out.print(" ");
	System.out.print(q * 10);
	System.out.print("\n");

	System.out.print('z');
	System.out.print(" ");
	System.out.print(z * 10);
	System.out.print("\n");
	System.out.print('s');
	System.out.print(" ");
	System.out.print(s * 10);
	System.out.print("\n");
	}





	}
	}
	}
	}
}
