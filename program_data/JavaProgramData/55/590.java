package <missing>;

public class GlobalMembers
{
	public static int v(int y,int z)
	{
		int k = 1;
		int j;
		for (j = 0;j < z;j++)
		{
			k = k * y;
		}
		return (k);
	}
	public static void Main()
	{
		int n;
		int m;
		int i;
		int k;
		int l;
		String a = new String(new char[100]);
		String b = new String(new char[200]);
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		l = a.length();
		for (i = l - 1;i >= 0;i--)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				x = x + (a.charAt(i) - '0') * v(n, l - 1 - i);
			}
			else
			{
				x = x + ((a.charAt(i) - 'A') % ('a'-'A') + 10) * v(n, l - 1 - i);
			}
		}
		for (i = 0;;i++)
		{
			if (x % m >= 0 && x % m <= 9)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, x % m + '0');
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, x % m - 10 + 'A');
			}
			x = (x - x % m) / m;
			if (x == 0)
			{
				break;
			}
		}
		for (k = i;k >= 0;k--)
		{
			System.out.printf("%c",b.charAt(k));
		}
	}
}

