package <missing>;

public class GlobalMembers
{
	public static String ctt = new String(new char[200]);
	public static int Main()
	{
		String a = new String(new char[150]);
		String b = new String(new char[150]);
		int l;
		int i;
		a = new Scanner(System.in).nextLine();
		l = a.length() - 1;
		for (i = 0;i <= l;i++)
		{
			if (i != l)
			{
				*(b.Substring(i)) = *(a.Substring(i)) + *(a.Substring(i) + 1);
			}
			else
			{
				*(b.Substring(i)) = *(a.Substring(i)) + *(a.Substring(0));
				*(b.Substring(i) + 1) = '\0';
			}
		}
		System.out.printf("%s",b);
		return 0;
	}
}
