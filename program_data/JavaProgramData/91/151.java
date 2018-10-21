package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String s = new String(new char[105]);
		String a = new String(new char[105]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		s = new Scanner(System.in).nextLine();

		for (i = 0; * (s.Substring(i)) != '\0';i++)
		{
			if (*(s.Substring(i) + 1) == '\0')
			{
		*(a.Substring(i)) = *(s.Substring(i)) + *(s.Substring(0));
			}
		else
		{
			*(a.Substring(i)) = *(s.Substring(i)) + *(s.Substring(i) + 1);
		}
		}

		*(a.Substring(i)) = '\0';
		for (i = 0; * (a.Substring(i)) != '\0';i++)
		{
			System.out.printf("%c",*(a.Substring(i)));
		}
	}
}
