package <missing>;

public class GlobalMembers
{
	public static int convertorto10(String A, int code, int right)
	{
		if (right == 0)
		{
			return (A[0] - '0');
		}
		else
		{
			return (A[right] - '0' + code * convertorto10(A, code, right - 1));
		}
	}
	public static void Main()
	{
		int a;
		int b;
		int l;
		int c;
		int i;
		int j;
		String n = new String(new char[100]);
		String nf = new String(new char[100]);
		String m = new String(new char[100]);
		String mf = new String(new char[100]);
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = n.length();
		for (i = 0;i < l;i++)
		{
			if (64 < n.charAt(i) && n.charAt(i) < 91)
			{
				nf = tangible.StringFunctions.changeCharacter(nf, i, n.charAt(i) - 7);
			}
			else if (n.charAt(i) > 96)
			{
				nf = tangible.StringFunctions.changeCharacter(nf, i, n.charAt(i) - 39);
			}
			else
			{
				nf = tangible.StringFunctions.changeCharacter(nf, i, n.charAt(i));
			}
		}
		c = convertorto10(nf, a, l - 1);
		i = 0;
		while (c / b > 0)
		{
			m = tangible.StringFunctions.changeCharacter(m, i, c % b);
			c = c / b;
			i = i + 1;
		}
		m = tangible.StringFunctions.changeCharacter(m, i, c);
		for (j = 0;j <= i;j++)
		{
			mf = tangible.StringFunctions.changeCharacter(mf, j, m.charAt(i - j));
		}
		for (j = 0;j <= i;j++)
		{
			if (mf.charAt(j) < 10)
			{
				mf = tangible.StringFunctions.changeCharacter(mf, j, mf.charAt(j) + 48);
			}
			else if (mf.charAt(j) > 9)
			{
				mf = tangible.StringFunctions.changeCharacter(mf, j, mf.charAt(j) + 55);
			}
		}
		for (j = 0;j <= i;j++)
		{
			System.out.printf("%c",mf.charAt(j));
		}
	}

}

