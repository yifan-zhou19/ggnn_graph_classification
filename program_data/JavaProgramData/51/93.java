package <missing>;

public class GlobalMembers
{
	// ngram????.cpp : Defines the entry point for the console application.
	//

	public static void Main(String[] args)
	{
		int max;
		int[] mark = new int[700];
		int n;
		int i;
		int len;
		int k;
		int j;
		int[] num = new int[700];
		String sz = new String(new char[700]);
		char[][] gram = new char[700][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz = tempVar2.charAt(0);
		}
		len = sz.length();
	/*	if(len==1){
			printf("1\n%s\n",sz);
			return 0;
		}
	*/
	for (i = 0;i < len;i++)
	{
			num[i] = 1;
	}
		for (i = 0;i < len - n + 1;i++)
		{
			for (j = 0;j < n + 1;j++)
			{
				if (j != n)
				{
					gram[i][j] = sz.charAt(i + j);
				}
				else
				{
					gram[i][j] = '\0';
				}
			}
		}
		for (i = 0;i < len - n + 1;i++)
		{
			for (j = i + 1;j < len - n + 1;j++)
			{
				if (strcmp(gram[i],gram[j]) == 0)
				{
					num[i]++;
				}
			}
		}
		max = 1;
		k = -1;
		for (i = 0;i < len - n + 1;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
				k = 0;
				mark[k] = i;
			}
			else if (num[i] == max && max != 1)
			{
				k++;
				mark[k] = i;
			}
		}
		if (k == -1)
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i <= k;i++)
			{
				if (i == 0)
				{
					System.out.printf("%d\n%s\n",num[mark[0]],gram[mark[0]]);
				}
				else
				{
					System.out.printf("%s\n",gram[mark[i]]);
				}
			}
		}
	}


}

