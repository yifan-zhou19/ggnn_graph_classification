package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int h;
		int l;
		int re;
		int[][] jz = new int[5][5];
		int[] te = new int[5];
		for (h = 0;h < 5;h++)
		{
			for (l = 0;l < 5;l++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				jz[h][l] = Integer.parseInt(tempVar);
			}
			}
		}
		//for(h=0;h<5;h++){
				//for(l=0;l<5;l++){
					//printf("%d ",jz[h][l]);
				//}
		//}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n > -1 && n < 5 && m>-1 && m < 5)
		{
			re = 1;
		}
		else
		{
			re = 0;
		}
		//printf("%d\n ",re);
		if (re == 0)
		{
			System.out.print("error");
		}
		else if (re == 1)
		{
			for (i = 0,l = 0;i < 5;i++,l++)
			{
				te[i] = jz[n][l];
			}
			for (i = 0,l = 0;i < 5;i++,l++)
			{
				jz[n][l] = jz[m][l];
			}
			for (i = 0,l = 0;i < 5;i++,l++)
			{
				jz[m][l] = te[i];
			}
			for (h = 0;h < 4;h++)
			{
				for (l = 0;l < 4;l++)
				{
					System.out.printf("%d ",jz[h][l]);
				}
				System.out.printf("%d\n",jz[h][4]);
			}
			for (l = 0;l < 4;l++)
			{
				System.out.printf("%d ",jz[4][l]);
			}
			System.out.printf("%d",jz[4][4]);
		}
		return 0;
	}

}

