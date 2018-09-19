package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		int l;
		int i;
		int sum = 1;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0 ; i < l ; i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
			a.charAt(i) -= 32;
			}
		}
		for (i = 0 ; i < l ; i++)
		{
			if (a.charAt(i) == a.charAt(i + 1))
			{
				 sum++;
			}
			else
			{
				System.out.print("(");
				System.out.print(a.charAt(i));
				System.out.print(",");
				System.out.print(sum);
				System.out.print(")");
				sum = 1;
			}
		}
	}


}
