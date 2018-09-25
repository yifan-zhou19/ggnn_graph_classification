package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String sub = new String(new char[4]);
		String a;
		String b;
		int max;
		int i;
		int t;
		int n;
		while (scanf("%s %s",str,sub) != EOF)
		{
			max = 0;
			a = str;
			b = sub;
			n = str.length();
			for (i = n - 1;i >= 0;i--)
			{
			if (*(a.Substring(i)) >= max)
			{
				t = i;
				max = (a.Substring(i));
			}
			}
			for (i = 0;i <= t;i++)
			{
				System.out.printf("%c",*(a.Substring(i)));
			}
			System.out.printf("%s",b);
			for (i = t + 1;i < n;i++)
			{
				System.out.printf("%c",*(a.Substring(i)));
			}
			System.out.print("\n");
		}
	}
}
