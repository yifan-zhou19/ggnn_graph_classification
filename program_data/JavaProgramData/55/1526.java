package <missing>;

public class GlobalMembers
{
	public static int zh(char a)
	{
		int b;
		if ((a >= 'A') && (a <= 'Z'))
		{
			b = (int)(a) - 55;
			return b;
		}
		else
		{
			b = (int)(a) - 48;
			return b;
		}
	}
	public static char fzh(int a)
	{
		char b;
		if (a > 9)
		{
			b = (char)(a + 55);
			return b;
		}
		else
		{
			b = (char)(a + 48);
			return b;
		}
	}
	public static int cf(int a,int b)
	{
		int i;
		int sum = a;
		if (b == 0)
		{
			sum = 1;
		}
		for (i = 0;i < b - 1;i++)
		{
			sum *= a;
		}
		return sum;
	}
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int l;

		String c = new String(new char[10000]);
		String t = new String(new char[10000]);
		int sum = 0;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = c.length();
		for (i = 0;i < l;i++)
		{
			if ((c.charAt(i) >= 'a') && (c.charAt(i) <= 'z'))
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'a'+'A');
			}
		}


		for (i = 0;i < l;i++)
		{
			sum += cf(a, l - 1 - i) * zh(c.charAt(i));
		}


		if (sum == 0)
		{
		System.out.print("0");
		}


		for (i = 0;sum != 0;i++)
		{
			t = tangible.StringFunctions.changeCharacter(t, i, fzh(sum % b));
			sum = sum / b;
		}

		for (j = i - 1;j >= 0;j--)
		{
			System.out.printf("%c",t.charAt(j));
		}


		System.out.print("\n");

		return 0;
	}



}

