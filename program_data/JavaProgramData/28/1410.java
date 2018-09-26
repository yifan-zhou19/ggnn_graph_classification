package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[1000]);
	String[] pr = new String[200];
	int i;
	int k;
	int n = 0;
	s = new Scanner(System.in).nextLine();

		pr[n++] = s;
		for (i = 0,k = 1; s.charAt(i); i = i + k,k = 1)
		{

			if (s.charAt(i) == ' ')
			{
			s = s.substring(0, i);
				for (;s.charAt(i + k) == ' ';k++)
				{
				}

			pr[n++] = s.Substring(i) + k;

			}
		}
	for (i = 0; i < n; i++)
	{
	if (i > 0)
	{
	System.out.print(",");
	}

	System.out.printf("%d", String.valueOf(pr[i]).length());


	}
	return 0;
	}
}
