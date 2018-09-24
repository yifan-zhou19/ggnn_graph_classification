package <missing>;

public class GlobalMembers
{
	public static int pfCompare(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int)elem1;
		p2 = (int)elem2;
		return (p2) - p1;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];
		int[] e = new int[n];
		int i;
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[i] = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							b[i] = Integer.parseInt(tempVar3);
						}
						String tempVar4 = ConsoleInput.scanfRead(" ");
						if (tempVar4 != null)
						{
							c[i] = Integer.parseInt(tempVar4);
						}
						d[i] = b[i] + c[i];
						e[i] = d[i];
		}
		qsort(e,n,4,pfCompare);
		for (int k = 0;k < 3;k++)
		{
				for (i = 0;i < n;i++)
				{
				if (d[i] == e[k])
				{
					System.out.printf("%d %d\n",a[i],d[i]);
				d[i] = 0;
				break;
				}
				}
		}
		System.in.read();
		System.in.read();
	}
}

