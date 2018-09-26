package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		char[][] word = new char[101][30];
		int i;
		int x;
		int y;
		int len;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		x = y = 0;
		for (i = 0;i <= len;i++)
		{

			if (str.charAt(i) == ' ' || str.charAt(i) == ',' || str.charAt(i) == '.')
			{
				if (y == 0)
				{
					continue;
				}
				else
				{
				word[x][y] = '\0';
				x++;
				y = 0;
				}
			}
			else
			{
				word[x][y++] = str.charAt(i);
			}
		}
		System.out.printf("%s",word[0]);
		for (i = 1;i <= x;i++)
		{


		System.out.printf(" %s",word[i]);
		}

	}


}
