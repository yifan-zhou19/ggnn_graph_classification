package <missing>;

public class GlobalMembers
{
	public static void read(String x) // read is used to overturn x[]
	{
		String temp = new String(new char[100]);
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			temp = tempVar.charAt(0);
		}
		k = temp.length();
		x[k] = null;
		for (i = 0;i < k;i++)
		{
			x[i] = temp.charAt(k - 1 - i);
		}
	}

	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int la;
		int lb;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++)
		{
			read(a);
			read(b);
			la = a.length();
			lb = b.length();
			for (i = 0;i < lb;i++)
			{
				if (a.charAt(i) < b.charAt(i))
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 10 - b.charAt(i) + '0');
					a.charAt(i + 1)--;
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - b.charAt(i) + '0');
				}
			}
			for (i = lb;i < la;i++)
			{
				if (a.charAt(i) < '0')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 10);
					a.charAt(i + 1)--;
				}
			}
			for (i = 0,j = 0;i < la;i++)
			{
				if (a.charAt(la - 1 - i) != '0' || j != 0)
				{
				System.out.printf("%c",a.charAt(la - 1 - i));
				j = 1;
				}
			}
			if (j == 0)
			{
				System.out.print("0");
			}
			System.out.print("\n");
		}
	}
}

