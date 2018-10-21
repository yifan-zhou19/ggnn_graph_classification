package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int N;
		int i;
		int sch;
		int msch = 0;
		int ssch = 0;
		String mname = new String(new char[21]);
			String name = new String(new char[21]);
			int aver;
			int ping;
			char lead;
			char west;
			int essay;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= N;i++)
		{
			sch = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				aver = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				ping = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				lead = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				essay = Integer.parseInt(tempVar7);
			}
			if ((aver > 80) && (essay >= 1))
			{
				sch = sch + 8000;
			}
			if ((aver > 85) && (ping > 80))
			{
				sch = sch + 4000;
			}
			if (aver > 90)
			{
				sch = sch + 2000;
			}
			if ((aver > 85) && (west == 'Y'))
			{
				sch = sch + 1000;
			}
			if ((ping > 80) && (lead == 'Y'))
			{
				sch = sch + 850;
			}
			ssch = ssch + sch;
			if (sch > msch)
			{
				msch = sch;
				mname = name;
			}
		}
		System.out.printf("%s\n%d\n%d\n",mname,msch,ssch);
	}

}

