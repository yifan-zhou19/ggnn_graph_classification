package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[301]);
		a = new Scanner(System.in).nextLine();
		int n;
		n = a.length();
		int i;
		int j;
		char temp;
		int num = 0;
		int sign = 0;
		for (j = 0;j < n;j++)
		{
			for (i = 1;i < n - j;i++)
			{
				if (a.charAt(i - 1) > a.charAt(i))
				{
					temp = a.charAt(i);
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - 1));
					a = tangible.StringFunctions.changeCharacter(a, i - 1, temp);
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (((a.charAt(i) >= 'A') && (a.charAt(i) <= 'Z')) || ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z')))
			{
				sign = 1;
				num = 1;
				for (j = i + 1;j < n;j++)
				{
					if (a.charAt(j) == a.charAt(i))
					{
						num++;
						a = tangible.StringFunctions.changeCharacter(a, j, -1);
					}
				}
				System.out.printf("%c=%d\n", a.charAt(i), num);
			}
		}
		if (sign == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

