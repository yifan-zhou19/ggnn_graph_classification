package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int DS;
		int DE;
		int i;
		int j;
		int k;
		int m;
		int p;
		int n;
		int l;
		int md;
		int answer;

		n = 0;
		l = 0;
		DS = 0;
		DE = 0;
		p = 0;
		md = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		for (i = 1;i < sm;i++)
		{
		   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
		   {
			  md = 31;
		   }
			else if (i == 2)
			{
				if (sy % 400 == 0 || (sy % 100 != 0 && sy % 4 == 0))
				{
					md = 29;
				}
			else
			{
				md = 28;
			}
			}
			else
			{
				md = 30;
			}
					   DS = md + DS;
		}
						   DS = DS + sd;
		for (j = 1;sy + j <= ey;j++)
		{
			if ((sy + j - 1) % 400 == 0 || ((sy + j - 1) % 100 != 0 && (sy + j - 1) % 4 == 0))
			{
			k = 366;
			}
			else
			{
				k = 365;
			}
						  DE = k + DE;
		}
		for (m = 1;m < em;m++)
		{
			   if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10)
			   {
			  n = 31;
			   }
			else if (m == 2)
			{
				if (ey % 400 == 0 || (ey % 100 != 0 && ey % 4 == 0))
				{
					n = 29;
				}
			else
			{
				n = 28;
			}
			}
			else
			{
				n = 30;
			}
						   DE = n + DE;
		}
						   DE = DE + ed;
		answer = DE - DS;
		System.out.printf("%d",answer);
	}
}

