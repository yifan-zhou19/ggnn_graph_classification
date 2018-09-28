package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String zf = new String(new char[800]);
	   char[][] dc = new char[300][20];
	   zf = new Scanner(System.in).nextLine();
	   int n = zf.length();
	   int a = 0;
	   int b = 0;
		for (int i = 0;i < n + 1;i++)
		{
			if (zf.charAt(i) != ' ')
			{
				dc[a][b] = zf.charAt(i);
				b++;
			}
			else
			{
				dc[a][b] = '\0';
				for (;zf.charAt(i) == ' ';i++)
				{
					continue;
				}
				a++;
				b = 0;
			}
		}
		System.out.printf("%d",String.valueOf(dc[0]).length());
		for (int c = 1;c < a + 1;c++)
		{
			 System.out.printf(",%d",String.valueOf(dc[c]).length() + 1);
		}
		return 0;
	}
}
