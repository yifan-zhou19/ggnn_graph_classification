package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void output(char a[11],char b[4]);
		int i;
		String a = new String(new char[11]);
		String b = new String(new char[4]);
		for (i = 0;scanf("%s %s",a,b) != EOF;i++)
		{
			output(a, b);
		}
	}

	public static void output(String a, String b)
	{
		int i;
		int c = 0;
		int j;
		for (i = 1; !a[i].equals('\0');i++)
		{
			if (a[c].compareTo(a[i]) < 0)
			{
				c = i;
			}
		}
		for (j = 0;j <= c;j++)
		{
				System.out.printf("%c",a[j]);
		}
		   System.out.printf("%s",b);
		for (j = j; !a[j].equals('\0');j++)
		{
				System.out.printf("%c",a[j]);
		}
		System.out.print("\n");
	}

}
