package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double x;
	double y;
	int l;
	int i;
	int xg = 0;
	int cw = 0;
	char[][] jy = new char[2][500];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		jy[0] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		jy[1] = tempVar3.charAt(0);
	}
	if (String.valueOf(jy[0]).length() == String.valueOf(jy[1]).length())
	{
	l = String.valueOf(jy[0]).length();
	 for (i = 0;i < l;i++)
	 {
		 if (jy[0][i] == jy[1][i])
		 {
		 xg++;
		 }
		 if ((jy[0][i] != 'A' && jy[0][i] != 'T' && jy[0][i] != 'C' && jy[0][i] != 'G') || (jy[1][i] != 'A' && jy[1][i] != 'T' && jy[1][i] != 'C' && jy[1][i] != 'G'))
		 {
		 cw++;
		 }
	 }
	 y = 1.0 * xg / l;
	}
	else if (String.valueOf(jy[0]).length() != String.valueOf(jy[1]).length())
	{
	cw++;
	}
	if (cw == 0)
	{
		System.out.print(y > x != 0?"yes":"no");
	}
	else if (cw != 0)
	{
	System.out.print("error");
	}
	return 0;

	}
}

