package <missing>;

public class GlobalMembers
{
	public static int gedui(int zong, int duishu,int ini)
	{
		int p;
		int k = 0;
		int end;
		end = zong / duishu;
		if (duishu > 2)
		{
			for (p = ini;p <= end;p++)
			{
				k += gedui(zong - p, duishu - 1, p);
			}
		}
		else if (duishu == 2)
		{
			k = zong / 2 - ini + 1;
		//	printf("2zong%d,ini%d,k%d\n",zong,ini);
		}
		else if (duishu == 1)
		{
			k = 1;
		}
		return k;
	}

	public static int r(int zong,int dui)
	{
		int o;
		int count = 0;
		for (o = 1;o <= dui;o++)
		{
			count += gedui(zong, o, 1);
		//	printf("count%d,zong%d,dui%d\n",count,zong,dui);
		}
		return count;
	}



	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int dui;
		int u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			u = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			if (m > n)
			{
				dui = n;
			}
			else
			{
				dui = m;
			}
			u = r(m, dui);
			if (i != 0)
			{
				System.out.print("\n");
			}
			System.out.printf("%d",u);
		}
		return 0;
	}

}

