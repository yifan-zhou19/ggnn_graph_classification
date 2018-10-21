package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String syx = new String(new char[80]);
		String zxq = new String(new char[80]);
		int i;
		int t1;
		int t2;
		int t;
		syx = new Scanner(System.in).nextLine();
		zxq = new Scanner(System.in).nextLine();
		t1 = syx.length();
		t2 = zxq.length();
		t = (t1 > t2)?t1:t2;
		for (i = 0;i < t;i++)
		{
			if (syx.charAt(i) < 96)
			{
				syx = tangible.StringFunctions.changeCharacter(syx, i, syx.charAt(i) + 32);
			}
			if (zxq.charAt(i) < 96)
			{
				zxq = tangible.StringFunctions.changeCharacter(zxq, i, zxq.charAt(i) + 32);
			}
		}
		if (strcmp(syx, zxq) > 0)
		{
			System.out.print(">\n");
		}
		else if (strcmp(syx, zxq) < 0)
		{
			System.out.print("<\n");
		}
		else
		{
			System.out.print("=\n");
		}

		return 0;
	}
}

