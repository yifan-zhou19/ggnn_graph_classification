package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int k;
		int i;
		int j = 0;
		int l;
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
						if (a[i] != k)
						{
					  if (j != 0)
					  {
						  System.out.printf(" %d",a[i]);
					  }
					  if (j == 0)
					  {
						  System.out.printf("%d",a[i]);
						  j++;
					  }
						}

		}
	}
}

