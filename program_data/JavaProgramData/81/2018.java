package <missing>;

public class GlobalMembers
{
	public static int check(int[] a, int n, int m)
	{
		int temp;
		int i;
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				temp = (a[m] + i);
				*(a[m] + i) = *(a[n] + i);
				*(a[n] + i) = temp;
			}
			return (1);
		}
		else
		{
			return (0);
		}
	}

	public static void Main()
	{
		int[] a = new int[5];
		int n;
		int m;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int [5])malloc(5 * (Integer.SIZE / Byte.SIZE));
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (check(a, n, m) == 0)
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


}

