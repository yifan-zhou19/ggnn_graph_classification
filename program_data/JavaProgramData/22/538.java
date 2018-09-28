package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int max;
		int sec = -1;
		int i;
		char s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			max = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 300;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			if (s == '\n')
			{
				break;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			if (a > max)
			{
				sec = max;
				max = a;
			}
			else if (a == max)
			{
				continue;
			}
			else
			{
				if (a > sec)
				{
				 sec = a;
				}
			}
		}
		if (sec == -1)
		{
			System.out.print("No");
		}
		else if (max == sec)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d", sec);
		}
		return 0;
	}

}

