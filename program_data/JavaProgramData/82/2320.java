package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct suoyou
	//	{
	//		int qian;
	//		int hou;
	//	}
	//	suoyous[100];
		int i;
		int k;
		int n;
		int m = 0;
		int s = 0;
		int e = 0;
		int[] hao = new int[100];
		for (i = 0;i < 100;i++)
		{
			hao[i] = 0;
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
				suoyous[i].qian = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				suoyous[i].hou = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (suoyous[i].qian >= 90 && suoyous[i].qian <= 140 && suoyous[i].hou >= 60 && suoyous[i].hou <= 90)
			{
				s = i;
				e = i + 1;
				while (suoyous[e].qian >= 90 && suoyous[e].qian <= 140 && suoyous[e].hou >= 60 && suoyous[e].hou <= 90)
				{
					e += 1;
				}
			}
			hao[m] = e - s;
			m++;
		}
		for (i = 1;i <= m;i++)
		{
			for (k = 0;k < m - i;k++)
			{
				if (hao[k] < hao[k + 1])
				{
					e = hao[k];
					hao[k] = hao[k + 1];
					hao[k + 1] = e;
				}
			}
		}
		System.out.printf("%d",hao[0]);
		return 0;
	}
}

