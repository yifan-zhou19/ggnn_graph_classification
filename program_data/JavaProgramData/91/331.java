package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		String a = new String(new char[200]);
		String p = a;
		char c;
		cin.get(a,200);
		s = a.length();
		for (int i = 0;i < s;i++)
		{
			if (i == s - 1)
			{
				c = p + *(p.Substring(i));
			}
			else
			{
				c = (p.Substring(i)) + *(p.Substring(i) + 1);
			}
			System.out.print(c);
		}
	}
}
