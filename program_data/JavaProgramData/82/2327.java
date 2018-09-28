package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] gy = new int[100];
		int[] dy = new int[100];
		int[] zc = new int[100];
		int e;
		int s;
		int k;
		int max = 0;
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
				 gy[i] = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 dy[i] = Integer.parseInt(tempVar3);
			 }
			 if (gy[i] >= 90 && gy[i] <= 140 && dy[i] >= 60 && dy[i] <= 90)
			 {
				 zc[i] = 1;
			 }
			 else
			 {
				 zc[i] = 0;
			 }
		}
		for (i = 0;i < n;i++)
		{
			if ((i == 0 || zc[i - 1] == 0) && zc[i] == 1)
			{
				e = i;
			}
			if ((i == n - 1 || zc[i + 1] == 0) && zc[i] == 1)
			{
				s = i;
			}
			if (s >= e)
			{
				k = s - e+1;
				if (k > max)
				{
					max = k;
				}
			}
		}
		System.out.printf("%d",max);
		return 0;
	}
}

