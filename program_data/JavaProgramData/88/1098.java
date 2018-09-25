package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		char d = '\n';
		int i;
		int b;
		int k = 0;
		int f = 1;
		String[] c = new String[30];
		a = new Scanner(System.in).nextLine();
		b = a.length();
		for (i = 0;i < b;i++)
		{
			if (a.charAt(i) > 47 && a.charAt(i) < 58)
			{
				c[k] = a.charAt(i);
				k++;
				f = 0;
			}
			else
			{
			if (f == 0)
			{
				c[k] = d;
				k++;
			}
				f++;
			}

		}
		for (i = 0;i < k;i++)
		{
		System.out.printf("%c",c[i]);
		}

	}
}
