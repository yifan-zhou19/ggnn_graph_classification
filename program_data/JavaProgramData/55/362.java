package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int m;
		int n;
		int i;
		int k;
		int t;
		int q;
		int j;
		for (i = 0;i < 100;i++)
		{
			b = b.substring(0, i);
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		i = 0;
		j = 0;
			 t = 0;
			 q = 0;
			 while (a.charAt(q) != 0)
			 {
			  t = t + (a.charAt(q) != '0');
			  q++;
			 }
		if (t != 0)
		{
		while (a.charAt(i) != 0)
		{
			if (a.charAt(i) <= '9')
			{
				k = a.charAt(i) - '0';
			}
			else
			{
				if (a.charAt(i) <= 'Z')
				{
					k = 10 + a.charAt(i) - 'A';
				}
				else
				{
					k = 10 + a.charAt(i) - 'a';
				}
			}
			j = j * m + k;
			i++;
		}
		i = 0;
		while (j != 0)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, j % n);
			j = j / n;
			i++;
		}
		for (j = 0;j <= i - 1;j++)
		{
			if (b.charAt(i - j - 1) <= 9)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, b.charAt(i - j - 1) + '0');
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, j, b.charAt(i - j - 1) - 10 + 'A');
			}
		}
		for (j = 0;j < 100;j++)
		{
			if (!((c.charAt(j) >= '0' && c.charAt(j) <= '9') || (c.charAt(j) >= 'A' && c.charAt(j) <= 'Z')))
			{
				c = c.substring(0, j);
			}
		}
		System.out.printf("%s\n",c);
		}
		else
		{
		System.out.print("0\n");
		}
	}


}

