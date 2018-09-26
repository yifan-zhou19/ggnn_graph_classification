package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int f;
		int m;
		int s1;
		int f1;
		int m1;
		int sum;
		int a;
		int b;
		int i;
		for (i = 0;;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			f = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			s1 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			f1 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			m1 = Integer.parseInt(tempVar6);
		}
		if (s == 0 && f == 0 && m == 0 && s1 == 0 && f1 == 0 && m1 == 0)
		{
			break;
		}
		a = (s1 + 12 - s) * 60;
		b = a - f + f1;
		sum = b * 60 + m1 - m;
		System.out.printf("%d\n",sum);
		}

		return 0;
	}
}

