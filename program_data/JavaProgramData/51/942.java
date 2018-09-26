package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[600]);
		int n;
		int i;
		int j;
		int lenth;
		int[] len = new int[600];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		char[][] word = new char[600][7];
		lenth = str.length();
		for (i = 0;i <= lenth;i++)
		{
			if ((str.charAt(i + n - 1) == '\0') || (str.charAt(i + n - 1) == ',') || (str.charAt(i + n - 1) == '.'))
			{
				break;
			}
			else
			{
				for (j = 0;j < n;j++)
				{
					word[i][j] = str.charAt(i + j);
				}
			}
		}
		int log;
		int num;
		int sum;
		log = i - 1;
		char[][] zifu = new char[600][10];
		zifu[0] = word[0];
		num = 0;
		len[0] = 1;
		for (i = 1;i <= log;i++)
		{
			for (j = 0,sum = 0;j <= num;j++)
			{
				if (strcmp(zifu[j],word[i]) == 0)
				{
					len[j]++;
					sum = 1;
				}
			}
			if (sum != 1)
			{
				num++;
				len[num] = 1;
				zifu[num] = word[i];
			}
		}
		int max;
		max = len[0];
		for (i = 1;i <= num;i++)
		{
			if (max < len[i])
			{
				max = len[i];
			}
		}
		if (max <= 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",max);
		for (i = 0;i <= log;i++)
		{
			if (len[i] == max)
			{
				System.out.printf("%s\n",zifu[i]);
			}
		}
		}
		return 0;
	}



}

