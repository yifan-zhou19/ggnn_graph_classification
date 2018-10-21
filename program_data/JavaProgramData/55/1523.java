package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j1;
		int j2;
		int i;
		int[] an = new int[10000];
		int[] bn = new int[10000];
		int shijinzhi = 0;
		int changdu;
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			j2 = Integer.parseInt(tempVar3);
		}
		changdu = a.length();
		for (i = 0;i < changdu;i++)
		{
			if (a.charAt(i) < 123 && a.charAt(i)>96)
			{
				an[i] = a.charAt(i) - 87;
			}
			else if (a.charAt(i) < 91 && a.charAt(i)>64)
			{
				an[i] = a.charAt(i) - 55;
			}
			else
			{
				an[i] = a.charAt(i) - 48;
			}
		}
		for (i = 0;i < changdu;i++)
		{
			shijinzhi += an[i] * Math.pow(j1,changdu - 1 - i);
		}
		for (i = 0;;i++)
		{
			bn[i] = shijinzhi % j2;
			shijinzhi = shijinzhi / j2;
			if (shijinzhi == 0)
			{
				changdu = i + 1;
				break;
			}
		}
		for (i = changdu - 1;i >= 0;i--)
		{
			if (bn[i] >= 0 && bn[i] < 10)
			{
				b = tangible.StringFunctions.changeCharacter(b, changdu - 1 - i, bn[i] + 48);
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, changdu - 1 - i, bn[i] + 55);
			}
		}
		for (i = 0;i < changdu;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}

		return 0;
	}
}

