package <missing>;

public class GlobalMembers
{
	public static void find(String c)
	{
		int i;
		int[] a = new int[26];
		for (i = 0;c[i] != null;i++)
		{
			a[c[i] - 'a']++;
		}
		for (i = 0;c[i] != null;i++)
		{
			if (a[c[i] - 'a'] == 1)
			{
				System.out.printf("%c\n",c[i]);
				return;
			}
		}
		System.out.print("no\n");
	}

	public static int Main()
	{
		int t;
		int i;
		String c = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			c = new Scanner(System.in).nextLine();
			find(c);
		}
	}
}

