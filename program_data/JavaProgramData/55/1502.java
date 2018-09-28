package <missing>;

public class GlobalMembers
{
	public static int[] fim = new int[255];
	public static int[] map = new int[37];
	public static String C = new String(new char[1000]);

	public static int Main()
	{
		int a;
		int b;
		String ch = new String(new char[100]);
		for (int i = 0; i <= 36; i++)
		{
			if (i <= 9)
			{
				fim[i + 48] = i;
			}
			else
			{
				fim['a' + i - 10] = i; //??????
			}
		}
		for (int i = 0; i <= 36; i++)
		{
			if (i <= 9)
			{
				map[i] = i + 48;
			}
			else
			{
				map[i] = i + 'A' - 10; //??
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			ch = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		int S = 0;
		for (int i = 0; i < (int)ch.length(); i++)
		{
			ch = tangible.StringFunctions.changeCharacter(ch, i, Character.toLowerCase(ch.charAt(i)));
			S = S * a + fim[ch.charAt(i)];
		} //??????
		if (S == 0)
		{
			System.out.println("0");
		}
		else
		{
			int l = 0;
			while (S != 0)
			{
				C = tangible.StringFunctions.changeCharacter(C, l++, map[S % b], S /= b); //???b??
			}
			reverse(C, C.Substring(l));
			System.out.println(C);

		}
		return 0;
	}

}

