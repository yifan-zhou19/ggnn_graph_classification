package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p = 0;
		int m;
		int n;
		int e = 1;
		int i;
		int q;
		int N;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		N = a.length();
		for (i = 0;i <= N - 1;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) - 'a' + 10);
			}
			else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) - 'A' + 10);
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) - '0');
			}
		}
		for (i = N - 1;i >= 0;i--)
		{
			p += b.charAt(i) * e;
			e *= m;
		}
		for (i = 0;;i++)
		{
		  b = tangible.StringFunctions.changeCharacter(b, i, p % n);
		  p = p / n;
		  if (p == 0)
		  {
			  q = i;
			  break;
		  }
		}
		for (i = q;i >= 0;i--)
		{
			if (b.charAt(i) >= 0 && b.charAt(i) <= 9)
			{
				System.out.printf("%c",b.charAt(i) + '0');
			}
			else
			{
				System.out.printf("%c",b.charAt(i) - 10 + 'A');
			}
		}
	}
}

