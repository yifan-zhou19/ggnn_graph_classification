package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int[] flag = new int[100];
		char[][] zf = new char[100][100];
		String shuzi = new String(new char[100]);
		shuzi = new Scanner(System.in).nextLine();
		n = Integer.parseInt(shuzi);
		for (i = 0;i < n;i++)
		{
			flag[i] = 1;
			zf[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			if ((zf[i][0] < 'A') || ((zf[i][0]>'Z') && (zf[i][0] < 'a') && (zf[i][0] != '_')) || (zf[i][0]>'z'))
			{
				flag[i] = 0;
			}
			for (j = 1;j < String.valueOf(zf[i]).length();j++)
			{
			if ((zf[i][j] < '0') || (zf[i][j] < 'A' && zf[i][j]>'9') || ((zf[i][j]>'Z') && (zf[i][j] < 'a') && (zf[i][j] != '_')) || (zf[i][j]>'z'))
			{
					flag[i] = 0;
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",flag[i]);
		}
		return 0;
	}
}
