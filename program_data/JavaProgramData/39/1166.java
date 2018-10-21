package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int zong = 0;
		int max;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] r = new int[100];
		char[][] name = new char[100][21];
		String s = new String(new char[100]);
		String t = new String(new char[100]);
		String temp = new String(new char[20]);

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
				s = tangible.StringFunctions.changeCharacter(s, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				t = tangible.StringFunctions.changeCharacter(t, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				r[i] = Integer.parseInt(tempVar7);
			}
		}
			int[] sum = new int[100];
		for (i = 0;i < n;i++)
		{
			if ((a[i] > 80) && (r[i] >= 1))
			{
				sum[i] += 8000;
			}
			if ((a[i] > 85) && (b[i] > 80))
			{
				sum[i] += 4000;
			}
			if (a[i] > 90)
			{
				sum[i] += 2000;
			}
			if ((a[i] > 85) && (t.charAt(i) == 'Y'))
			{
				sum[i] += 1000;
			}
			if ((b[i] > 80) && (s.charAt(i) == 'Y'))
			{
				sum[i] += 850;
			}
		}
		max = sum[0];
		for (i = 0;i < n;i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
				temp = name[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			zong += sum[i];
		}
		System.out.printf("%s\n",temp);
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",zong);
		return 0;
	}
}

