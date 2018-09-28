package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int s;
		int max;
		int[] qimo = new int[150];
		int[] ban = new int[150];
		int[] lun = new int[150];
		int[] zong = new int[150];
		char[][] name = new char[150][20];
		String xue = new String(new char[150]);
		String xi = new String(new char[150]);
		String the = new String(new char[20]);

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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				qimo[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				ban[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				xue = tangible.StringFunctions.changeCharacter(xue, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xi = tangible.StringFunctions.changeCharacter(xi, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				lun[i] = Integer.parseInt(tempVar7);
			}
		}


		for (i = 0;i < n;i++)
		{
			zong[i] = 0;

			if (qimo[i] > 80 && lun[i] >= 1)
			{
				zong[i] = zong[i] + 8000;
			}
			if (qimo[i] > 85 && ban[i] > 80)
			{
				zong[i] = zong[i] + 4000;
			}
			if (qimo[i] > 90)
			{
				zong[i] = zong[i] + 2000;
			}
			if (qimo[i] > 85 && xi.charAt(i) == 'Y')
			{
				zong[i] = zong[i] + 1000;
			}
			if (ban[i] > 80 && xue.charAt(i) == 'Y')
			{
				zong[i] = zong[i] + 850;
			}
		}

		max = zong[0];
		the = name[0];

		for (i = 1;i < n;i++)
		{
			if (zong[i] > max)
			{
				max = zong[i];
				the = name[i];
			}
		}


		s = 0;

		for (i = 0;i < n;i++)
		{
			s = s + zong[i];
		}


			System.out.printf("%s\n",the);
			System.out.printf("%d\n",max);

		System.out.printf("%d\n",s);
	}
}

