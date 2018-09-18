package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[600]);
		char[][] dc = new char[30][30];
		String y = new String(new char[30]);
		String h = new String(new char[30]);
		zf = new Scanner(System.in).nextLine();
		y = new Scanner(System.in).nextLine();
		h = new Scanner(System.in).nextLine();
		int n = zf.length();
		int a = 0;
		int b = 0;
		for (int i = 0;i < n + 1;i++)
		{
			if (zf.charAt(i) != ' ' && zf.charAt(i) != '\n')
			{
				dc[a][b] = zf.charAt(i);
				b++;
			}
			else
			{
				dc[a][b] = '\0';
				a++;
				b = 0;
			}
		}
		for (int k = 0;k < a + 1;k++)
		{
			if (strcmp(dc[k],y) == 0)
			{
				dc[k] = h;
			}
		}
		System.out.printf("%s",dc[0]);
		for (int m = 1;m < a + 1;m++)
		{
			System.out.printf(" %s",dc[m]);
		}
		return 0;
	}

}
