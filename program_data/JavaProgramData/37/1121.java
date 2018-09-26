package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int cases;
		int[] sum = new int[26];
		int i;
		int max;
		int j;
		String str = new String(new char[1001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			cases = Integer.parseInt(tempVar);
		}
		while (cases > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			for (i = 0;i < 26;i++)
			{
				sum[i] = 0;
			}
			for (i = 0;i < str.length();i++)
			{
				sum[str.charAt(i) - 'a']++;
			}
			max = 0;
			for (j = 0;j < str.length() + 1;j++)
			{
				if (sum[str.charAt(j) - 'a'] == 1)
				{
					System.out.printf("%c\n",str.charAt(j));
			break;
				}


				if (j == str.length())
				{
					System.out.print("no");
				}
			}
			cases--;
		}
	}
}

