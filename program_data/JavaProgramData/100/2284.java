package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[300]);
		int[] a = new int[52];
		int i;
		int j;
		int k = 0;
		c = new Scanner(System.in).nextLine();
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			for (j = 'A';j <= 'Z';j++)
			{
				if (c.charAt(i) == j)
				{
					a[j - 'A']++;
					break;
				}
			}
		}
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			for (j = 'a';j <= 'z';j++)
			{
				if (c.charAt(i) == j)
				{
					a[j - 'a' + 26]++;
					break;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'A',a[i]);
				k++;
			}
		}
		for (i = 26;i < 52;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'a' - 26,a[i]);
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}
