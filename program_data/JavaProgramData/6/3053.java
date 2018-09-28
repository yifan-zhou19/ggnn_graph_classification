package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[100];
		int[] p = new int[100];
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *w[100];
		int[] w = new int[100];
		int j;
		int r;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			w[j] = (int)malloc(2 * (Integer.SIZE / Byte.SIZE));
		}
		for (j = 0;j < k;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w[j] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				w[j] + 1 = Integer.parseInt(tempVar3);
			}
			m = (w[j]);
			n = (w[j] + 1);
			for (r = 0;r < m;r++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[r] = (int)malloc(100 * (Integer.SIZE / Byte.SIZE));
			}
			for (r = 0;r < m;r++)
			{
				for (i = 0;i < n;i++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						p[r] + i = Integer.parseInt(tempVar4);
					}
				}
			}
			for (r = 0,i = 0;i < n;i++)
			{
				s = s + *(p[r] + i);
			}
			for (r = m - 1,i = 0;i < n;i++)
			{
				s = s + *(p[r] + i);
			}
			for (i = 0,r = 1;r < m - 1;r++)
			{
				s = s + *(p[r] + i);
			}
			for (i = n - 1,r = 1;r < m - 1;r++)
			{
				s = s + *(p[r] + i);
			}
			System.out.printf("%d\n",s);
			s = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(p[0]);
		}
	}


}

