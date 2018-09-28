package <missing>;

public class GlobalMembers
{
	public static int[] an1 = new int[MAX_LEN];
	public static int[] an2 = new int[MAX_LEN];
	public static String szline1 = new String(new char[MAX_LEN]);
	public static String szline2 = new String(new char[MAX_LEN]);

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			szline1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			szline2 = tempVar2.charAt(0);
		}

		int i;
		int j;
		int maxlen;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an2,0,(Integer.SIZE / Byte.SIZE));

		int len1;
		int len2;
		len1 = szline1.length();
		len2 = szline2.length();
		for (j = 0,i = len1 - 1; i >= 0; i--)
		{
			an1[j++] = szline1.charAt(i) - '0';
		}
		for (j = 0,i = len2 - 1; i >= 0; i--)
		{
			an2[j++] = szline2.charAt(i) - '0';
		}

		if (len1 > len2)
		{
			maxlen = len1;
		}
		else
		{
			maxlen = len2;
		}

		int startpos = 0;
		for (i = 0; i < maxlen; i++)
		{
			if (an1[i] + an2[i] >= 10)
			{
				an1[i] = an1[i] + an2[i] - 10;
				an1[i + 1]++;
			}
			else
			{
				an1[i] += an2[i];
			}
			if (an1[i] != 0)
			{
				startpos = i;
			}
		}
		if (an1[i] != 0)
		{
			startpos = i;
		}
		if (startpos == 0)
		{
			System.out.print("0");
		}
		else
		{
			for (i = startpos;i >= 0; i--)
			{
				System.out.printf("%d",an1[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

