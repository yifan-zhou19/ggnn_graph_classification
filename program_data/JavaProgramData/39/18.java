package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[100][20];
		String d = new String(new char[100]);
		String e = new String(new char[100]);
		int[] b = new int[100];
		int[] c = new int[100];
		int[] f = new int[100];
		int[] sum = new int[100];
		int total = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				e = tangible.StringFunctions.changeCharacter(e, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				f[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
		   if (b[i] > 80 && f[i] > 0)
		   {
		   sum[i] += 8000;
		   }
		   if (b[i] > 85 && c[i] > 80)
		   {
		   sum[i] += 4000;
		   }
		   if (b[i] > 90)
		   {
		   sum[i] += 2000;
		   }
		   if (b[i] > 85 && e.charAt(i) == 'Y')
		   {
		   sum[i] += 1000;
		   }
		   if (c[i] > 80 && d.charAt(i) == 'Y')
		   {
		   sum[i] += 850;
		   }
		}
		for (i = 0;i < n;i++)
		{
		   total += sum[i];
		}
		max = sum[0];
		t = 0;
		for (i = 0;i < n;i++)
		{
			if (max < sum[i])
			{
			   t = i;
			   max = sum[i];
			}
		}
		System.out.printf("%s\n%d\n%d",a[t],max,total);
		return 0;
	}
}

