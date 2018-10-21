package <missing>;

public class GlobalMembers
{
	public static int quicksort(int[] a, int initial, int end)
	{
		int m;
		int i;
		int tmp;
		if (initial >= end)
		{
			return;
		}
		m = initial;
		for (i = initial + 1;i <= end;i++)
		{
		  if (a[i] < a[initial])
		  {
			 tmp = a[i];
			 a[i] = a[++m];
			 a[m] = tmp;
		  }
		}
		tmp = a[m];
		a[m] = a[initial];
		a[initial] = tmp;
		if (initial < m - 1)
		{
			quicksort(a, initial, m - 1);
		}
		if (m + 1 < end)
		{
			quicksort(a, m + 1, end);
		}
	}
	public static int run(int[] a, int[] b, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *tag1;
		int tag1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *tag2;
		int tag2;
		int i;
		int time = 0;
		int posa1 = 0;
		int posb1 = 0;
		int posa2 = n - 1;
		int posb2 = n - 1;
		int nul = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		tag1 = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		tag2 = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		quicksort(a, 0, n - 1);
		quicksort(b, 0, n - 1);
		while (posa1 <= posa2)
		{
			if (a[posa1] > b[posb1])
			{
				time++;
				posa1++;
				posb1++;
			}
			else
			{
			  if (a[posa2] > b[posb2])
			  {
				  time++;
				  posa2--;
				  posb2--;
			  }
			  else
			  {
				if (a[posa1] < b[posb2])
				{
					time--;
					posa1++;
					posb2--;
				}
				else
				{
				  if (a[posa1] == b[posb2])
				  {
					  nul++;
					  posa1++;
					  posb2--;
				  }
				}
			  }
			}
		}
		 //printf("win%d nul%d loss%d",time,nul,n-time-nul);
		return (time) * 200; //-(n-time-nul)*200;
	}

	public static int Main()
	{
	   int n = 1;
	   int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *t;
	   int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
	   int q;
	   //scanf("%d",&n);
	   while (n != 0)
	   {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  t = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  q = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		  for (i = 0;i < n;i++)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t + i = Integer.parseInt(tempVar2);
			}
		  }
		  for (i = 0;i < n;i++)
		  {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q + i = Integer.parseInt(tempVar3);
			}
		  }
		  if (n != 0)
		  {
		  System.out.printf("%d\n",run(t, q, n));
		  }
	   }
	}

}

