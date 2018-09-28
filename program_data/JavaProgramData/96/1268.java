package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[max]);
		String shang = new String(new char[max]);
		int yu;
		int i;
		int j;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		if (n == 1)
		{
			System.out.print("0\n");
			System.out.printf("%d",a.charAt(0) - '0');
			return 0;
		}
		if (n == 2)
		{
			if (((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') < 13)
			{
				System.out.print("0\n");
				System.out.printf("%s",a);
			}
			else
			{
				System.out.printf("%d\n",((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') / 13);
				System.out.printf("%d",((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') % 13);
			}
		}
		else
		{
			yu = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
			if (yu < 13)
			{
				yu = yu * 10 + a.charAt(2) - '0';
				shang = tangible.StringFunctions.changeCharacter(shang, 0, yu / 13);
				yu = yu % 13;
			for (i = 3;i < n;i++)
			{
				yu = yu * 10 + a.charAt(i) - '0';
				shang = tangible.StringFunctions.changeCharacter(shang, i - 2, yu / 13);
				yu = yu % 13;
			}
			for (i = 0;i < n - 2;i++)
			{
			System.out.printf("%d",shang.charAt(i));
			}
			System.out.print("\n");
			System.out.printf("%d",yu);
			}

			if (yu >= 13)
			{
				shang = tangible.StringFunctions.changeCharacter(shang, 0, yu / 13);
				yu = yu % 13;
				for (i = 2;i < n;i++)
				{
				yu = yu * 10 + a.charAt(i) - '0';
				shang = tangible.StringFunctions.changeCharacter(shang, i - 1, yu / 13);
				yu = yu % 13;
				}
			for (i = 0;i < n - 1;i++)
			{
			System.out.printf("%d",shang.charAt(i));
			}
			System.out.print("\n");
			System.out.printf("%d",yu);
			}
		}
		return 0;
	}
}

