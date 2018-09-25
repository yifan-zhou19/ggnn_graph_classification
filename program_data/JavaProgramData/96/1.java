package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String res = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		int n = str.length();
		int mod = 0;
		int shang;
		mod = str.charAt(0) - '0';
		int nLag = 1;
		for (int i = 1;i < n;i++)
		{
			mod = mod * 10 + str.charAt(i) - '0';
			shang = mod / 13;
			if (i == 1 && shang == 0)
			{
				nLag = 2;
			}
			res = tangible.StringFunctions.changeCharacter(res, i, '0' + shang);
			mod = mod % 13;
		}
		res = tangible.StringFunctions.changeCharacter(res, n, '\0');
		if (n <= nLag)
		{
			System.out.printf("%s\n","0");
		}
		else
		{
			System.out.printf("%s\n",res.Substring(nLag));
		}
		System.out.printf("%d\n",mod);
	}

}

