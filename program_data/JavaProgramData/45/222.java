package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		for (i = 0;;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
		if (a.charAt(i) == ' ')
		{
			break;
		}
		}
		b = new Scanner(System.in).nextLine();
		j = b.length();
		for (k = 0;k <= j - i;k++)
		{
			for (l = 0;a.charAt(l) == b.charAt(k);l++,k++)
			{
				if (l == i - 1)
				{
					System.out.printf("%d\n",k - i + 1);
					break;
				}
			}
			if (l == i - 1)
			{
				break;
			}
		}
	}

}

