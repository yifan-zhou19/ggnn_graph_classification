package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[110]);
		String str2 = new String(new char[110]);
		String p;
		String q;
		int i;
		p = str1;
		q = str2;
		p = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (*(p.Substring(i) + 1) == '\0')
			{
				*(q.Substring(i)) = *(p.Substring(i)) + p;
				*(q.Substring(i) + 1) = '\0';
				break;
			}
			else
			{
				*(q.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
			}
		}
		q = str2;
		for (i = 0;;i++)
		{
			if (*(q.Substring(i)) != '\0')
			{
				System.out.printf("%c",*(q.Substring(i)));
			}
			else
			{
				break;
			}
		}
		System.out.print("\n");
		return 0;
	}

}
