package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[400]);
		a = new Scanner(System.in).nextLine();
		int l;
		int[] b = new int[27];
		int[] c = new int[27];
		l = a.length();
		int i;
		int n = 0;
		for (i = 0;i < l;i++)
		{
			if ((a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z'))
			{
				n = 1;
				if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
				{
					b[a.charAt(i) - 64]++;
				}
				if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
				{
					c[a.charAt(i) - 96]++;
				}
			}
		}
		if (n == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i <= 26;i++)
			{
				if (b[i] != 0)
				{
					System.out.printf("%c=%d\n",i + 64,b[i]);
				}
			}
			for (i = 0;i <= 26;i++)
			{
				if (c[i] != 0)
				{
					System.out.printf("%c=%d\n",i + 96,c[i]);
				}
			}
		}
		return 0;
	}
}
