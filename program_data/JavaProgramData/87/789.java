package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int i;
		int s;
		int[] sum = new int[100];
		for (i = 0;i < 100;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		if ((a + b + c + d + e + f) != 0)
		{
							 if (f < c)
							 {
							 f += 60;
							 e -= 1;
							 }
							 if (e < b)
							 {
							 e += 60;
							 d -= 1;
							 }

							 d += 12;

							 sum[i] = f - c + (e - b) * 60 + (d - a) * 3600;
		}
							 else
							 {
								   break;
							 }
		}
		for (s = 0;s < i;s++)
		{
						 System.out.printf("%d\n",sum[s]);
		}

		return 0;
	}

}

