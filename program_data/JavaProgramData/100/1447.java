package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] ucase = new int[26];
		int[] lcase = new int[26];
		int sum = 0;
		String a = new String(new char[301]);
		char c;
		a = new Scanner(System.in).nextLine();
		for (i = 0;(c = a.charAt(i)) != 0;i++)
		{
			if (c >= 65 && c <= 90)
			{
				ucase[c - 65] = ucase[c - 65] + 1;
			}
			else if (c >= 97 && c <= 122)
			{
				lcase[c - 97] = lcase[c - 97] + 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			c = i + 65;
			if (ucase[i] != 0)
			{
				System.out.printf("%c=%d\n",c,ucase[i]);
			}
			sum = sum + ucase[i];
		}
		for (i = 0;i < 26;i++)
		{
			c = i + 97;
			if (lcase[i] != 0)
			{
				System.out.printf("%c=%d\n",c,lcase[i]);
			}
			sum = sum + lcase[i];
		}
		if (sum == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}
