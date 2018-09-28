package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a[100];
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a[i] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] + j = tempVar3;
				}
			}
		}
		for (k = 0;k < n;k++)
		{
			i = 0;
			j = k;
			do
			{
				System.out.printf("%d\n",*(a[i] + j));
				i++;
				j--;
			}while (j >= 0 && i < m);
		}
		if (m >= 2)
		{
			for (k = 1;k < m;k++)
			{
				i = k;
				j = n - 1;
				do
				{
					System.out.printf("%d\n",*(a[i] + j));
					i++;
					j--;
				}while (j >= 0 && i < m);
			}
		}
		return 0;
	}
}

