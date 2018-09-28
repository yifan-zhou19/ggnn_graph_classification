package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //sp=systolic pressure,dp=diabolic pressure,dur=duration
		int sp;
		int dp;
		int dur;
		int h = 0;
		int max = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sp = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				dp = Integer.parseInt(tempVar3);
			}
			if (sp >= 90 && sp <= 140 && dp >= 60 && dp <= 90)
			{
				h++;
				dur = h;
			}
			else
			{
				dur = h = 0;
			}
			if (max >= dur)
			{
				continue;
			}
			else
			{
				max = dur;
			}
		}
		System.out.printf("%d\n",max);
	}
}

