package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[256]);
		String zichuan = new String(new char[256]);
		String tihuan = new String(new char[20]);
		String daitihuan = new String(new char[20]);
		int k;
		int e;
		int s = 1;
		int tag = 0;
		zfc = new Scanner(System.in).nextLine();
		zichuan = new Scanner(System.in).nextLine();
		tihuan = new Scanner(System.in).nextLine();
		int l;
		int m;
		int i;
		int j;
		l = zichuan.length();
		m = zfc.length();
		for (i = 0;i < m;i++)
		{
			for (j = i;j < i + l;j++)
			{
				daitihuan = tangible.StringFunctions.changeCharacter(daitihuan, j - i, zfc.charAt(j));
			}
			daitihuan = daitihuan.substring(0, l);
			k = strcmp(daitihuan,zichuan);
			s *= k;
			if (k == 0 && tag == 0)
			{
				e = i;
				tag = 1;
			}
		}
		if (s != 0)
		{
			System.out.printf("%s",zfc);
		}
		else if (s == 0)
		{
			for (i = 0;i < e;i++)
			{
				System.out.printf("%c",zfc.charAt(i));
			}
			System.out.printf("%s",tihuan);
			for (i = e + l;i < m;i++)
			{
				System.out.printf("%c",zfc.charAt(i));
			}
		}
		return 0;
	}

}

