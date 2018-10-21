package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String N = new String(new char[100]);
	N = new Scanner(System.in).nextLine();
	n = Integer.parseInt(N);
	int i;
	for (i = 0;i < n;i++)
	{
	char[][] a = new char[55][100];
	a[i] = new Scanner(System.in).nextLine();
	int l;
	l = String.valueOf(a[i]).length();
	int j;

	if (a[i][l - 2] == 'e' && a[i][l - 1] == 'r')
	{
	for (j = 0;j < l - 2;j++)
	{
	System.out.printf("%c",a[i][j]);
	}
	System.out.print("\n");
	}
	if (a[i][l - 2] == 'l' && a[i][l - 1] == 'y')
	{
	for (j = 0;j < l - 2;j++)
	{
	System.out.printf("%c",a[i][j]);
	}
	System.out.print("\n");
	}
	if (a[i][l - 3] == 'i' && a[i][l - 2] == 'n' && a[i][l - 1] == 'g')
	{
	for (j = 0;j < l - 3;j++)
	{
	System.out.printf("%c",a[i][j]);
	}
	System.out.print("\n");
	}

	if ((a[i][l - 2] != 'e' || a[i][l - 1] != 'r') && (a[i][l - 2] != 'l' || a[i][l - 1] != 'y') && (a[i][l - 3] != 'i' || a[i][l - 2] != 'n' || a[i][l - 1] != 'g'))
	{
	for (j = 0;j < l;j++)
	{
	System.out.printf("%c",a[i][j]);
	}
	System.out.print("\n");
	}



	}



	return 0;
	}
}
