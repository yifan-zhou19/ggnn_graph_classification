package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] many = new int[120];
		int wen;
		int qimo;
		int banji;
		int all;
		int who;
		int max;
		int q;
		char[][] name = new char[120][50];
		char gan;
		char xi;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max = 0;
		q = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				banji = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				gan = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xi = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				wen = Integer.parseInt(tempVar7);
			}
			all = 0;
			if ((qimo > 80) && (wen >= 1))
			{
				all = all + 8000;
			}
			if ((qimo > 85) && (banji > 80))
			{
				all = all + 4000;
			}
			if (qimo > 90)
			{
				all = all + 2000;
			}
			if ((qimo > 85) && (xi == 'Y'))
			{
				all = all + 1000;
			}
			if ((banji > 80) && (gan == 'Y'))
			{
				all = all + 850;
			}
			q = q + all;
			if (all > max)
			{
				max = all;
				who = i;
			}
		}
		System.out.printf("%s\n",name[who]);
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",q);
		return 0;
	}



}

