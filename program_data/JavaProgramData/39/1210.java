package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] name =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char bgb;
		char xb;
		int sc1;
		int sc2;
		int lw;
		int[] sum = new int[100];
		int s = 0;
		int n;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sc1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				sc2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				bgb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xb = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				lw = Integer.parseInt(tempVar7);
			}
			if (sc1 > 80 && lw > 0)
			{
				sum[i] += 8000;
			}
			if (sc1 > 85 && sc2 > 80)
			{
				sum[i] += 4000;
			}
			if (sc1 > 90)
			{
				sum[i] += 2000;
			}
			if (sc1 > 85 && xb == 'Y')
			{
				sum[i] += 1000;
			}
			if (sc2 > 80 && bgb == 'Y')
			{
				sum[i] += 850;
			}
			s += sum[i];
		}
		for (int j = 0;j < n;j++)
		{
			if (max < sum[j])
			{
				max = sum[j];
			}
		}
		for (int k = 0;k < n;k++)
		{
			if (sum[k] == max)
			{
				System.out.printf("%s\n%d\n%d\n",name[k],sum[k],s);
				break;
			}
		}
		return 0;
	}



}

