package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int n;
		int k;
		int[] p = new int[100];
		int m = 0;
		int j;
		int q;
		String in = new String(new char[100]);
		char t;
		String out = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 29;i++)
		{
			t = System.in.read();
			n = i;
			if (t == 32)
			{
				if (i != 0)
				{
					break;
				}
			}
			else
			{
				in = tangible.StringFunctions.changeCharacter(in, i - 1, t);
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= n - 2;i++)
		{
			if (in.charAt(i) > 47 && in.charAt(i) < 58)
			{
				j = in.charAt(i) - 48;
			}
			if (in.charAt(i) > 64 && in.charAt(i) < 91)
			{
				j = in.charAt(i) - 55;
			}
			if (in.charAt(i) > 96 && in.charAt(i) < 123)
			{
				j = in.charAt(i) - 87;
			}
			for (k = 1 + i;k <= n - 2;k++)
			{
				j = j * a;
			}
			m = m + j;
			q = m;
		}
		for (i = 1;i <= 500;i++)
		{
			m = m / b;
			n = i;
			if (m == 0)
			{
				break;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			p[n - 1 - i] = (q % b);
			q = q / b;
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (p[i] >= 0 && p[i] <= 9)
			{
				out = tangible.StringFunctions.changeCharacter(out, i, p[i] + 48);
			}
			if (p[i] >= 10 && p[i] <= 35)
			{
				out = tangible.StringFunctions.changeCharacter(out, i, p[i] + 55);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			System.out.printf("%c",out.charAt(i));
		}
	}
}

