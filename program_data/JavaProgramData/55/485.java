package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int a;
		int b;
		int[] c = new int[100];
		int d;
		int A = 0;
		String s = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if (s.charAt(l - i - 1) >= '0' && s.charAt(l - i - 1) <= '9')
			{
				c[i] = s.charAt(l - i - 1) - '0';
			}
			if (s.charAt(l - i - 1) >= 'a' && s.charAt(l - i - 1) <= 'z')
			{
				c[i] = s.charAt(l - i - 1) - 'a' + 10;
			}
			if (s.charAt(l - i - 1) >= 'A' && s.charAt(l - i - 1) <= 'Z')
			{
				c[i] = s.charAt(l - i - 1) - 'A' + 10;
			}
			A = (double)A + (double)c[i] * Math.pow((double)a,(double)i);
		}
		for (i = 0;;i++)
		{
			d = A % b;
			if (d <= 9)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, d + '0');
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, i, d - 10 + 'A');
			}
			A = A / b;
			if (A == 0)
			{
				break;
			}
		}
		for (;i >= 0;i--)
		{
			System.out.printf("%c",s.charAt(i));
		}
		return 0;
	}

}

