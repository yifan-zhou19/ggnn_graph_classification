package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char[] wri = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int[] num = new int[26]; //?????????
		String tem = new String(new char[100]);
		int j = 0;
		int k;
		int[][] shu = new int[26][100]; //?????
		int hao; //??
		for (i = 0;i < 26;i++)
		{
			num[i] = 0;
		}
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
				hao = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				tem = tempVar3.charAt(0);
			}
			j = 0;
			while (tem.charAt(j) != '\0')
			{
				for (k = 0;k <= 25;k++)
				{
					if (wri[k] == tem.charAt(j))
					{
						shu[k][num[k]] = hao;
						num[k]++;
					}
				}
				j++;
			}
		}
		int max = 0;
		for (i = 1;i < 26;i++)
		{
			if (num[i] > num[max])
			{
				max = i;
			}
		}
		System.out.printf("%c\n%d\n",wri[max],num[max]);
		for (i = 0;i < num[max];i++)
		{
			System.out.printf("%d\n",shu[max][i]);
		}
		return 0;
	}

}

