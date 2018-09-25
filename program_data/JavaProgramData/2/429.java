package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int d;
		int s;
		int a;
		int b = 0;
		int c;
		int[] tt = new int[1000];
		int[] pp = new int[1000];
		int[] miao = new int[26];
		char[][] kk = new char[1000][30];
		char w;
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
				tt[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				kk[i] = tempVar3.charAt(0);
			}
		}
		for (s = 0,j = 65;j <= 90;j++,s++)
		{
			 for (k = 0;k < m;k++)
			 {
				 for (d = 0;kk[k][d] != '\0';d++)
				 {
					 if (kk[k][d] == j)
					 {
						 miao[s]++;
					 }
				 }
			 }
		}
		for (a = 0;a < 26;a++)
		{
			if (miao[a] > b)
			{
				b = miao[a];
				c = a;
			}
		}
		System.out.printf("%c\n%d\n",c + 65,b);
		w = (c + 65);
		for (i = 0;i < m;i++)
		{
			for (j = 0;kk[i][j] != '\0';j++)
			{
				if (kk[i][j] == w)
				{
					System.out.printf("%d\n",tt[i]);
					break;
				}
			}
		}

	}
}

