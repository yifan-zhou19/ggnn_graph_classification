public class point
	{
		public String a = new String(new char[20]);
		public int x;
		public int y;
		public char xue;
		public char xi;
		public int z;
		public int sum;
	}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int max = 0;
		int m = 0;
		int gong = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		point[] s;
		s = tangible.Arrays.initializeWithDefaultpointInstances(n);

		for (i = 0;i < n;i++)
		{
			s[i].sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].x = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i].y = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				s[i].xue = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				s[i].xi = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				s[i].z = Integer.parseInt(tempVar7);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (s[i].x > 80 && s[i].z >= 1)
			{
				s[i].sum = s[i].sum + 8000;
			}
			if (s[i].x > 85 && s[i].y > 80)
			{
				s[i].sum = s[i].sum + 4000;
			}
			if (s[i].x > 90)
			{
				s[i].sum = s[i].sum + 2000;
			}
			if (s[i].x > 85 && s[i].xi == 'Y')
			{
				s[i].sum = s[i].sum + 1000;
			}
			if (s[i].y > 80 && s[i].xue == 'Y')
			{
				s[i].sum = s[i].sum + 850;
			}
		}


		for (i = 0;i < n;i++)
		{
			if (s[i].sum > max)
			{
				max = s[i].sum;
				m = i;
			}
		}

		System.out.printf("%s\n",s[m].a);
		System.out.printf("%d\n",max);



		for (i = 0;i < n;i++)
		{
			gong = gong + s[i].sum;

		}
		System.out.printf("%d\n",gong);

		s = null;
	}


}

