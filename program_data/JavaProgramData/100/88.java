package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[26];
		int i;
		int t = 0;
		String c = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) >= 97 && c.charAt(i) <= 122)
			{
			a[c.charAt(i) - 97]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				t = 1;
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("No\n");
		}
		else
		{
		for (i = 0;i < 26;i++)
		{
		if (a[i] != 0)
		{
		System.out.printf("%c=%d\n",i + 97,a[i]);
		}
		}
		}
	}
}
