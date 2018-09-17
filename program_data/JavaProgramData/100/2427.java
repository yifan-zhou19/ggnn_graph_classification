package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[55];
		int sign = 0;
		String str = new String(new char[301]);
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0; i < n; i++)
		{
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				a[str.charAt(i) - 65]++;
				sign = 1;
			}
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				a[str.charAt(i) - 71]++;
				sign = 1;
			}
		}
		for (i = 0; i <= 25; i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 65,a[i]);
			}
		}
		for (i = 26; i <= 51; i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 71,a[i]);
			}
		}
		if (sign == 0)
		{
			System.out.print("No\n");
		}
	}
}
