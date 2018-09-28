package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int tianshu = new int(int nian,int yue);
		int i;
		int n;
		int nian;
		int yue1;
		int yue2;
		int dur;
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
				nian = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				yue1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				yue2 = Integer.parseInt(tempVar4);
			}
			dur = tianshu(nian, yue2) - tianshu(nian, yue1);
			if (dur % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
	public static int tianshu(int nian,int yue)
	{
		int i;
		int result = 0;
		for (i = 1;i <= yue-1;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result = result + 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result = result + 30;
			}
			else if (i == 2)
			{
				if (nian % 4 == 0 && nian % 100 != 0 || nian % 400 == 0)
				{
					result = result + 29;
				}
				else
				{
					result = result + 28;
				}
			}
		}
		return result;
	}
}

