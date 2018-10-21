package <missing>;

public class GlobalMembers
{
	public static void MINUS(tangible.RefObject<String> a, tangible.RefObject<String> btemp)
	{
		int lena;
		int lenb;
		int i;
		int j;
		String b = new String(new char[200]);
		int temp = 0;
		char tt = '0';
		lena = a.argValue.length();
		lenb = btemp.argValue.length();
		for (i = 0;i < lena - lenb;i++) //??
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		for (j = i + 1;i < 200;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, btemp.argValue.charAt(i - lena + lenb));
		}
		for (i = lena - 1;i >= 0;i--)
		{
			if (a.argValue.charAt(i) - b.charAt(i) + temp >= 0)
			{
				a.argValue.charAt(i) = a.argValue.charAt(i) - b.charAt(i) + temp + 48;
			temp = 0;
			}
			else
			{
				a.argValue.charAt(i) = a.argValue.charAt(i) - b.charAt(i) + temp + 48 + 10;
				temp = -1;
			}
		}
	for (i = 0;i < 200;i++)
	{
		if (a.argValue.charAt(i) == '\0')
		{
			break;
		}
		if (a.argValue.charAt(i) != tt)
		{
			System.out.print(a.argValue.charAt(i));
		tt = '*';
		}

	}
	System.out.print('\n');
	}
	public static void Main()
	{
		char[][] jian = new char[50][200];
		char[][] beijian = new char[50][200];
		int n;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				beijian[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				jian[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			MINUS(beijian[i], jian[i]);
		}
	}




}

