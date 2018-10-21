package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String sh = new String(new char[101]);
		int shang;
		int ys;
		int i;
		int l;
		int ws = 0;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		shang = 0;
		ys = 0;
		for (i = 0;i <= l - 1;i++)
		{
			shang = (ys * 10 + a.charAt(i) - '0') / 13;
			if ((shang == 0 && ws != 0) || shang != 0)
			{
				sh = tangible.StringFunctions.changeCharacter(sh, ws, shang + '0');
				ws++;
				ys = (ys * 10 + a.charAt(i) - '0') % 13;
			}
			else
			{
				ys = ys * 10 + a.charAt(i) - '0';
			}
		}
		if (ws == 0)
		{
			sh = tangible.StringFunctions.changeCharacter(sh, ws, '0');
			ws++;
		}
		sh = tangible.StringFunctions.changeCharacter(sh, ws, '\0');
		System.out.println(sh);
		System.out.printf("%d",ys);
		return 0;
	}

}

