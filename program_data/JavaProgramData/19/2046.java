package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[200]);
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		char[][] m = new char[100][100];
		int len;
		int n;
		int i;
		int j;
		int hang = 0;
		int lie = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) == ' ')
			{
				m[hang][lie] = '\0';
				hang++;
				lie = 0;
			}
			else
			{
				m[hang][lie] = s.charAt(i);
				lie++;
			}
			if (s.charAt(i + 1) == '\0')
			{
				m[hang][lie] = '\0';
				break;
			}
		}
		for (i = 0;i <= hang;i++)
		{
			if (strcmp(a,m[i]) == 0)
			{
				m[i] = b;
			}
		}
		for (i = 0;i < hang;i++)
		{
			System.out.printf("%s ",m[i]);
		}
		System.out.printf("%s",m[hang]);
		return 0;
	}
}
