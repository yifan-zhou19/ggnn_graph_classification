package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
			int n;
			int k;
			int i;
			int j;
			int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
			int p;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			p = a;
			for (i = 0;i < n;i++)
			{
					if (*(p + i) == k)
					{
							for (j = 1;i + j < n;j++)
							{
									if (*(p + (i + j)) != k)
									{
										*(p + i) = *(p + (i + j));
										*(p + (i + j)) = k;
										break;
									}
							}
					}
					if (*(p + i) == k)
					{
						break;
					}
			}
			for (j = 0;j < i - 1;j++)
			{
			System.out.printf("%d ",*(p + j));
			}
			System.out.printf("%d",*(p + (i - 1)));
	}

}

