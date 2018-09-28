package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int m,int n);
		int a;
		int b;
		int e;
		int sum = 0;
		int i;
		int j;
		int k;
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = 0;c.charAt(i) != 0;i++)
		{
			;
		}
		for (j = 0;j <= i - 1;j++)
		{
			if ((c.charAt(j) >= 48) && (c.charAt(j) <= 57))
			{
				sum = sum + (c.charAt(j) - 48) * f(a, i - j - 1);
			}
			else if ((c.charAt(j) >= 65) && (c.charAt(j) <= 90))
			{
				sum = sum + (c.charAt(j) - 55) * f(a, i - j - 1);
			}
			else if ((c.charAt(j) >= 97) && (c.charAt(j) <= 122))
			{
				sum = sum + (c.charAt(j) - 87) * f(a, i - j - 1);
			}
		}
		e = sum;
		for (i = 0;e >= b;i++)
		{
			d = tangible.StringFunctions.changeCharacter(d, i, e % b);
			e = e / b;
			if ((d.charAt(i) >= 0) && (d.charAt(i) <= 9))
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 48);
			}
			else if ((d.charAt(i) >= 10) && (d.charAt(i) <= 35))
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 55);
			}
		}
		if ((e >= 0) && (e <= 9))
		{
			d = tangible.StringFunctions.changeCharacter(d, i, e+48);
		}
		else if ((e >= 10) && (e <= 35))
		{
			d = tangible.StringFunctions.changeCharacter(d, i, e+55);
		}
		for (k = i;k >= 0;k--)
		{
			System.out.printf("%c",d.charAt(k));
		}
	}
	public static int f(int m,int n)
	{
		int i;
		int z = 1;
		for (i = 1;i <= n;i++)
		{
			z = z * m;
		}
		return (z);
	}


}

