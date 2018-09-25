package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String substr = new String(new char[256]);
		String rep = new String(new char[256]);
		int i;
		int j;
		int flag;
		int a;
		int b;
		int c;


		str = new Scanner(System.in).nextLine();
		substr = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();

		a = substr.length();
		b = str.length();
		c = rep.length();

		for (i = 0;i < b;i++)
		{
			flag = 1;
			for (j = 0;j < a;j++)
			{
				if (str.charAt(i + j) != substr.charAt(j))
				{
					flag = 0;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}

		if (i == b)
		{
			System.out.println(str);
		}
		else
		{


			for (j = 0;j < i;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			for (j = 0;j < c;j++)
			{
				System.out.printf("%c",rep.charAt(j));
			}
			for (j = i + a;j < b;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}

		}
		return 0;
	}
}
