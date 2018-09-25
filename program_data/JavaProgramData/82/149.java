package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int x = 0;
		int n;
		int[] b = new int[100];
		int[] t = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int s;
	//		int z;
	//	}
	//	a[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].s = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].z = tempVar3;
			}
			if ((a[i].s > 90 || a[i].s == 90) && (a[i].s < 140 || a[i].s == 140) && (a[i].z>60 || a[i].z == 60) && (a[i].z < 90 || a[i].z == 90))
			{
				b[i]++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == 1)
			{
				t[x]++;
				for (k = 1;;k++)
				{
					if (b[i + k] == 1)
					{
						t[x]++;
					}
					if (b[i + k] == 0 || i + k == n - 1 || i + k > n - 1)
					{
						x++;
						break;
					}
				}
			}
		}
		int max = 0;
		for (i = 0;i < x;i++)
		{
			if (t[max] < t[i])
			{
				max = i;
			}
		}
		System.out.printf("%d",t[max]);
		return 0;
	}

}

