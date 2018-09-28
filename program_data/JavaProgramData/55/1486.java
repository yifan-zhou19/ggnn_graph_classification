package <missing>;

public class GlobalMembers
{
	public static int f(char x)
	{
		int xx;
		xx = x - 48;
		if (xx > 9)
		{
			xx = x - 'A' + 10;
		}
		if (xx > 36)
		{
			xx = x - 'a' + 10;
		}
		return xx;
	}
	public static char g(int y)
	{
		 char yy;
		 if (y < 10)
		 {
			 yy = y + '0';
		 }
		 if (y >= 10)
		 {
			 yy = y - 10 + 'A';
		 }
		 return yy;
	}
	public static int Main()
	{
		int nn = 0;
		int a;
		int b;
		int i;
		String n = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		int length = n.length();
		int k = 1;
		for (i = length - 1;i >= 0;i--)
		{
				nn += f(n.charAt(i)) * k;
				k *= a;
		}
		int[] m = new int[500];
		int j = 0;
		do
		{
				m[j] = nn % b;
				nn = nn / b;
				j++;
		} while (nn >= 1);
		for (i = j - 1;i >= 0;i--)
		{
			System.out.printf("%c",g(m[i]));
		}

	}
}

