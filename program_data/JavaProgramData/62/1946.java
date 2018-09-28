package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		String p;
		cin.get(a, 100, '\n');
		p = a;
		for (int i = 0; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) == ' ')
			{
				while (a.charAt(i + 1) == ' ')
				{
					for (int l = i + 1; a.charAt(l) != '\0'; l++)
					{
						*(p.Substring(l)) = *(p.Substring(l) + 1);
					}
				}
			}
		}
		System.out.print(a);
		return 0;
	}


}
