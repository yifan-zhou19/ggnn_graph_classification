package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] p;
		char[][] q = new char[1000][30];
		int[] shu = new int[26];
		char[] zm = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int n;
		int i;
		int j;
		int k;
		int len;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new int[n];
		for (i = 0;i < n;i++)
		{
			len = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q[i] = tempVar3.charAt(0);
			}
			len = String.valueOf(q[i]).length();
			for (j = 0;j < len;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (q[i][j] == zm[k])
					{
						shu[k]++;
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (shu[i] > max)
			{
				max = shu[i];
				k = i;
			}
		}
		System.out.printf("%c\n%d\n",zm[k],shu[k]);
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(q[i]).length();
			for (j = 0;j < len;j++)
			{
				if (q[i][j] == zm[k])
				{
					System.out.printf("%d\n",p[i]);
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
		return 0;
	}

}

