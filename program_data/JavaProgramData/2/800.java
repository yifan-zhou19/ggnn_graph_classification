package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int[] a = new int[1000];
		int[] l = new int[1000];
		int i;
		int j;
		int k;
		int t;
		int[] time = new int[26];
		int max;
		int q = 0;
		char[] name = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		char[][] b = new char[1000][26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			l[i] = String.valueOf(b[i]).length();
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < l[i];j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (b[i][j] == name[k])
					{
						time[k]++;
					}
				}
			}
		}
		max = time[0];
		for (i = 1;i < 26;i++)
		{
			if (time[i] > max)
			{
				max = time[i];
				t = i;
			}
		}
		System.out.printf("%c\n",name[t]);
		System.out.printf("%d\n",max);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < l[i];j++)
			{
				if (b[i][j] == name[t])
				{
					System.out.printf("%d\n",a[i]);
				}
			}
		}
	}
}

