package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[22]);
		String b = new String(new char[4]);
		char max;
		int i;
		int imax;
		int l1;
		int l2;
		while (scanf("%s%s",a,b) != EOF)
		{
			l1 = a.length();
			l2 = b.length();
			max = a.charAt(0);
			imax = 0;
			for (i = 1;i < l1;i++)
			{
				if (a.charAt(i) > max)
				{
					max = a.charAt(i);
					imax = i;
				}
			}
			for (i = l1 - 1;i > imax;i--)
			{
				a = tangible.StringFunctions.changeCharacter(a, i + l2, a.charAt(i));
			}
			a = tangible.StringFunctions.changeCharacter(a, l1 + l2, '\0');
			for (i = 0;i < l2;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, imax + i + 1, b.charAt(i));
			}
			System.out.println(a);
			//printf("\n");
		}
		return 0;
	}
}

