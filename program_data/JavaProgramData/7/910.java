package <missing>;

public class GlobalMembers
{
	public static char[][] zfc = new char[3][257];
	public static int Main()
	{
		zfc[1] = new Scanner(System.in).nextLine();
		zfc[2] = new Scanner(System.in).nextLine();
		zfc[3] = new Scanner(System.in).nextLine();
		int i;
		int k;
		int len;
		int len2;
		int j;
		len = String.valueOf(zfc[1]).length();
		len2 = String.valueOf(zfc[2]).length();
		for (i = 0;i < len;i++)
		{
			if ((zfc[1][i] == zfc[2][0]) && (zfc[1][i + 1] == zfc[2][1]))
			{
				break;
			}
		}
		if (i != len)
		{
		  for (k = i;k < (len2 + i);k++)
		  {
			  j = k - i;
			  zfc[1][k] = zfc[3][j];
				if (k == len2 + i)
				{
				  break;
				}
		  }
		}
		System.out.printf("%s",zfc[1]);
		return 0;
	}
}
