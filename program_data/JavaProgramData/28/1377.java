package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[2000]);
		String b = new String(new char[2000]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int[] c = new int[300];
		int l;
		i = 0;
		j = 0;
		k = 0;
		while (a.charAt(i) != '\0')
		{
			while (a.charAt(i) != ' ')
			{
				while (a.charAt(i) != ' ' && a.charAt(i) != '\0')
				{
					 b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
					 j++;
					 i++;
				}
				b = tangible.StringFunctions.changeCharacter(b, j, '\0');
				c[k] = b.length();
				k++;
				if (a.charAt(i) == '\0')
				{
					for (l = 0;l <= k - 2;l++)
					{
						System.out.printf("%d,",c[l]);
					}
					System.out.printf("%d\n",c[k - 1]);
					return 0;
				}
				i++;
				while (a.charAt(i) == ' ')
				{
					i++;
				}
				j = 0;
			}

			i++;
		}

		return 0;

	}
}

