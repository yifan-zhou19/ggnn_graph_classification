package <missing>;

public class GlobalMembers
{
	public static String q = new String(new char[100]);
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static char[][] xc = new char[50][100];
	public static int Main()
	{
		q = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		int k = 0;
		int s = 0;
		int p = 0;
		for (i = 0;i < 100;i++)
		{
			if (q.charAt(i) != ' ')
			{
				xc[j][i - k] = q.charAt(i);

			}
			if (q.charAt(i) == ' ')
			{
				j++;
				k = i + 1;
			}

		}
		for (s = 0;s < j + 1;s++)
		{
			if (strcmp(xc[s],a) == 0)
			{
				xc[s] = b;
			}
		}
		for (p = 0;p < j;p++)
		{
		System.out.printf("%s ",xc[p]);
		}
		System.out.printf("%s",xc[j]);
		return 0;

	}
}
