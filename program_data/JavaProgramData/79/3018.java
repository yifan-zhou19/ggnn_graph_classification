package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????????????????????
		int m;
		int[] p = new int[300];
		int j;
		int i;
		int t;
		int count;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < n;i++) //????????????????
		{
			p[i] = i + 1;
		}
		for (t = 0,j = 0,count = 0;;j++) //count=0,t=0
		{
			for (i = 0;i < n;i++) //count!=0,t!=0
			{
				if (p[i] != 0)
				{
					count++;
				}
				if (count == m)
				{
					p[i] = 0;
					t++;
					count = 0;
				}
			}
			if (t == n - 1) //==
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i] != 0) //????
			{
				System.out.printf("%d",p[i]);
				return 0;
			}
		}
	return 1;
	}
}

