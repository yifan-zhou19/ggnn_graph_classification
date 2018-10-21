package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i = 3;
		int a;
		int max;
		int sec;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		max = a;

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
		else
		{
			sec = a;
		}




		for (i = 3;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			if (a > max)
			{
				sec = max;
				max = a;
			}
			else if (a > sec)
			{
					sec = a;
			}
		}
		System.out.printf("%d\n%d\n",max,sec);



	}


}

