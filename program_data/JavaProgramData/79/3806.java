package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int exin = new int(int n,int m);
		int king;
		int[] a = new int[20];
		int[] b = new int[20];

		int i;
		int j;
		int l;

		for (i = 0;;i++)
		{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i] = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b[i] = Integer.parseInt(tempVar2);
		  }
		  if (a[i] == 0)
		  {
			j = i;
			break;
		  }
		}
		l = j;
		for (i = 0;i < l;i++)
		{
			king = exin(a[i], b[i]);
			System.out.printf("%d\n",king);
		}
	}


	public static int exin(int n,int m)
	{
		int i;
		int k = 0;
		int a = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int[] num = new int[300];
		p = num;
		for (i = 0;i < n;i++)
		{
			*(p + i) = i + 1;
		}
		i = 0;
		while (a < n - 1)
		{
			if (*(p + i) != 0)
			{
				k++;
			}
			if (k == m)
			{
				*(p + i) = 0;
				k = 0;
				a++;
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

