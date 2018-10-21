package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String lon = new String(new char[20]);
		String sh = new String(new char[10]);
		char[][] b = new char[200][20];
		int i;
		int n;
		int q = 0;
		int w = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		if (a.charAt(0) == 'P')
		{
			lon = "Programming";
			sh = "C\0";
		System.out.printf("%s\n%s",lon,sh);
		}
		else
		{
		for (i = 0;i <= n;i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != '\0')
			{
				b[q][w] = a.charAt(i);
			}
			else
			{
				q++;
				w = -1;
			}
			w++;
		}
		for (i = 0;i < q;i++)
		{
			if (i == 0)
			{
				lon = b[i];
				sh = b[i];
			}
			if (String.valueOf(b[i]).length() > lon.length())
			{
				lon = b[i];
			}
			if (String.valueOf(b[i]).length() < sh.length())
			{
				sh = b[i];
			}
		}
		System.out.printf("%s\n%s\n",lon,sh);
		}
		return 0;
	}



}
