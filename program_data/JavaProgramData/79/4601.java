package <missing>;

public class GlobalMembers
{
	public static int baoshu(int n,int m)
	{
		int i;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int x;
		int sum;
		int j;
		int last;
		int[] num = new int[1000];
		k = 1;
		p = num; //??p??
		for (i = 0;i < n;i++)
		{
			*(p + i) = i + 1;
		}

		for (i = 0;i < m * n * n;i++)
		{
			sum = 0;
			for (j = 0;j < n;j++)
			{
				if (*(p + j) != 0)
				{
				sum = sum + 1;
				last = j + 1;
				}
			}
			if (sum == 1)
			{
				break;
			}
			x = i % n; //?????
			if (*(p + x) != 0)
			{
				if (k == m)
				{
					*(p + x) = 0;
					k = 0;
				}
			k = k + 1;
			}

		}
	  return last;
	}
	public static void Main()
	{
		int g;
		int h;
		int s;
		int monkey;

		for (s = 0;s < 100;s++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			g = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			h = Integer.parseInt(tempVar2);
		}
		if (g == 0 && h == 0)
		{
			break;
		}
		else
		{
			monkey = baoshu(g, h);
		System.out.printf("%d\n",monkey);
		}
		}

	}
}

