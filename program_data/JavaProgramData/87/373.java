package <missing>;

public class GlobalMembers
{
	public static void qkg(tangible.RefObject<String> a)
	{
		int len;
		len = a.argValue.length();
		int i;
		int j = 0;
		String b = new String(new char[100]);
		for (i = 0;i < len;i++)
		{
			if (a.argValue.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.argValue.charAt(i));
				j++;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		a.argValue = b;
	}
	public static void qdykg(tangible.RefObject<String> a)
	{
		int len;
		len = a.argValue.length();
		int i;
		int j = 0;
		String b = new String(new char[101]);
		for (i = 0;i < len;i++)
		{
			if (a.argValue.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.argValue.charAt(i));
				j++;
			}
			else if (a.argValue.charAt(i) == ' ' && a.argValue.charAt(i + 1) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.argValue.charAt(i));
				j++;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		a.argValue = b;
	}
	public static void dbx(tangible.RefObject<String> a)
	{
		int len;
		len = a.argValue.length();
		int i;
		for (i = 0;i < len;i++)
		{
			if (a.argValue.charAt(i) >= 'A' && a.argValue.charAt(i) <= 'Z')
			{
				a.argValue.charAt(i) += 'a'-'A';
			}
		}
	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int sw;
		int xw;
		while (true)
		{

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				e = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				f = Integer.parseInt(tempVar6);
			}
			if (a == 0)
			{
				break;
			}
			sw = (12 - a) * 3600 - b * 60 - c;
			xw = d * 3600 + e * 60 + f;
			int ans = sw + xw;
			System.out.printf("%d\n",ans);
		}
		return 0;
	}
}

