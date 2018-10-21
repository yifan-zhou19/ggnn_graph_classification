package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int t = 0;
		int i;
		int j;
		int k;
		int l;
		int m;
		int u;
		int v;
		int[] f = new int[1000];
		String c = new String(new char[1000]);
		final String d = "";
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
		u = c.length();
		for (i = 0;i < u;i++)
		{
			f[i] = c.charAt(i);
		}
		for (i = u - 1;i >= 0;i--)
		{
			if (f[i] >= 97)
			{
				f[i] = f[i] - 87;
			}
			else if (f[i] >= 65)
			{
				f[i] = f[i] - 55;
			}
			else
			{
				f[i] = f[i] - 48;
			}
		}
		for (j = 0;j < u - 1;j++)
		{
			for (k = 0;k < u - 1 - j;k++)
			{
				f[j] = f[j] * a;
			}
		}
		for (l = 0;l < u;l++)
		{
			t = t + f[l];
		}
		if (t == 0)
		{
			System.out.print("0");
		}
		else
		{
			for (m = 0;t > 0;m++)
			{
			if (t < b)
			{
			d = tangible.StringFunctions.changeCharacter(d, m, t);
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, m, t % b);
			}
			t = (t - d.charAt(m)) / b;
			if (d.charAt(m) > 9)
			{
				d = tangible.StringFunctions.changeCharacter(d, m, d.charAt(m) + 55);
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, m, d.charAt(m) + 48);
			}
			}
		}
		v = d.length();
		for (m = v - 1;m >= 0;m--)
		{
				System.out.printf("%c",d.charAt(m));
		}
		return 0;
	}
}

