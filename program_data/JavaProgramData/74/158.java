package <missing>;

public class GlobalMembers
{
	public static int judge1(int n)
	{
		int i;
		if (n == 1)
		{
			return 0;
		}
		else
		{
			for (i = 2;i < n / 2;i++)
			{
				if (n % i == 0)
				{
					return 0;
					break;
				}
			}
			return 1;
		}
	}
	public static void reverse(int[] a)
	{
		int i;
		int k = 0;
		int temp;
		for (i = 1;i < 100;i++)
		{
			if (a[i] == -1)
			{
				break;
			}
		}
		k = i - 1;
		for (i = 1;i <= k / 2;i++)
		{
			temp = a[i];
			a[i] = a[k - i + 1];
			a[k - i + 1] = temp;
		}
	}
	public static int judge2(int n)
	{
		(double)n;
		double i;
		int j = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		while (j < 100)
		{
			a[j] = -1;
			j++;
		}
		j = 1;
		while (j < Math.log10(n) + 1)
		{
			i = j;
			a[j] = b[j] = (fmod(n,Math.pow(10,i)) - fmod(n,Math.pow(10,i - 1))) / Math.pow(10,i - 1);
			i++;
			j++;
		}
		reverse(a);
		for (j = 1;a[j] != -1;j++)
		{
			 if (a[j] != b[j])
			 {
				return 0;
				break;
			 }
		}
		return 1;
	}
	public static int Main()
	{
		int i;
		int a;
		int b;
		int k = 0;
		int[] x = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
		for (i = a;i <= b;i++)
		{
			if (judge1(i) != 0 && judge2(i) == 1)
			{
				x[k] = i;
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",x[i]);
		}
		System.out.printf("%d",x[k - 1]);
		}
		return 0;
	}



}

