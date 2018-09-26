package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int z = 0;
		int[] p = new int[100];
		int[] b = new int[100];
		int[] l = new int[100];
		int[] sum = new int[100];
		String g = new String(new char[100]);
		String x = new String(new char[100]);
		char[][] m = new char[100][20];
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
				m[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				g = tangible.StringFunctions.changeCharacter(g, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				x = tangible.StringFunctions.changeCharacter(x, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				l[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = 0;
			if (p[i] > 90)
			{
				sum[i] = sum[i] + 2000;
			}
			if (p[i] > 85)
			{
				if (b[i] > 80)
				{
					sum[i] = sum[i] + 4000;
				}
				if (x.charAt(i) == 'Y')
				{
					sum[i] = sum[i] + 1000;
				}
			}
			if ((p[i] > 80) && (l[i] > 0))
			{
				sum[i] = sum[i] + 8000;
			}
			if ((b[i] > 80) && (g.charAt(i) == 'Y'))
			{
				sum[i] = sum[i] + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			z = sum[i] + z;
		}
		int max = sum[0];
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
				j = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",m[j],max,z);
	}

}

