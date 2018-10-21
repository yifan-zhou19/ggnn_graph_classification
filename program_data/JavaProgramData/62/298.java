package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[201]);
		String b = new String(new char[201]);
		int i;
		int n;
		int m;
		int k;
		k = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
			k++;
			if (a.charAt(i) == 32)
			{
				for (m = i + 1;m < n;m++)
				{
					if (a.charAt(m) == 32)
					{
						i++;
					}
					else
					{
						break;
					}
				}
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, k, '\0');
		System.out.println(b);
		return 0;
	}

}

