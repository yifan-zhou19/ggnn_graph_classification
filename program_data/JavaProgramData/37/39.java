package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[100001]);
	public static int[] bucket = new int[26];
	public static int t;
	public static int i;
	public static int j;
	public static int k;
	public static int len;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			for (k = 0;k < 26;k++)
			{
				bucket[k] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			while (s.charAt(j) != '\0')
			{
				bucket[s.charAt(j) - 'a']++;
				j++;
			}
			len = j;
			j = 0;
			while (s.charAt(j) != '\0')
			{
				if (bucket[s.charAt(j) - 'a'] == 1)
				{
					System.out.printf("%c\n", s.charAt(j));
					break;
				}
				else
				{
					j++;
				}
			}
			if (j == len)
			{
				System.out.print("no\n");
			}
			j = 0;
		}
		return 0;
	}


}

