package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[100]);
		zfc = new Scanner(System.in).nextLine();
		char[][] b = new char[100][100];
		int l = zfc.length();
		int n = 0;
		int k = 0;
		int i;
		for (i = 0;i < l;i++)
		{
			if (zfc.charAt(i) != ' ' && zfc.charAt(i) != ',')
			{
				b[n][k] = zfc.charAt(i);
				k++;
			}
			else
			{
				b[n][k] = '\0';
				n++;
				k = 0;
			}
		}
		b[n][k] = '\0';
		String h = new String(new char[100]);
		String f = new String(new char[100]);
		h = new Scanner(System.in).nextLine();
		f = new Scanner(System.in).nextLine();
		int j;
		for (j = 0;j < n;j++)
		{
			if (strcmp(b[j],h) == 0)
			{
				b[j] = f;
				System.out.printf("%s ",b[j]);
			}
			else
			{
				System.out.printf("%s ",b[j]);
			}
		}
		if (strcmp(b[n],h) != 0)
		{
			System.out.printf("%s",b[n]);
		}
		if (strcmp(b[n],h) == 0)
		{
			System.out.printf("%s",f);
		}
		return 0;
	}
}
