package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//freopen("tt.in","r",stdin);
		//freopen("tt.out","w",stdout);
		int i;
		int j;
		int n;
		int k;
		int t;
		int max;
		char gan;
		char xi;
		int g1;
		int g2;
		int lun;
		int r;
		String s = new String(new char[333]);
		String s1 = new String(new char[333]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		r = 0;
		max = -999;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				g1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				g2 = Integer.parseInt(tempVar4);
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
				lun = Integer.parseInt(tempVar7);
			}


			t = 0;
			if ((g1 > 80) && (lun >= 1))
			{
				t += 8000;
			}
			if ((g1 > 85) && (g2 > 80))
			{
				t += 4000;
			}
			if (g1 > 90)
			{
				t += 2000;
			}
			if ((g1 > 85) && (xi == 'Y'))
			{
				t += 1000;
			}
			if ((g2 > 80) && (gan == 'Y'))
			{
				t += 850;
			}
			r += t;
			if (t > max)
			{
				max = t;
				s1 = s;
			}
		}
		System.out.println(s1);
		System.out.printf("%d\n%d\n",max,r);
		return 0;
	}
}

