public class book
{
	public int num;
	public String wr = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] b = new int[91][1000];
		int max = 0;
		int i;
		int j;
		int k;
		int s;
		int m;
		int writer;
		book[] bk = tangible.Arrays.initializeWithDefaultbookInstances(1000);
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
				bk[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				bk[i].wr = tempVar3.charAt(0);
			}
		} //?????????//
		for (i = 0;i < 26;i++) //?????//
		{
			s = 0;
			for (j = 0;j < n;j++) //???????i???//
			{
				m = String.valueOf(bk[j].wr).length(); //??????//
				for (k = 0;k < m;k++)
				{
					if (bk[j].wr.charAt(k) == i + 65)
					{
						b[i][s] = bk[j].num; //??i+65??s+1?????//
						s++;
						k = m;
					}
				}
			}
			if (s > max) //s???i?????//
			{
				max = s;
				writer = i;
			}
		}
		System.out.printf("%c\n%d",writer + 65,max);
		for (i = 0;i < max;i++)
		{
			System.out.printf("\n%d",b[writer][i]);
		}
		return 0;
	}
}

