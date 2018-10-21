package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sum = new int[26];
		int i;
		int n = 0;
		String str = new String(new char[301]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (i = 0;i < 26;i++)
		{
			sum[i] = 0;
		}
		for (i = 0;i < str.length();i++)
		{
			if (('a' <= str.charAt(i)) && (str.charAt(i) <= 'z'))
			{
				sum[str.charAt(i) - 'a']++;
				n = 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (sum[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'a',sum[i]);
			}
		}
			if (n == 0)
			{
				System.out.print("No");
			}
			return 0;
	}


}

