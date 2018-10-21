package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int i;
		int s;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if ((m % 4 == 0 && m % 100 != 0) || (m % 400 == 0))
		{
			int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (i = 0;i < a;i++)
			{
				c = c + months[i];
			}
			s = c + b;
		}
		else
		{
			int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (i = 0;i < a;i++)
			{
				c = c + month[i];
			}
			s = c + b;
		}
		System.out.printf("%d",s);
		return 0;
	}
}

