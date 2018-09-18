package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[11]);
		String b = new String(new char[4]);
		char temp = 0;
		int t = 0;
		int i;
		int n;
		while (scanf("%s%s",a,b) != EOF)
		{
			n = a.length();
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) > temp)
				{
					temp = a.charAt(i),t = i;
				}
			}
			for (i = 0;i <= t;i++)
			{
			System.out.printf("%c",a.charAt(i));
			}
			System.out.printf("%s",b);
			for (i = t + 1;i < n;i++)
			{
			System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
			t = 0;
			temp = 0;
		}
	}
}
