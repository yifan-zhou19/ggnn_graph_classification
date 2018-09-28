package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		String str = new String(new char[1000]);
		char[][] str1 = new char[1000][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		m = str.length();
		int index = 0;
		for (i = 0;i < (m - n + 2);i++)
		{
			for (j = 0;j < n;j++)
			{
				str1[i][j] = str.charAt(i + j);
			}
			index = i;
		}
		for (i = 0;i < index;i++)
		{
			str1[i][n] = 0;
		}
		int[] num = new int[1000];
		int max;
		for (i = 0;i < index;i++)
		{
			for (j = i;j < index;j++)
			{
				if (strcmp(str1[i],str1[j]) == 0)
				{
					num[i]++;
				}
			}
		}
		max = 1;
		for (i = 0;i < index;i++)
		{
			if (max <= num[i])
			{
				max = num[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
		for (i = 0;i < index;i++)
		{
			if (max == num[i])
			{
				System.out.printf("%s\n",str1[i]);
			}
		}
		}
	}
}

