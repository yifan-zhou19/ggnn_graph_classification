package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h = 0;
		int k = 0;
		int i;
		int j;
		int len;
		String zfc = new String(new char[1000]);
		char[][] word = new char[50][20];
		String temp = new String(new char[50]);
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;i < zfc.length() + 1;i++)
		{
			if (zfc.charAt(i) != ' ')
			{
			word[h][k] = zfc.charAt(i);
			k++;
			}
			else if (zfc.charAt(i) == '\0')
			{
				word[h][k] = '\0';
			}
			else
			{
				word[h][k] = '\0';
				h++;
				k = 0;
			}
		}

		len = h + 1;
		 for (j = 1;j <= len;j++)
		 {
			for (h = 0;h < len - j;h++)
			{
				if (String.valueOf(word[h]).length() > String.valueOf(word[h + 1]).length())
				{
					temp = word[h];
					word[h] = word[h + 1];
					word[h + 1] = temp;
				}
			}
		 }
	  System.out.println(word[len - 1]);
	  System.out.println(word[0]);
	  return 0;
	}

}
