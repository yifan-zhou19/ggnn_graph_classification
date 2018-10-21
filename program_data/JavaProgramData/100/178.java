package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int i;
		int n;
		int[] letter = new int[26];
		int total = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i <= 25;i++)
		{
			letter[i] = 0;
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				letter[a.charAt(i) - 'a']++;
			}
		}
		for (i = 0;i <= 25;i++)
		{
			if (letter[i] > 0)
			{
				System.out.printf("%c=%d\n",i + 'a',letter[i]);
				total++;
			}
		}
		if (total == 0)
		{
			System.out.print("No");
		}
		System.in.read();
		System.in.read();
	}

}
