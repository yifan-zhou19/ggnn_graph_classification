package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[10];
		int i;
		int j;
		int k;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
						memset(a,0,(Integer.SIZE / Byte.SIZE));
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							m = Integer.parseInt(tempVar2);
						}
						for (j = 0;j < m;j++)
						{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							a[j] = Integer.parseInt(tempVar3);
						}
						}
						if (m == 0)
						{
							System.out.print("60\n");
						}
						else
						{
						for (j = 0;j < m;j++)
						{
									   if (a[j] + 3 * (j + 1) < 60)
									   {
										   count = 60 - 3 * (j + 1);

									   }
									   else
									   {
										   break;
									   }
						}
							 if ((a[j] + 3 * j >= 57) && (a[j] + 3 * j < 60))
							 {
							 count = a[j];
							 }
							 System.out.printf("%d\n",count);
						}
		}
						return 0;
	}

}

