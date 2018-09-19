package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int j;
		int al;
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		al = a.length();
		for (i = 0;i <= al - 1;i++)
		{
			if (a.charAt(i) > 'Z')
			{
				a.charAt(i) += 'A'-'a';
			}
		}
		for (i = 0;i <= 999;i++)
		{
			for (k = 1;k < 998;k++)
			{
				if (a.charAt(i + k) != a.charAt(i))
				{
					System.out.print("(");
					System.out.print(a.charAt(i));
					System.out.print(",");
					System.out.print(k);
					System.out.print(")");
					i += k - 1;
					break;
				}

			}
			if (i >= al - 1)
			{
				break;
			}
		}
			return 0;



	}
}
