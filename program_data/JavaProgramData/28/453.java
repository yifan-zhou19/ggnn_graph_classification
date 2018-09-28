package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int i;
		int j;
		int k;
		int l;
		int[] b = new int[1000];
	String str = new String(new char[10000]);

		s = 0;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		str = tangible.StringFunctions.changeCharacter(str, l, ' ');
		str = tangible.StringFunctions.changeCharacter(str, l + 1, '\0');


		for (i = 0;i < l;i++)
		{
			if (str.charAt(i) != ' ')
			{
				j = i;
				for (k = j + 1;k <= l;k++)
				{
					if (str.charAt(k) == ' ')
					{
						s = s + 1;
						b[s] = k - j;
						i = k;
						break;

					}
				}
			}
		}
		System.out.printf("%d",b[1]);
		for (i = 2;i <= s;i++)
		{
			System.out.printf(",%d",b[i]);
		}
	}





}

