package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[1000]);
		final String str2 = "abcdefghijklmnopqrstuvwxyz";
		int[] sz = new int[26];
		int i;
		int j;
		int exist = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
	for (i = 0;i < 26;i++)
	{
	sz[i] = 0;
	}
		for (i = 0;str1.charAt(i) != '\0';i++)
		{
			for (j = 0;str2.charAt(j) != '\0';j++)
			{
				if (str1.charAt(i) == str2.charAt(j))
				{
					sz[j] += 1;
					exist = 1;
				}
			}
		}
		if (exist == 0)
		{
			System.out.print("No");
		}
		else if (exist == 1)
		{
			for (i = 0;str2.charAt(i) != '\0';i++)
			{
				if (sz[i] != 0)
				{
					System.out.printf("%c=%d\n",str2.charAt(i),sz[i]);
				}
			}
		}
		return 0;
	}
}

