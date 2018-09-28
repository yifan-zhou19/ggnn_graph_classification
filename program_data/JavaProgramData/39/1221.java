package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int r;
		int o = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] renming = new char[200][20];
		String ganbu = new String(new char[200]);
		String xibu = new String(new char[200]);
		int[] a = new int[200];
		int[] b = new int[200];
		int[] c = new int[200];
		int[] total = new int[200];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				renming[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
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
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				c[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			total[i] = 0;
			if (a[i] > 80 && c[i] > 0)
			{
				total[i] += 8000;
			}
			if (a[i] > 85 && b[i] > 80)
			{
				total[i] += 4000;
			}
			if (a[i] > 90)
			{
				total[i] += 2000;
			}
			if (a[i] > 85 && xibu.charAt(i) == 'Y')
			{
				total[i] += 1000;
			}
			if (b[i] > 80 && ganbu.charAt(i) == 'Y')
			{
				total[i] += 850;
			}
			if (total[i] > j)
			{
				j = total[i];
				r = i;
			}
			o += total[i];
		}
		System.out.printf("%s\n%d\n%d",renming[r],j,o);
		return 0;
	}

}

