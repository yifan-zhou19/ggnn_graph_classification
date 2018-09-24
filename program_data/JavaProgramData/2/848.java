package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] d = new int[1000];
		char[] zuo = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] s = new char[1000][26];
		char len;
		int[] sum = new int[26];
		int k;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = tempVar3.charAt(0);
			}
			len = String.valueOf(s[i]).length();
			for (j = 0;j < len;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (s[i][j] == 'A' + k)
					{
						sum[k]++;
					}
				}
			}
		}
		int max = 0;
		int count = 0;
		char maxid;
		for (i = 0;i < 26;i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
				maxid = i + 'A';
			}
		}
		System.out.printf("%c\n%d\n",maxid,max);
		int[] t = new int[1000];
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(s[i]).length();
			for (j = 0;j < len;j++)
			{
				if (s[i][j] == maxid)
				{
					count++;
					t[count] = d[i];
				}
			}
		}
		for (i = 1;i <= count;i++)
		{
			System.out.printf("%d\n",t[i]);
		}
		return 0;
	}
}

