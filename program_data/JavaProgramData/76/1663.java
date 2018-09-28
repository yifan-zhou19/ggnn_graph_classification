package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max;
		int min;
		int p;
		int q;
		int s;
		s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a;
		int[] b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * c;
		int c;
		a = new int[n];
		b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		max = b[0];
		min = a[0];
		for (i = 1;i < n;i++)
		{
			if (min > a[i])
			{
				min = a[i];
			}
			if (max < b[i])
			{
				max = b[i];
			}
		}
		q = max - min;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		c = (int)malloc((Integer.SIZE / Byte.SIZE) * q);
		for (i = 0;i < q;i++)
		{
			c[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = a[i] - min;j < b[i] - min;j++)
			{
				c[j] = 0;
			}
		}
		for (i = 0;i < q;i++)
		{
			s += c[i];
		}
		if (s >= 1)
		{
			System.out.print("no");
		}
		if (s == 0)
		{
			System.out.printf("%d %d",min,max);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(c);
		return 0;
	}
}

