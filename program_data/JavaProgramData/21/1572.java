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
		int i;
		int j;
		int k;
		int s;
		int y;
		int x;
		int z;
		int w;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int *p=0;
		int[] p = 0;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: p=(unsigned int*)malloc(sizeof(unsigned int)*n);
		p = new int[n];
		double total = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *deviation;
		double deviation;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		deviation = (double)malloc((Double.SIZE / Byte.SIZE) * n);
		double mean;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = Integer.parseInt(tempVar2);
			}
			total = total + p[i];
		}
		mean = total / n;
		for (j = 0;j < n;j++)
		{
			deviation[j] = Math.abs(p[j] - mean);
		}
		double b = deviation[0];
		int num = 0;
		for (k = 0;k < n;k++)
		{
			if (b < deviation[k + 1])
			{
			b = deviation[k + 1];
			}
		}
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int *fit;
		int[] fit;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: fit=(unsigned int*)malloc(sizeof(unsigned int)*n);
		fit = new int[n];
		fit[0] = 0;
		for (s = 0;s < n;s++)
		{
			if (deviation[s] == b)
			{
				fit[s] = p[s];
				num = num + 1;
			}
			else
			{
				fit[s] = 0;
			}
		}
		if (num == 1)
		{
			for (x = 0;x < n;x++)
			{
				if (deviation[x] == b)
				{
					fit[x] = p[x];
					System.out.printf("%u",fit[x]);
				}
			}
		}
		else
		{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int tmp;
			int tmp;
			for (y = 0;y < n;y++)
			{
				for (z = 0;z < n - y;z++)
				{
					if (fit[z] > fit[z + 1])
					{
						tmp = fit[z];
						fit[z] = fit[z + 1];
						fit[z + 1] = tmp;
					}
				}
			}
			if (num == 2)
			{
				System.out.printf("%u,%u",fit[n - 2],fit[n - 1]);
			}
			else
			{
				System.out.printf("%u",fit[n - num]);
				for (w = n - num + 1;w < n,fit[w] != 0;w++)
				{
					System.out.printf(",%u",fit[w]);
				}
			}
		}
		System.out.print("\n");
		   return 0;
	}

}

