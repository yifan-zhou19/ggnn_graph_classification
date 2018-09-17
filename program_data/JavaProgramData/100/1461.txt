package <missing>;

public class GlobalMembers
{
	public static int l;
	public static String s = new String(new char[301]);
	public static int[] t = new int[300];
	public static int Main()
	{
		int i;
		int b = 0;
		l = String.valueOf(gets(s)).length();
		for (i = 0;i < l;i++)
		{
			t[s.charAt(i)]++;
		}
		for (i = 'A';i <= 'Z';i++)
		{
			if (t[i] != 0)
			{
				System.out.printf("%c=%d\n",i,t[i]);
				b = 1;
			}
		}
		for (i = 'a';i <= 'z';i++)
		{
			if (t[i] != 0)
			{
				System.out.printf("%c=%d\n",i,t[i]);
				b = 1;
			}
		}
		if (b == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}

}
