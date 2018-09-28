package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int len;
	public static int n;
	public static String s = new String(new char[1000]);
	public static int[] cnt = new int[1000];

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n ;++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(cnt,0,(Integer.SIZE / Byte.SIZE));
			for (j = 0; j < len; ++j)
			{
				cnt[s.charAt(j) - 'a']++;
			}
			for (j = 0; j < len; ++j)
			{
				if (cnt[s.charAt(j) - 'a'] == 1)
				{
					break;
				}
			}
			if (j < len)
			{
				System.out.printf("%c\n",s.charAt(j));
			}
			else
			{
				System.out.println("no");
			}
		}

	}
}

