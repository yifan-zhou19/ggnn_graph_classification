package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] ssy = new int[100];
		int[] szy = new int[100];
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
				ssy[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				szy[i] = Integer.parseInt(tempVar3);
			}
		}
		int m = 0;
		int j = 0;
		int[] lx = new int[100];
		for (i = 0;i < n;i++)
		{
			if (ssy[i] >= 90 && 140 >= ssy[i] != 0 && szy[i] >= 60 && 90 >= szy[i])
			{
				lx[j] = i;
				j++;
			}
			else
			{
				lx[j] = -1;
			}
		}
		int x = 0;
		int t = 0;
		int max = 0;
		if (j > 0)
		{
			m = 1;
		for (t = 0;t <= j;t++)
		{
		  if (lx[t + 1] - lx[t] == 1)
		  {
			  m++;
		  }
			  if (lx[t + 1] - lx[t] != 1)
			  {
				  if (max <= m)
				  {
				  max = m;
				  }
				  m = 1;
			  }
		}
		System.out.printf("%d",max);
		}
		else
		{
			System.out.print("0");
		}
		return 0;
	}





}

