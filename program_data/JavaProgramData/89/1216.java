package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100000];
		int[] b = new int[100000];
		int[] c = new int[100000];
		int[] d = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(d,0,(Integer.SIZE / Byte.SIZE));
		int i;
		for (i = 0;;i++)
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
			if ((a[i] == 0) && (b[i] == 0))
			{
				break;
			}
			c[a[i]] = 1;
			d[b[i]]++;
		}
		for (i = 0;i < n;i++)
		{
			if ((c[i] == 0) && (d[i] == n - 1))
			{
				System.out.printf("%d\n",i);
			}
		}
	}



}

