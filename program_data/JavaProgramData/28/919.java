package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		String[] pr = new String[300];
		int i;
		int n = 0;
		int len;


		s = new Scanner(System.in).nextLine();


		len = s.length();
		pr[n++] = s;
		for (i = 0; i < len; i++)
		{
			if (s.charAt(i) == ' ')
			{
				s = s.substring(0, i);
				pr[n++] = s.Substring(i) + 1;
			}
		}

		for (i = 0;i < n - 1;i++)
		{
			len = String.valueOf(pr[i]).length();
			if (len != 0)
			{
				System.out.printf("%d,",len);
			}
		}
		len = String.valueOf(pr[n - 1]).length();
		if (len != 0)
		{
			System.out.printf("%d",len);
		}
		return 0;
	}

}
