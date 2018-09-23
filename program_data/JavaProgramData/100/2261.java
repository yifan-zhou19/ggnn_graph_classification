package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[301]);
		int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		s = new Scanner(System.in).nextLine();
		int i;
		int k = 0;
		int len = s.length();
		char x;
		for (x = 'a';x <= 'z';x = x + 1)
		{
			for (i = 0;i <= len - 1;i++)
			{
				if (s.charAt(i) == x)
				{
					a[x - 'a']++;
				}
			}
		}
		for (x = 'A';x <= 'Z';x = x + 1)
		{
			for (i = 0;i <= len - 1;i++)
			{
				if (s.charAt(i) == x)
				{
					a[x - 'A' + 26]++;
				}
			}
		}
			for (i = 26;i <= 51;i++)
			{
			if (a[i] != 0)
			{
				k++;
				System.out.printf("%c=%d\n",'A' + i - 26,a[i]);
			}
			}
		for (i = 0;i <= 25;i++)
		{
			if (a[i] != 0)
			{
				k++;
				System.out.printf("%c=%d\n",'a' + i,a[i]);
			}
		}

		if (k == 0)
		{
		System.out.print("No\n");
		}
	}

}
