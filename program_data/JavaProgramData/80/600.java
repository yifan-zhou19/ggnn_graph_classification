package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int k = 0;
		int i;
		int w;
		int q;
		int T;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int d;
		int e;
		int f;
		int t;
		int h = 0;
		int g = 0;
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
		for (i = a;i <= d;i++)
		{
		 if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
		 {
		 k = k + 1;
		 }
		}
		t = (d - a - 1) * 365;
		for (w = b;w <= 12;w++)
		{
		  h = h + m[w];
		}
		for (q = e;q >= 1;q--)
		{
		 g = g + m[q - 1];
		}
		 T = t + k + h + g - c + f;
		 System.out.printf("%d",T);
		 return 0;
	}






}

