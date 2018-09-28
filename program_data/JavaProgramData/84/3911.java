package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int resulta = 0;
		int resultb = 0;
		int num;
		int n;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num = Integer.parseInt(tempVar2);
		}
		if (i == 1)
		{
		resulta = num;
		}
		else
		{
			if (num > resulta)
			{
		resultb = resulta;
		resulta = num;
			}
			else
			{
				if (num < resulta && num> resultb)
				{
				resultb = num;
				}
			}
		}
		i++;
		}
		System.out.printf("%d\n",resulta);
		System.out.printf("%d\n",resultb);


	}
}

