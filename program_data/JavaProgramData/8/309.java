package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		int[] c = new int[100];
		int[] d = new int[100];
		int i;
		int t;
		int r;
		i = 0;
		do
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			i++;
		}while (i < a);
		i = 0;
		do
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d[i] = Integer.parseInt(tempVar4);
			}
			i++;
		}while (i < b);
		t = 0;
		do
		{
			i = 0;
			while (i < a - 1 - t)
			{
				if (c[i] > c[i + 1])
				{
					r = c[i];
					c[i] = c[i + 1];
					c[i + 1] = r;
				}
				i++;
			}
			t++;
		}while (t < a - 1);
		t = 0;
		do
		{
			i = 0;
			while (i < b - 1 - t)
			{
				if (d[i] > d[i + 1])
				{
					r = d[i];
					d[i] = d[i + 1];
					d[i + 1] = r;
				}
				i++;
			}
			t++;
		}while (t < b - 1);
		System.out.printf("%d",c[0]);
		i = 1;
		do
		{
			System.out.printf(" %d",c[i]);
			i++;
		}while (i < a);
		i = 0;
		do
		{
			System.out.printf(" %d",d[i]);
			i++;
		}while (i < b);
		return 0;
	}

}

