package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
			String a = new String(new char[101]);
			String b = new String(new char[101]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			int ita;
			int itb;
			for (ita = 0;a.charAt(ita) != '\0';ita++)
			{
				;
			}
			for (itb = 0;b.charAt(itb) != '\0';itb++)
			{
				;
			}
			ita--;
			itb--;

			int temp = 0;
			for (;itb >= 0;itb--)
			{
				a = tangible.StringFunctions.changeCharacter(a, ita, a.charAt(ita) - b.charAt(itb) - temp);
				if (a.charAt(ita) < 0)
				{
					temp = 1;
					a.charAt(ita) += 10;
				}
				else
				{
					temp = 0;
				}
				a.charAt(ita) += '0';
				ita--;
			}
			for (;ita >= 0;ita--)
			{
				a = tangible.StringFunctions.changeCharacter(a, ita, a.charAt(ita) - temp);
				if (a.charAt(ita) < '0')
				{
					temp = 1;
					a.charAt(ita) += 10;
				}
				else
				{
					break;
				}
			}

			System.out.printf("%s\n",a);
		}
	}
}

