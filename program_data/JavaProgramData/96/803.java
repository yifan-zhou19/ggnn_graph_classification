package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int a;
		String shang = new String(new char[1000]);
		String bcs = new String(new char[1000]);
		String ys = new String(new char[1000]);
		bcs = new Scanner(System.in).nextLine();
		l = bcs.length();
		if (l == 2)
		{
			a = (bcs.charAt(0) - '0') * 10 + bcs.charAt(1) - '0';
			System.out.printf("%d\n",a / 13);
			System.out.printf("%d",a % 13);
		}
		if (l == 1)
		{
			a = bcs.charAt(0) - '0';
			System.out.printf("%d\n",0);
			System.out.printf("%d",a);
		}
		if (l > 2)
		{
		if (bcs.charAt(0) == '1' && bcs.charAt(1) <= '2')
		{
			a = (bcs.charAt(0) - '0') * 100 + (bcs.charAt(1) - '0') * 10 + bcs.charAt(2) - '0';
	for (i = 0;i <= l - 3;i++)
	{
				 shang = tangible.StringFunctions.changeCharacter(shang, i, (a / 13) + '0');
				 ys = tangible.StringFunctions.changeCharacter(ys, i, (a % 13) + '0');
				 a = ((ys.charAt(i) - '0') * 10 + bcs.charAt(i + 3) - '0');
	}
	for (j = 0;j < l - 2;j++)
	{
		if (j == l - 3)
		{
			System.out.printf("%c\n",shang.charAt(j));
		}
			else
			{
				System.out.printf("%c",shang.charAt(j));
			}
	}
			System.out.printf("%c",ys.charAt(l - 3));
		}
		else
		{
			a = ((bcs.charAt(0) - '0') * 10 + bcs.charAt(1) - '0');
			for (i = 0;i <= l - 2;i++)
			{
				shang = tangible.StringFunctions.changeCharacter(shang, i, (a / 13) + '0');
				ys = tangible.StringFunctions.changeCharacter(ys, i, (a % 13) + '0');
				a = ((ys.charAt(i) - '0') * 10 + bcs.charAt(i + 2) - '0');
			}
			for (j = 0;j < l - 1;j++)
			{
		if (j == l - 2)
		{
			System.out.printf("%c\n",shang.charAt(j));
		}
		else
		{
			System.out.printf("%c",shang.charAt(j));
		}
			}
			System.out.printf("%c",ys.charAt(l - 2));
		}
		}
		return 0;
	}

}

