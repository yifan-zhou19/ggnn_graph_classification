package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[301]);
		int n;
		int i;
		int[] big = new int[26];
		int[] small = new int[26];
		int flag = 0;
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = 0;i < n;i++)
		{
			if (c.charAt(i) >= 65 && c.charAt(i) <= 90)
			{
				big[c.charAt(i) - 65]++;
				flag = 1;
			}
			else if (c.charAt(i) >= 97 && c.charAt(i) <= 122)
			{
				small[c.charAt(i) - 97]++;
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 0;i < 26;i++)
		{
			if (big[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 65,big[i]);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (small[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 97,small[i]);
			}
		}
		}
		return 0;
	}





}
