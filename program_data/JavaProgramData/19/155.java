package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[200]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int l;
		int result = 0;
		int i;
		int j;
		int l1;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		l = s.length();
		l1 = a.length();
		for (i = 0;i <= l - 1;i++)
		{
			result = 0;
			if ((i == 0) || (s.charAt(i - 1) == ' '))
			{
			result = 1;
			for (j = i;j <= i + (l1 - 1);j++)
			{
				if (s.charAt(j) != a.charAt(j - i))
				{
					result = 0;
				}
			}
			}
			if (result == 1)
			{
				System.out.printf("%s",b);
				i = i + l1 - 1;
			}
			else
			{
				System.out.printf("%c",s.charAt(i));
			}

		}
	}

}
