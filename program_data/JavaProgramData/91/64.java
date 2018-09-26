package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		final String c = "";
		final String q = "";
			c = new Scanner(System.in).nextLine();
		int i = 0;
		int n = c.length();
		for (i = 0;i < n;i++)
		{
			if (i < n - 1)
			{
				*(q.Substring(i)) = *(c.Substring(i)) + *(c.Substring(i) + 1);
			}
			else
			{
				*(q.Substring(i)) = *(c.Substring(i)) + *c;
			}
		}
		System.out.printf("%s",q);
	}
}
