package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int min;
		int max;
		int f;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int a,b;
	//	}
	//	i[50000];
		int[] s = new int[10000];
		for (int u = 0;u < 10000;u++)
		{
			s[u] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max = 0;
		min = 0;
		for (int c = 0;c < n;c++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i[c].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				i[c].b = tempVar3;
			}
			if (c == 0)
			{
				min = i[c].a;
				max = i[c].b;
			}
			if (c > 0)
			{
				if (i[c].a < min)
				{
					min = i[c].a;
				}
				if (i[c].b > max)
				{
					max = i[c].b;
				}
			}
		}
		for (int d = min;d <= max;d++)
		{
			s[d] = 1;
		}
		for (int c = 0;c < n;c++)
		{
			for (int g = min;g <= max;g++)
			{
				if (g >= i[c].a && g < i[c].b)
				{
					s[g] = 0;
				}
			}
		}
		s[max] = 0;
		f = 1;
		for (int e = min;e <= max;e++)
		{
			if (s[e] == 1)
			{
				f = f * 0;
			}
			else
			{
				f = f * 1;
			}
		}
		if (f == 1)
		{
			System.out.printf("%d %d",min,max);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

