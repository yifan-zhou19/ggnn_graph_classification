package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a[100];
		int[] a = new int[100];
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *m;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *n;
		int n;
		int i;
		int plus = 0;
		int j;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		m = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		n = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m + i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n + i = Integer.parseInt(tempVar3);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a[i] = (int)malloc(((*(m + i)) * (*(n + i))) * (Integer.SIZE / Byte.SIZE));
			for (j = 0;j < *(m + i);j++)
			{
				for (l = 0;l < *(n + i);l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i] + (j * (*(n + i)) + l) = tempVar4;
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < *(m + i);j++)
			{
				plus = plus + (*(a[i] + (j * (*(n + i)))));
				plus = plus + (*(a[i] + ((j + 1) * (*(n + i)) - 1)));
			}
			for (l = 1;l < (*(n + i)) - 1;l++)
			{
				plus = plus + (*(a[i] + l));
				plus = plus + (*(a[i] + l + (*(m + i) - 1) * (*(n + i))));
			}
			System.out.printf("%d\n",plus);
			plus = 0;
		}
		return 0;
	}
}

