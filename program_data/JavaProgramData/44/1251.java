package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[1000]);
	public static void fanxu(String a)
	{
		int len;
		len = a.length();
		int i;
		if (a[0].equals('-'))
		{

			for (i = 1;i <= len / 2;i++)
			{
				int temp = str.charAt(i);
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(len - i));
				str = tangible.StringFunctions.changeCharacter(str, len - i, temp);
			}
		}
		else
		{
			for (i = 0;i < len / 2;i++)
			{
				int temp = str.charAt(i);
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(len - 1 - i));
				str = tangible.StringFunctions.changeCharacter(str, len - 1 - i, temp);
			}
		}
	}
	public static void show(String a)
	{
		if ((a[0].equals('-')) && (a[1].equals('0')) && (a[2].equals(0)))
		{
			System.out.printf("%d\n",0);
			return;
		}
	if ((a[0].equals('0')) && (a[1].equals(0)))
	{
			System.out.printf("%d\n",0);
			return;
	}
		int i;
		int t = 0;
		if (a[0].equals('-'))
		{
			System.out.printf("%c",a[0]);
		}
		else
		{
		t = 1;
		}
		for (i = 1 - t;a[i].equals('0');i++)
		{
			;
		}
		for (; !a[i].equals('\0');i++)
		{
			System.out.printf("%c",a[i]);
		}
		System.out.print("\n");
	}




	public static int Main()
	{
		int j;
		for (j = 1;j <= 6;j++)
		{
			str = new Scanner(System.in).nextLine();
			fanxu(str);
			show(str);
		}

		return 0;
	}


}

