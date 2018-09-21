package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String p;
		int n;
		int j;
		int i;
		int t;
		p = gets(a);
		n = a.length();
		t = 0;
		for (i = n - 1;i >= 0;i--)
		{
			if (*(p.Substring(i)) != ' ')
			{
				t++;
			}
			if (*(p.Substring(i)) == ' ')
			{
				for (j = 1; j <= t; j++)
				{
					System.out.printf("%c",*(p.Substring(i) + j));
				}
				System.out.print(" ");
				t = 0;
			}
			if (i == 0)
			{
				for (j = 0; j <= t - 1;j++)
				{
					System.out.printf("%c",*(p.Substring(i) + j));
				}
				System.out.print("\n");
			}
		}
	}
}
