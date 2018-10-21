package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] t1 = new int[1000];
		int[] t2 = new int[1000];
		int num = 0;
		int mint1;
		int maxt2 = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t1[num] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		mint1 = t1[num];
		while (c != '\n')
		{
			num++;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t1[num] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			if (t1[num] < mint1)
			{
				mint1 = t1[num];
			}
		}
		int i;
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			t2[0] = Integer.parseInt(tempVar5);
		}
		maxt2 = t2[0];
		for (i = 1;i <= num;i++)
		{
			String tempVar6 = ConsoleInput.scanfRead(",");
			if (tempVar6 != null)
			{
				t2[i] = Integer.parseInt(tempVar6);
			}
			if (t2[i] > maxt2)
			{
				maxt2 = t2[i];
			}

		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			t2[num] = Integer.parseInt(tempVar7);
		}
		System.out.printf("%d ",num + 1);
		int t;
		int maxnum = 0;
		int n;
		for (t = mint1;t < maxt2;t++)
		{
			n = 0;
			for (i = 0;i <= num;i++)
			{
				if (t >= t1[i] != 0 && t < t2[i])
				{
					n++;
				}
			}
			if (n > maxnum)
			{
				maxnum = n;
			}
		}
		System.out.printf("%d",maxnum);
	}





}

