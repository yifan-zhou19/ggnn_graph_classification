package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100000];
		int i;
		int j;
		int k;
		int l;
		int m;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		l = 0;
		m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		p = a[0];
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n - l;i++)
		{
			if (m >= n)
			{
				break;
			}
			if (*(p + i) == k)
			{
				l++;
				for (j = i;j < n - l;j++)
				{
					t = (p + j);
					*(p + j) = *(p + j + 1);
					*(p + j + 1) = t;
				}
				i--;
			}
			m++;
		}
		for (i = 0;i < n - l;i++)
		{
			System.out.printf("%d",*(p + i));
			if (i != n - l - 1)
			{
				System.out.print(" ");
			}
		}
	}
}

