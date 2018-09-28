package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		int a;
		int b;
		int k;
		int d;
		int i;
		int j;
		int c;
		int n;
		k = 0;
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
		for (i = s.length() - 1;i >= 0;i--)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				d = 10 + (int)(s.charAt(i) - 'a');
			}
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				d = 10 + (int)(s.charAt(i) - 'A');
			}
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				d = (int)(s.charAt(i) - '0');
			}
			n = s.length() - 1 - i;
			c = 1;
			for (j = 0;j < n;j++)
			{
				c *= a;
			}
			k = k + d * c;
		}
		for (i = 0;;i++)
		{
			if (k % b <= 9)
			{
			   c = k % b + 48;
			   s = tangible.StringFunctions.changeCharacter(s, i, (char)(c));
			}
			if (k % b > 9)
			{
				c = k % b + 55;
				s = tangible.StringFunctions.changeCharacter(s, i, (char)(c));
			}
			if (k / b == 0)
			{
				break;
			}
			k = k / b;
		}
		d = i;
		for (i = d;i >= 0;i--)
		{
			System.out.printf("%c",s.charAt(i));
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			1 = Integer.parseInt(tempVar4);
		}
		return 0;
	}

}

