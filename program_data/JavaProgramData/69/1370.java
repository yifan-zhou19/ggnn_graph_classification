package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[250]);
		String str2 = new String(new char[250]);
		String str3 = new String(new char[250]);
		String str4 = new String(new char[250]);
		String str5 = new String(new char[251]);
		int a;
		int b;
		int c;
		int i;
		int j;
		int k;
		int p;
		int q;
		int r;
		int s;
		int t;
		int u;
		int v;
		int w;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		a = str1.length();
		b = str2.length();
		if (a < b)
		{
			for (i = 0;i <= 249;i++)
			{
			str3 = tangible.StringFunctions.changeCharacter(str3, i, str1.charAt(i));
		str1 = tangible.StringFunctions.changeCharacter(str1, i, str2.charAt(i));
		str2 = tangible.StringFunctions.changeCharacter(str2, i, str3.charAt(i));
			}
		} //?????????????????1????2
		a = str1.length();
		b = str2.length();
		c = a - b;
		if (c > 0)
		{
		for (j = 0;j <= c - 1;j++)
		{
		str4 = tangible.StringFunctions.changeCharacter(str4, j, '0');
		}
		for (k = c;k <= 249;k++)
		{
		str4 = tangible.StringFunctions.changeCharacter(str4, k, str2.charAt(k - c));
		}
		}
		else
		{
		for (p = 0;p <= 249;p++)
		{
		str4 = tangible.StringFunctions.changeCharacter(str4, p, str2.charAt(p));
		}
		} //???????????????0
		for (u = 0;u <= 250;u++)
		{
		str5 = tangible.StringFunctions.changeCharacter(str5, u, '0');
		}
		for (q = a - 1;q >= 0;q--)
		{
		r = str1.charAt(q) + str4.charAt(q) + str5.charAt(q + 1) - 144;
		if (r > 9)
		{
			str5 = tangible.StringFunctions.changeCharacter(str5, q + 1, r - 10 + '0');
		 str5 = tangible.StringFunctions.changeCharacter(str5, q, str5.charAt(q) + 1);
		}
		else
		{
		str5 = tangible.StringFunctions.changeCharacter(str5, q + 1, r + '0');
		}
		} //?????
		for (v = 0;v <= a;v++)
		{
			w = str5.charAt(v) - 48;
		if (w != 0)
		{
			x = v;
		break;
		}
		else
		{
		x = 251;
		}
		}
		if (251 == x)
		{
		System.out.printf("%d",0);
		}
		else
		{
			for (y = x;y <= a;y++)
			{
		System.out.printf("%c",str5.charAt(y));
			}
		} //???????0??????
		//printf("%s",str5);
	}

}

