package <missing>;

public class GlobalMembers
{
	public static char[][] zfc = new char[300][100];
	public static int Main()
	{
		int i = 0;
		int len;
		int len2 = 0;
		zfc[1] = new Scanner(System.in).nextLine();
		len = String.valueOf(zfc[1]).length();
		while (i < len + 1)
		{

			if (zfc[1][i] != 32)
			{
				len2 += 1;
				i++;
			}
			else if (len2 != 0)
			{
				System.out.printf("%d"",",len2);
				i++;
				len2 = 0;
			}
			else if (len2 == 0)
			{
				i++;
			}
			if (zfc[1][i + 1] == '\0')
			{
				System.out.printf("%d",len2 + 1);
				break;
			}
		}
		return 0;
	}
}
