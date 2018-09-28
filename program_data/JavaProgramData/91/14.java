package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[200]);
		String f = new String(new char[200]);
		String ps = s;
		String pf = f;

		int len;
		int i;

		ps = new Scanner(System.in).nextLine();

		len = s.length();

		for (i = 0;i < len - 1;i++)
		{

			*(pf.Substring(i)) = *(ps.Substring(i)) + *(ps.Substring(i) + 1);
		}

		*(pf.Substring(len) - 1) = (ps) + *(ps.Substring(len) - 1);

		*(pf.Substring(len)) = '\0';

		System.out.printf("%s",f);





		return 0;
	}
}
