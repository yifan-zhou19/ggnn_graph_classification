package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[100]);
	public static String c1 = new String(new char[100]);
	public static String c2 = new String(new char[100]);
	public static int pd(int l)
	{
		int i;
		int j;
		int k;
		char temp;
		k = 0;
		for (i = 0;i < 1;i)
		{

			if (str.charAt(l) != c1.charAt(k))
			{
				return 0;
			}
			k++;
			temp = str.charAt(l + 1);
			if ((temp == ' ') || (temp == '\t') || (temp == '\r') || (temp == '\n'))

			{

				if (k == (c1.length()))
				{
					return 1;
				}
			   else
			   {
				   return 0;
			   }
			}
			l++;
		}

	}

	public static int Main()
	{
		char temp;
		int i;
		int j;
		int n;
		int k;
		int m;
		str = new Scanner(System.in).nextLine();
		c1 = new Scanner(System.in).nextLine();
		c2 = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (i > 0)
			{
				temp = str.charAt(i - 1);
			}
			if (i == 0)
			{
				temp = 0;
			}
			if ((i == 0) || (temp == ' ') || (temp == '\t') || (temp == '\r') || (temp == '\n'))
			{
				k = pd(i);
				m = 0;
				if (k == 1)
				{
					System.out.printf("%s",c2);
					i = i + c1.length() - 1;
				}

				else
				{
					System.out.printf("%c",str.charAt(i));
				}
			}
			else
			{
					System.out.printf("%c",str.charAt(i));
			}
		}
		System.out.print("\n");
	}

}
