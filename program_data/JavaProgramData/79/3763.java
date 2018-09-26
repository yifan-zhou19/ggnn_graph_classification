package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] q = new int[300];
		int[] w = new int[300];
		int j = 0;
		int e;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int[] a = new int[500];
		int k;
		int t;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				q[j] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w[j] = Integer.parseInt(tempVar2);
			}
			j++;
		} while (q[j - 1] != 0);
		e = j - 1;
		j = 0;
		for (j = 0;j < e;j++)
		{
			p = a;
		for (i = 0;i < q[j];i++)
		{
			*(p + i) = i + 1;
		}
		i = 0;
		k = 0;
		t = 0;
		while (t < q[j] - 1)
		{
			if (*(p + i) != 0)
			{
				k++;
			}
			if (k == w[j])
			{
				*(p + i) = 0;
				k = 0;
				t++;
			}
			i++;
			if (i == q[j])
			{
				i = 0;
			}
		}
		while (p == 0)
		{
			p++;
		}
		System.out.printf("%d\n", p);
		}
	}

}

