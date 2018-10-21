package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] qm = new int[100];
		int[] bj = new int[100];
		int[] lw = new int[100];
		int i;
		int j;
		int l = 0;
		int k;
		int[] z = new int[100];
		int p = 0;
		char[][] na = new char[100][30];
		String bg = new String(new char[100]);
		String mz = new String(new char[100]);
		char[][] P = new char[1][30];
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
				na[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				qm[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				bj[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				bg = tangible.StringFunctions.changeCharacter(bg, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				mz = tangible.StringFunctions.changeCharacter(mz, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				lw[i] = Integer.parseInt(tempVar7);
			}
		}
	for (i = 0;i < n;i++)
	{
			if (qm[i] > 80 && lw[i] >= 1)
			{
				z[i] = z[i] + 8000;
			}
			if (qm[i] > 85 && bj[i] > 80)
			{
				z[i] = z[i] + 4000;
			}
			if (qm[i] > 90)
			{
				z[i] = z[i] + 2000;
			}
			if (qm[i] > 85 && mz.charAt(i) == 'Y')
			{
				z[i] = z[i] + 1000;
			}
			if (bg.charAt(i) == 'Y' && bj[i] > 80)
			{
				z[i] = z[i] + 850;
			}
	}
		for (j = 0;j < n - 1;j++)
		{
				for (i = 0;i < n - j - 1;i++)
				{

				if (z[i] < z[i + 1])
				{
					k = z[i];
					z[i] = z[i + 1];
					z[i + 1] = k;
					P = na[i];
					na[i] = na[i + 1];
					na[i + 1] = P;

				}
				}

		}
		for (i = 0;i < n;i++)
		{
			p = p + z[i];
		}
		System.out.printf("%s\n%d\n%d\n",na[0],z[0],p);
	}
}

