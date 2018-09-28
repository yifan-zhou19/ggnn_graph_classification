package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[256]);
		String news = new String(new char[50]);
		int i;
		int c;
		int wz = 500;
		int x = 0;
		int d = 0;
		String st = new String(new char[100]);
		String en = new String(new char[100]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			news = tempVar3.charAt(0);
		}

		for (i = 0;i < b.length();i++)
		{
			x = 0;
			if (a.charAt(0) == b.charAt(i))
			{
				for (c = i + 1;c < a.length() + i;c++)
				{
					if (a.charAt(c - i) == b.charAt(c))
					{
						x++;

					}
				}
				if (x == a.length() - 1)
				{
						wz = i;
						break;


				}
			}
		}

	 if (wz != 500)
	 {
			for (i = 0;i < wz;i++)
			{
				st = tangible.StringFunctions.changeCharacter(st, i, b.charAt(i));
			}
			st = tangible.StringFunctions.changeCharacter(st, i, '\0');

			for (i = wz + a.length();i < b.length();i++)
			{
				en = tangible.StringFunctions.changeCharacter(en, i - wz - a.length(), b.charAt(i));
			}
			en = tangible.StringFunctions.changeCharacter(en, i - wz - a.length(), '\0');
			st += news;
			st += en;
			System.out.println(st);

	 }
	else if (wz == 500)
	{

		System.out.println(b);
	}
		return 0;
	}


}

