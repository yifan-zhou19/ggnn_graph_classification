package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sd = new String(new char[4000]);
		sd = new Scanner(System.in).nextLine();
		int i;
		int a = 0;
		int b = 0;
		int sum = 1;
		int k;
		char[][] s = new char[200][30];
		String e = new String(new char[30]);
		for (i = 0;sd.charAt(i) != '\0';i++)
		{
			if (sd.charAt(i) == ' ' || sd.charAt(i) == ',')
			{
				s[a][b] = '\0';
				a++;
				b = 0;
				sum++;
			}
			else
			{
				s[a][b] = sd.charAt(i);
				b++;
			}
		}
		s[a][b] = '\0';
		for (k = 1;k <= sum;k++)
		{
			for (i = 0;i < sum - k;i++)
			{
				if (String.valueOf(s[i]).length() < String.valueOf(s[i + 1]).length())
				{
					e = s[i + 1];
					s[i + 1] = s[i];
					s[i] = e;
				}
			}
		}
		System.out.printf("%s\n", s[0]);
		for (k = 1;k <= sum;k++)
		{
			for (i = 0;i < sum - k;i++)
			{
				if (String.valueOf(s[i]).length() > String.valueOf(s[i + 1]).length())
				{
					e = s[i + 1];
					s[i + 1] = s[i];
					s[i] = e;
				}
			}
		}
		for (i = 0;i < sum;i++)
		{
			if (String.valueOf(s[i]).length() != 0)
			{
				s[0] = s[i];
				break;
			}
		}
		System.out.printf("%s", s[0]);
		return 0;
	}

}
