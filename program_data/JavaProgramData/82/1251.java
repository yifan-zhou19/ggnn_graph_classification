package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int result = 0;
		int i = 1;
		int max = 0;
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
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		{
		result += 1;
		i++;
		}
		else
		{
		if (result > max)
		{
		max = result;
		result = 0;
		i++;
		}
		else
		{
		result = 0;
		i++;
		}
		}
		}
		if (result > max)
		{
		   max = result;
		}
		System.out.printf("%d",max);
		return 0;
	}




}

