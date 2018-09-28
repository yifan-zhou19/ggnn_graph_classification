package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		char[][] name = new char[100][50];
		int[] qimo = new int[100];
		int[] banji = new int[100];
		String ganbu = new String(new char[100]);
		String xibu = new String(new char[100]);
		int[] lunwen = new int[100];
		int i = 0;
		int[] sum = new int[100];
		int sumz = 0;
		int k = 0;

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
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qimo[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				banji[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				ganbu = tangible.StringFunctions.changeCharacter(ganbu, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xibu = tangible.StringFunctions.changeCharacter(xibu, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				lunwen[i] = Integer.parseInt(tempVar7);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (qimo[i] > 80 && lunwen[i] >= 1)
			{
				sum[i] += 8000;
			}
			if (qimo[i] > 85 && banji[i] > 80)
			{
				sum[i] += 4000;
			}
			if (qimo[i] > 90)
			{
				sum[i] += 2000;
			}
			if (qimo[i] > 85 && xibu.charAt(i) == 'Y')
			{
				sum[i] += 1000;
			}
			if (banji[i] > 80 && ganbu.charAt(i) == 'Y')
			{
				sum[i] += 850;
			}
		}
		int summax = sum[0];
		for (i = 1;i < n;i++)
		{
			sumz += sum[i];
			if (sum[i] > summax)
			{
				summax = sum[i];
				k = i;
			}
		}
		sumz = sumz + sum[0];

		System.out.printf("%s\n%d\n%d\n",name[k],sum[k],sumz);

	}
}

