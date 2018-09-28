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
		int g;
		int[] h = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (b = 0;b < a;b++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = Integer.parseInt(tempVar2);
			}
			if (c == 0)
			{
				System.out.print("60\n");
				continue;
			}
			else
			{
				e = 0;
				f = 60;
				for (d = 1;d <= c;d++)
				{
					String tempVar3 = ConsoleInput.scanfRead(" ");
					if (tempVar3 != null)
					{
						h[d] = Integer.parseInt(tempVar3);
					}
				}
				for (d = 1;d <= c;d++)
				{
					e = e + h[d];
					if (e >= 60)
					{
						break;
					}
					e = e+3;
					if (e >= 60)
					{
						f = f - 3 + e-60;
						break;
					}
					f = f - 3;
					e = e - h[d];
					if (d == c)
					{
						f = 60 - 3 * c;
						break;
					}
				}
				System.out.printf("%d\n",f);
			}
		}
	}


}

