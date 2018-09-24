package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[301]);
		int i;
		int[] sum = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int len = s.length();
		for (i = 0;i < 26;i++)
		{
			sum[i] = 0;
		}
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) - 'a' >= 0 && s.charAt(i) - 'a' <= 25)
			{

				sum[s.charAt(i) - 'a']++;
			}
		}
		int hh = 1;
		for (i = 0;i < 26;i++)
		{
			if (sum[i] != 0)
			{
				break;
			}
			else
			{
				hh = 0;
			}
		}
		if (hh == 0)
		{
			System.out.print("No");
		}

		for (i = 0;i < 26;i++)
		{
			if (sum[i] != 0)
			{
				System.out.printf("%c=%d\n",'a' + i,sum[i]);
			}
		}

		return 0;
	}


}

