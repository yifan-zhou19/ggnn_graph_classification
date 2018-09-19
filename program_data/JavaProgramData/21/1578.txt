package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int *p,*k;
		int[] p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: uint *k;
		int k;
		int n;
		int i;
		int j = 0;
		int t;
		int m = 0;
		int tmp;
		double a = 0;
		double sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *c;
		double c;
		double lar = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: p=(unsigned int*)malloc(sizeof(unsigned int)*n);
		p = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		c = (double)malloc((Double.SIZE / Byte.SIZE) * n);
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: k=(unsigned int*)malloc(sizeof(unsigned int)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		k = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + (double)p[i];
		}
		a = sum / (double)n;
		for (i = 0;i < n;i++)
		{
			if (a - (double)p[i] >= 0)
			{
				c[i] = a - (double)p[i];
			}
			else
			{
				c[i] = (double)p[i] - a;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (lar < c[i])
			{
				lar = c[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == lar)
			{
				k[j] = p[i];
				j++;
			}
		}
		m = j;
		for (i = 0;i < m;i++)
		{
			t = i;
			for (j = m - 1;j > i;j--)
			{
				if (k[j] > k[j - 1])
				{
					t = j - 1;
				}
			}
			tmp = k[i];
			k[i] = k[t];
			k[t] = tmp;
		}
		System.out.printf("%u",k[0]);
		for (i = 1;i < t + 1;i++)
		{
			System.out.printf(",%u",k[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(k);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(c);
		return 0;
	}
}

