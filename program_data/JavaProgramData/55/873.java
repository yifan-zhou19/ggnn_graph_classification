package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int l;
		int decimal = 0;
		String c = new String(new char[40]);
		int i;
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
		l = c.length();
		if (c.charAt(0) == '0')
		{
			System.out.print("0\n");
		}
		else
		{
			for (i = 0;i < l;i++)
			{
							if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
							{
								c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 'a'-'A');
							}
			}
			int[] d = new int[40];
			for (i = 0;i < l;i++)
			{
							if (c.charAt(i) >= 'a')
							{
								c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) + 10 - 'a');
							}
							else
							{
								c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - '0');
							}
							d[i] = 1;
							for (int j = 0;j < l - i - 1;j++)
							{
											  d[i] = d[i] * a;
							}
			decimal = decimal + d[i] * c.charAt(i);
			}
			String e = new String(new char[40]);
			int k;
			int y;
			for (k = 0;decimal != 0;k++)
			{
							e = tangible.StringFunctions.changeCharacter(e, k, decimal % b);
							decimal = decimal / b;
			}
			e = tangible.StringFunctions.changeCharacter(e, k, '\0');
			String f = new String(new char[40]);
			for (y = 0;y < k;y++)
			{
				if (e.charAt(y) < 10)
				{
				f = tangible.StringFunctions.changeCharacter(f, k - 1 - y, e.charAt(y) + '0');
				}
				else
				{
				f = tangible.StringFunctions.changeCharacter(f, k - 1 - y, e.charAt(y) - 10 + 'A');
				}
			}
			f = tangible.StringFunctions.changeCharacter(f, k, '\0');
			System.out.printf("%s",f);

		}
			System.in.read();
			System.in.read();
			System.in.read();
	}



}

