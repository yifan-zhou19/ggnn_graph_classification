package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[200]);
		String p;
		char wd;
		int i;
		int n;
		str = new Scanner(System.in).nextLine();
		p = str;
		n = p.length();
		for (i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
				wd = (p.Substring(i)) + *(p.Substring(i) + 1);
		System.out.printf("%c",wd);
			}
		else
		{
			wd = (p.Substring(0)) + *(p.Substring(i));
		System.out.printf("%c",wd);
		}
		}



	}
}
