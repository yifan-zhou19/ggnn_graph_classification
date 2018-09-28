package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		char d;
		int n;
		int i;
		int j;
		int k = 102;
		int l;
		int f = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
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

			l = a.length() - b.length();
			for (j = a.length() - 1;j >= l;j--)
			{
				if (f != 0)
				{
					a.charAt(j)--;
				}
				if (a.charAt(j) >= b.charAt(j - l))
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(j - l) + '0');
					f = 0;
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10 - b.charAt(j - l) + '0');
					f = 1;
				}
			}
			for (j = l - 1;j >= 0;j--)
			{
				if (f != 0)
				{
					a.charAt(j)--;
				}
				if (a.charAt(j) < '0')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 10);
					f = 1;
				}
				else
				{
					f = 0;
				}
			}
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) != '0')
				{
					k = j;
					break;
				}
			}
			if (k == 102)
			{
				System.out.print("0\n");
			}
			else
			{
				for (j = k;j < a.length();j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
				String tempVar4 = ConsoleInput.scanfRead(null, 1);
				if (tempVar4 != null)
				{
					d = tempVar4.charAt(0);
				}
			}

		}
	}
}

