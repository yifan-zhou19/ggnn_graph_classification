package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int baoshu = new int(int,int);
		int i;
		int x;
		int[] n = new int[50];
		int[] m = new int[50];
		int[] w = new int[50];
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if ((n[i] == 0) && (m[i] == 0))
			{
				break;
			}
		}
		x = i;
		for (i = 0;i < x;i++)
		{
			w[i] = baoshu(n[i], m[i]);
		}
		for (i = 0;i < x;i++)
		{
			System.out.printf("%d\n",w[i]);
		}
	}
	public static int baoshu(int n,int m)
	{
		int i; //k:???????,r:???????
		int k;
		int r;
		int[] num = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = num;
		for (i = 0;i < n;i++)
		{
			*(p + i) = i + 1;
		}
		i = 0;
		k = 0;
		r = 0;
		while (r < n - 1)
		{
			if (*(p + i) != 0)
			{
				k++;
			}
			if (k == m)
			{
				*(p + i) = 0;
				k = 0;
				r++;
			}
			i++;
			if (i == n)
			{
				i = 0;
			}
		}
		while (p == 0)
		{
			p++;
		}
		return (p);
	}
}

