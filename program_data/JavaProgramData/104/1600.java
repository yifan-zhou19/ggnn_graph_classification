package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[] word1 = new int[500];
		int[] word2 = new int[500];
		int i;
		int j;
		int num;
		int log1;
		int log2;
		word1[0] = m;
		word2[0] = n;
		i = j = 1;
		while (m != 1)
		{
			word1[i] = m / 2;
			i += 1;
			m = m / 2;
			//printf(" %d %d ",word1[i],m);
		}
		//printf("%d",m);
		log1 = i - 1;
		while (n != 1)
		{
			word2[j] = n / 2;
			j += 1;
			n = n / 2;
			//printf(" %d  %d ",word2[i],n);
		}
		log2 = j - 1;
		int word;
		word = 0;
		for (i = 0;i <= log1;i++)
		{
			for (j = 0;j <= log2;j++)
			{
				if (word1[i] == word2[j])
				{
					//printf("\n");
					System.out.printf("%d",word1[i]);
					//printf("\n");
					word++;
					break;
				}
			}
			if (word != 0)
			{
				break;
			}
		}
		return 0;
	}




}

