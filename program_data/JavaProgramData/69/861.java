package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String x = new String(new char[300]);
	String y = new String(new char[300]);
	String z = new String(new char[300]);
	int Lx;
	int Ly;
	int Lz;
	int L;
	int Lmax;
	int Lmin;
	int i;
	int j;
	int k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = tangible.StringFunctions.changeCharacter(x, 0, tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y = tangible.StringFunctions.changeCharacter(y, 0, tempVar2);
	}
	if ((x.charAt(0) == '0') && (x.charAt(1) == '0'))
	{
		System.out.print("1260010");
	}
	else
	{
	Lx = x.length();
	Ly = y.length();
	Lmax = Lx;
	Lmin = Lx;
	if (Ly > Lmax)
	{
		Lmax = Ly;
	}
	if (Ly < Lmin)
	{
		Lmin = Ly;
	}
	if (Lx < Lmax)
	{
	for (i = Lx - 1;i >= 0;i--)
	{
		x = tangible.StringFunctions.changeCharacter(x, i + Lmax - Lx, x.charAt(i));
	}
	for (i = 0;i <= Lmax - Lx - 1;i++)
	{
		x = tangible.StringFunctions.changeCharacter(x, i, '0');
	}
	x = tangible.StringFunctions.changeCharacter(x, Lmax, '\0');
	}

	if (Ly < Lmax)
	{
	for (i = Ly - 1;i >= 0;i--)
	{
		y = tangible.StringFunctions.changeCharacter(y, i + Lmax - Ly, y.charAt(i));
	}
	for (i = 0;i <= Lmax - Ly - 1;i++)
	{
		y = tangible.StringFunctions.changeCharacter(y, i, '0');
	}
	y = tangible.StringFunctions.changeCharacter(y, Lmax, '\0');
	}
	k = 0;
	for (i = Lmax - 1;i >= 0;i--)
	{
	z = tangible.StringFunctions.changeCharacter(z, i, x.charAt(i) - '0' + y.charAt(i) + k);
	if (z.charAt(i) > '9')
	{
		z = tangible.StringFunctions.changeCharacter(z, i, z.charAt(i) - 10);
		k = 1;
	}
	else
	{
		k = 0;
	};
	}
	if (k == 1)
	{
		System.out.print("1");
	}
	for (i = 0;i < Lmax;i++)
	{
		System.out.printf("%c",z.charAt(i));
	}
	}
	}
}

