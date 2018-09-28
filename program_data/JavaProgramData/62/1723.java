package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int p;
		int i;
		int l;
		String a = new String(new char[200]);

		a = new Scanner(System.in).nextLine();
		l = a.length();
		p = 0;


		for (i = 0;i <= l - 1;i++)
		{
			if (a.charAt(i) == ' ' && (p == 0))
			{
				System.out.print(" ");
				p = 1;

			}
			else if (a.charAt(i) == ' ' && (p == 1))
			{
				continue;
			}
			else
			{
				System.out.printf("%c",a.charAt(i));
				p = 0;
				continue;
			}

		}




	}

}
