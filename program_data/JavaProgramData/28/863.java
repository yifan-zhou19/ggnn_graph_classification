package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
		String zfc = new String(new char[3000]);
		int[] board = new int[300];
		int len = 0;
		int count = 0;
		int i;
		int j;
		int l;
		int k = 0;
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			for (l = 0;l < 32;l++)
			{
				if (zfc.charAt(i) == ' ' && zfc.charAt(i + 1) == ' ')
				{
					for (j = i + 1;zfc.charAt(j) != '\0';j++)
					{
						zfc = tangible.StringFunctions.changeCharacter(zfc, j, zfc.charAt(j + 1));
					}
				}
			}
		}
		len = zfc.length();
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) == ' ' && zfc.charAt(i + 1) != ' ')
			{
				count++;
			}
		}
		for (j = 0;zfc.charAt(j) != '\0';j++)
		{
			if (zfc.charAt(j) == ' ' && zfc.charAt(j + 1) != ' ')
			{
				board[k] = j;
				k++;
			}
		}
		if (count == 0)
		{
			System.out.printf("%d",len);
		}
		if (count > 0)
		{
		System.out.printf("%d,",board[0]);
		for (i = 0;i < count - 1;i++)
		{
			System.out.printf("%d,",board[i + 1] - board[i] - 1);
		}
		System.out.printf("%d",len - board[count - 1] - 1);
		}
		return 0;
		}
}

