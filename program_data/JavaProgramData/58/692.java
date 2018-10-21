package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] zf = new char[10000][81];
		String num = new String(new char[10]);
		int n;
		int i;
		int j;
		num = new Scanner(System.in).nextLine();
		n = Integer.parseInt(num);
		for (i = 0;i < n;i++)
		{
			zf[i] = new Scanner(System.in).nextLine();
			if ((zf[i][0] < 'A' || (zf[i][0]>'Z' && zf[i][0] < 'a') || zf[i][0]>'z') && zf[i][0] != '_')
			{
				System.out.print("0\n");
			}
			else
			{
				for (j = 0;zf[i][j] != '\0';j++)
				{
					if ((zf[i][j] < 'A' || (zf[i][j]>'Z' && zf[i][j] < 'a') || zf[i][j]>'z') && (zf[i][j] != '_') && (zf[i][j] > '9' || zf[i][j] < '0'))
					{
						System.out.print("0\n");
						break;
					}
					if (zf[i][j + 1] == '\0')
					{
						System.out.print("1\n");
						break;
					}
				}
			}
		}
	}


}
