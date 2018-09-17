package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int[] b = new int[26];
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
			b[a.charAt(i) - 'a']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
		if (b[i] != 0)
		{
			break;
		}
		}
		if (i == 26)
		{
			System.out.print("No\n");
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] != 0)
			{
			System.out.printf("%c=%d\n",i + 'a',b[i]);
			}
		}

	}
}
