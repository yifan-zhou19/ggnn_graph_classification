package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int n;
		int max;
		String a = new String(new char[20]);
		String b = new String(new char[4]);
		while (scanf("%s%s",a,b) != EOF)
		{
			n = a.length();
			k = n - 1;
			max = a.charAt(n - 1);
			for (i = n - 1;i > 0;i--)
			{
			if (a.charAt(i - 1) >= max)
			{
			max = a.charAt(i - 1);
			k = i - 1;
			}
			}
			for (i = 0;i <= k;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.printf("%c%c%c",b.charAt(0),b.charAt(1),b.charAt(2));
			for (i = k + 1;i <= n - 1;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
		}
	}
}
