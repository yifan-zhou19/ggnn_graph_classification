package <missing>;

public class GlobalMembers
{
	public static int c;
	public static int Main()
	{
		int[] p;
		int[] q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *z;
		int z;
		int n;
		int i;
		int j;
		int sum = 0;
		int d;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new int[10 * n];
		q = new int[10 * n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		z = (int)malloc(10 * n * (Integer.SIZE / Byte.SIZE));
		for (i = 0;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q[i] = Integer.parseInt(tempVar3);
			}
			if (p[i] == 0 && q[i] == 0)
			{
			break;
			}

		}
		sum = i;
		for (i = 0;i < n;i++)
		{
		z[i] = i;
		}
		for (i = 0;i < n;i++)
		{
			d = 0;
			for (j = 0;j < sum;j++)
			{
				if (z[i] == p[j])
				{
				break;
				}
				else if (z[i] == q[j])
				{
				d = d + 1;
				}
			}

			if (d == (n - 1))
			{
				System.out.printf("%d",z[i]);
			}
			else
			{
				m = m + 1;
			}


		}



	}
}

