package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		final String s1 = "";
		final String s2 = "";
		s1 = new Scanner(System.in).nextLine();
		for (i = 0; * (s1.Substring(i) + 1) != '\0';i++)
		{
			*(s2.Substring(i)) = *(s1.Substring(i)) + *(s1.Substring(i) + 1);
		}
		*(s2.Substring(i)) = *(s1.Substring(i)) + *s1;
		System.out.println(s2);
		return 0;
	}

}
