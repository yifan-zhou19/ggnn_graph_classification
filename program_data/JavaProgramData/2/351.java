package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] card = new int[1000];
		int[] num = new int[26];
		int max = 0;
		int k = 0;
		char[][] s = new char[1000][27];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				card[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;s[i][j] != '\0';j++)
			{
				num[s[i][j] - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
		  if (num[i] > max)
		  {
			  max = num[i];
			  k = i;
		  }
		}
		System.out.printf("%c\n%d\n",k + 'A',max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;s[i][j] != 0;j++)
			{
				if (s[i][j] == k + 'A')
				{
					System.out.printf("%d\n",card[i]);
					break;
				}
			}
		}
	}

}

