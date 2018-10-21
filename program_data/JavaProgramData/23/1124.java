package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		String a = new String(new char[102]);

		int i;
		int ch;
		int j;
		a = new Scanner(System.in).nextLine();
		ch = a.length();
		int[] shu = new int[102];
		int m = 0;
		for (i = 0;i < ch;i++)
		{
			if (a.charAt(i) > 'z' || a.charAt(i) < 'A')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, 100);
				m++;
				shu[m] = i;
			}
		}
		if (m != 0)
		{
		for (i = shu[m] + 1;i < ch;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print(" ");
		for (i = m - 1;i >= 1;i--)
		{
			for (j = shu[i] + 1;j < shu[i + 1];j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
			System.out.print(" ");
		}
		for (i = 0;i < shu[1];i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		}
		else
		{
		System.out.printf("%s",a);
		}

	}

}

