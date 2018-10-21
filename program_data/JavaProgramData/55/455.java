package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l;
		int x;
		int y;
		int i;
		int j;
		int n;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) < 58)
			{
				n = x * n + a.charAt(i) - 48;
			}
			else if (a.charAt(i) > 96)
			{
				n = x * n + a.charAt(i) - 87;
			}
			else
			{
				n = x * n + a.charAt(i) - 55;
			}
		}
		for (i = 0;n != 0;i++)
		{
			if (n % y < 10)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, n % y + 48);
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, n % y + 55);
			}
			n = (n - n % y) / y;
		}
		if (i == 0)
		{
			System.out.print("0");
		}
		for (j = i - 1;j >= 0;j--)
		{
			System.out.printf("%c",b.charAt(j));
		}
		System.out.print("\n");
	}

}

