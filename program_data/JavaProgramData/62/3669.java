package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int s;
		int e;
		String a = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (s = 0;s < n;s++)
		{
			if (a.charAt(s) == ' ' && a.charAt(s + 1) == ' ')
			{
				for (e = s + 1;e < n;e++)
				{
					if (a.charAt(e) != ' ')
					{
						break;
					}
				}
				for (i = s + 1;i < e;i++)
				{
					a = a.substring(0, i);
				}
				s = e;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != 0)
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
	}


}
