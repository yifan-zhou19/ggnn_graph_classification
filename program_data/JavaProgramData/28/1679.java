package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[1000]);
		char[][] zfc = new char[100][100];
		int k = 0;
		int n = 0;
		int l;
		int a;
		int i;
		zf = new Scanner(System.in).nextLine();
		l = zf.length();
		for (i = 0;i < l;i++)
		{
			if (zf.charAt(i) != ' ')
			{
				zfc[n][k] = zf.charAt(i);
				k++;
			}
			else
			{
				zfc[n][k] = '\0';
				n++;
				k = 0;
			}
		}
		zfc[n][k] = '\0';
		for (i = 0;i < n;i++)
		{
			a = String.valueOf(zfc[i]).length();
			if (a != 0)
			{
				System.out.printf("%d,",a);
			}
		}
		System.out.printf("%d",String.valueOf(zfc[n]).length());

	}



}
