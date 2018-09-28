package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int[] m = new int[100];
		int[] n = new int[100];
		int[] num = new int[301];
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
	for (j = 0;;j++)
	{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[j] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[j] = Integer.parseInt(tempVar2);
			}
		if (n[j] == 0 && m[j] == 0)
		{
		break;
		}
	}
	for (j = 0;;j++)
	{
			if (n[j] == 0 && m[j] == 0)
			{
		break;
			}
		p = num;
		for (i = 0;i < n[j];i++)
		{
			*(p + i) = i + 1;
		}
		i = 0;
		k = 0;
		a[j] = 0;
		while (a[j] < n[j] - 1)
		{
				if (*(p + i) != 0)
				{
					k++;
				}
			if (k == m[j])
			{
					*(p + i) = 0;
				k = 0;
				a[j]++;
			}
			i++;
			if (i == n[j])
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

