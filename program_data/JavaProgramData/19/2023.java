package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a = 0;
		int b = 0;
		String zfc = new String(new char[101]);
		String y = new String(new char[101]);
		String x = new String(new char[101]);
		char[][] word = new char[101][101];
		zfc = new Scanner(System.in).nextLine();
		y = new Scanner(System.in).nextLine();
		x = new Scanner(System.in).nextLine();
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) != ' ')
			{
				word[a][b] = zfc.charAt(i);
				b++;
			}
			else
			{
				word[a][b] = '\0';
				b = 0;
				a++;
			}
		}
		word[a][b] = '\0';
		for (i = 0;i <= a;i++)
		{
			if (strcmp(word[i],y) == 0)
			{
				word[i] = x;
			}
		}
		for (i = 0;i < a;i++)
		{
			System.out.printf("%s ",word[i]);
		}
		System.out.printf("%s\n",word[a]);
		return 0;
	}
}
