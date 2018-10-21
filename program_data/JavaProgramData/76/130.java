package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] QJ = new int[n][2];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				QJ[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				QJ[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (int j = 0;j < n - 1;j++)
		{
			for (int k = 0;k < n - 1 - j;k++)
			{
				if (QJ[k][0] > QJ[k + 1][0])
				{
				   e = QJ[k + 1][0];
				   QJ[k + 1][0] = QJ[k][0];
				   QJ[k][0] = e;
				   e = QJ[k + 1][1];
				   QJ[k + 1][1] = QJ[k][1];
				   QJ[k][1] = e;
				}
			}
		}

		 for (double m = QJ[0][0];m <= QJ[n - 1][0];m = m + 0.5)
		 {
			 int s = 0;
			for (int p = 0;p < n;p++)
			{
				if (m < QJ[p][0] || m> QJ[p][1])
				{
				   s = s + 1;
				}
			}
			if (s == n)
			{
				   System.out.print("no");
				   break;
			}
			if (m == QJ[n - 1][0])
			{
				   for (int j = 0;j < n - 1;j++)
				   {
			for (int k = 0;k < n - 1 - j;k++)
			{
				if (QJ[k][1] > QJ[k + 1][1])
				{

				   e = QJ[k + 1][1];
				   QJ[k + 1][1] = QJ[k][1];
				   QJ[k][1] = e;
				}
			}
				   }
				   System.out.printf("%d %d",QJ[0][0],QJ[n - 1][1]);
			}
		 }
			return 0;
	}
}

