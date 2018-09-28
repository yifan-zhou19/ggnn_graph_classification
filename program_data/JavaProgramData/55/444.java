package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int s = 0;
		int a;
		int b;
		int n;
		int m;
		int i = 0;
		int[] x = new int[100];
		int[] y = new int[100];
		String d = new String(new char[100]);
		String c = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			d = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		n = d.length();
		for (i = 0;i < n;i++)
		{
			if (d.charAt(i) >= 'A' && d.charAt(i) <= 'Z')
			{
				x[i] = d.charAt(i) - 55;
			}
			else if (d.charAt(i) >= 'a' && d.charAt(i) <= 'z')
			{
					x[i] = d.charAt(i) - 87;
			}
			else if (d.charAt(i) >= '0' && d.charAt(i) <= '9')
			{
					x[i] = d.charAt(i) - 48;
			}
		}
		for (i = 0;i < n;i++)
		{
			s = s * a + x[i];
		}
		m = 0;
		while (s >= b)
		{
			y[m] = s % b;
			s = s / b;
			m++;
		}
		y[m] = s;
		for (i = m;i >= 0;i--)
		{
			if (y[i] < 9)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, y[i] + 48);
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, y[i] + 55);
			}
			System.out.printf("%c",c.charAt(i));
		}
	}
}

