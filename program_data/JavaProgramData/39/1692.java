package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		int c;
		int j;
		int s = 0;
		int max = 0;
		int[] a = new int[800];
		char[][] b = new char[200][500];
		char y;
		char x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				b[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				t = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				y = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				x = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				c = Integer.parseInt(tempVar7);
			}


			if (k > 80 && c > 0)
			{
				a[i] += 8000;
			}
			if (k > 85 && t > 80)
			{
				a[i] += 4000;
			}
			if (k > 90)
			{
				a[i] += 2000;
			}
			   if (k > 85 && x == 'Y')
			   {
				   a[i] += 1000;
			   }
			   if (t > 80 && y == 'Y')
			   {
				   a[i] += 850;
			   }
			s += a[i];
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				j = i;
			}
		}


		System.out.printf("%s\n%d\n%d",b[j],max,s);
		return 0;
	}
}

