package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[5];
		int i;
		int j;
		int k;
		int m;
		int n;
		int f = new int(int a[5],int n,int m);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int [5])malloc(5 * 5 * (Integer.SIZE / Byte.SIZE));
		for (j = 0;j < 5;j++)
		{
			for (i = 0;i < 5;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[j] + i = tempVar;
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		k = f(a, n, m);
		if (k == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
				for (i = 0;i < 4;i++)
				{
					System.out.printf("%d ",*(a[j] + i));
				}
				System.out.printf("%d\n",*(a[j] + 4));
			}
		}
	}
	public static int f(int[] a, int n, int m)
	{
		int t;
		int i;
		int j;
		if (n > 4 || m > 4)
		{
			return (0);
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				t = (a[n] + i);
				*(a[n] + i) = *(a[m] + i);
				*(a[m] + i) = t;
			}
			return (1);
		}
	}

}

