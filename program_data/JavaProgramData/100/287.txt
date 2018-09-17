package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[300]);
		int[] n = new int[26];
		c = new Scanner(System.in).nextLine();
		int i;
		int t;
		int k = 0;
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) >= 97 && c.charAt(i) <= 122)
			{
				t = c.charAt(i) - 97;
				n[t] = n[t] + 1;
				k = k + 1;
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		for (t = 0;t < 26;t++)
		{
			if (n[t] > 0)
			{
				System.out.printf("%c=%d",t + 97,n[t]);
				k = k - 1;
				if (k > 0)
				{
					System.out.print("\n");
				}
			}
		}
	}


}
