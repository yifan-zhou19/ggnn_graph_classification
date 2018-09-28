package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String st = new String(new char[351]);
		String su = new String(new char[351]);
		String re = new String(new char[551]);
		String reh = new String(new char[551]);
		int a;
		int b;
		int c;
		int e;
		int r;
		int lu;
		int lr;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			st = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			su = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			re = tempVar3.charAt(0);
		}
		r = -1;
		for (a = 0;a < st.length();a++)
		{
			e = 1;
			for (b = 0;b < su.length();b++)
			{
				if (st.charAt(a + b) != su.charAt(b))
				{
					e = 0;
				}
			}
			if (e != 0)
			{
				r = a;

				break;
			}
		}
		if (r + 1 != 0)
		{
		for (a = 0;a < r;a++)
		{
			reh = tangible.StringFunctions.changeCharacter(reh, a, st.charAt(a));
		}
		for (a = 0;a < su.length();a++)
		{
			reh = tangible.StringFunctions.changeCharacter(reh, r + a, re.charAt(a));
		}
		lu = su.length();
		lr = re.length();
		for (a = r + lu;a <= 530;a++)
		{
			reh = tangible.StringFunctions.changeCharacter(reh, lr + a - lu, st.charAt(a));
		}


					System.out.printf("%s",reh);

		}
		else
		{
			System.out.printf("%s",st);
		}
		return 0;
	}


}

