package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String zf = new String(new char[100]);
	String zq = new String(new char[100]);
	String cu = new String(new char[100]);
	char[][] dt = new char[100][100];
	int i;
	int l;
	int lc;
	int j;
	int lz;
	int k = 0;
	int t;
	int m;
	int n = 0;
	int len;
	int ci;
	zf = new Scanner(System.in).nextLine();
	cu = new Scanner(System.in).nextLine();
	zq = new Scanner(System.in).nextLine();
	l = zf.length();
	lc = cu.length();
	lz = zq.length();
	for (i = 0;i < l;i++)
	{
		if (zf.charAt(i) == cu.charAt(0))
		{
			 ci = 1;
			for (j = 0;j < lc;j++,i++)
			{
				if (zf.charAt(i) != cu.charAt(j))
				{
				   ci = 0;
				   break;
				}

			}
			if (ci == 1)
			{
				t = i - lc;
			   for (j = 0;j < lc;j++,t++)
			   {
				   zf = tangible.StringFunctions.changeCharacter(zf, t, zq.charAt(j));

			   }
			   break;

			}
		}
	}

			  System.out.printf("%s",zf);

	return 0;
	}

}

