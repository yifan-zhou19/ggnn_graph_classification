package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		String d = new String(new char[101]);
		int n;
		int i;
		int j;
		int n1;
		int n2;
		int k;
		int m;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c,0,(Character.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			n1 = a.length();
			n2 = b.length();
			for (i = 0;i < n1;i++)
			{
				a.charAt(i) -= '0';
			}
			for (i = 0;i < n2;i++)
			{
				b.charAt(i) -= '0';
			}
			if (n1 - n2 != 0)
			{
				for (i = 0;i < (n1 - n2);i++)
				{
					d = d.substring(0, i);
				}
			}
			for (i = n1 - n2,k = 0;i < n1 || k < n2;i++,k++)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, b.charAt(k));
			}
			for (i = 1;i <= n1;i++)
			{
				if (a.charAt(n1 - i) >= d.charAt(n1 - i))
				{
					c = tangible.StringFunctions.changeCharacter(c, n1 - i, a.charAt(n1 - i) - d.charAt(n1 - i));
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, n1 - i, a.charAt(n1 - i) + 10 - d.charAt(n1 - i));
					if (a.charAt(n1 - 1 - i) == 0)
					{
						t = i;
						do
						{
							a = tangible.StringFunctions.changeCharacter(a, n1 - 1 - i, a.charAt(n1 - 1 - i) + 9);
							i++;
						}while (a.charAt(n1 - 1 - i) == 0);
						a.charAt(n1 - 1 - i)--;
						i = t;
					}
					else
					{
						a.charAt(n1 - 1 - i)--;
					}
				}
			}
			i = 0;
			while (c.charAt(i) == 0 && i < n1)
			{
				i++;
			}
			if (i == n1)
			{
				System.out.print("0\n");
				continue;
			}
			m = i;
			for (i = m;i < n1;i++)
			{
				System.out.printf("%d",c.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

