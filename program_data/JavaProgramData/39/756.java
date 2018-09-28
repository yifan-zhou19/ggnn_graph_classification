package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] name = new char[100][30];
		int n;
		int i;
		int totle = 0;
		int m;
		int mast = 0;
		int[][] s = new int[100][4];
		char x;
		char g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s[i][3] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i][0] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i][1] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				g = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				x = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				s[i][2] = Integer.parseInt(tempVar7);
			}
			if (s[i][0] > 80)
			{
				if (s[i][2] != 0)
				{
					s[i][3] = s[i][3] + 8000;
				}
			}
			if (s[i][0] > 85)
			{
				if (s[i][1] > 80)
				{
					s[i][3] = s[i][3] + 4000;
				}
				if (x == 'Y')
				{
					s[i][3] = s[i][3] + 1000;
				}
			}
			if (s[i][0] > 90)
			{
				s[i][3] = s[i][3] + 2000;
			}
			if (s[i][1] > 80 && g == 'Y')
			{
				s[i][3] = s[i][3] + 850;
			}
			if (s[i][3] > mast)
			{
				mast = s[i][3];
				m = i;
			}
			totle = totle + s[i][3];
		}
		System.out.printf("%s",name[m]);
		System.out.printf("\n%d\n%d",mast,totle);
		return 0;
	}
}

