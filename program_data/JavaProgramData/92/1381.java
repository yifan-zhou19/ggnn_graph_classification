package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] a, int n)
	{
		 int i;
		 int j;
		 int b;
		 for (i = 0;i < n - 1;i++)
		 {
			  for (j = 0;j < n - i - 1;j++)
			  {
				  if (a[j] > a[j + 1])
				  {
					  b = a[j];
					  a[j] = a[j + 1];
					  a[j + 1] = b;
				  }
			  }
		 }
	}
	public static int Main()
	{

		for (;;)
		{
		 int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			break;
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *tian=(int *)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  int tian = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *qi=(int *)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  int qi = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		  for (int i = 0;i < n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  tian + i = Integer.parseInt(tempVar2);
				  }
		  }
		  for (int i = 0;i < n;i++)
		  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  qi + i = Integer.parseInt(tempVar3);
				  }
		  }
		  paixu(tian, n);
		  paixu(qi, n);


		  int t = 0;
		  int q = 0;
		  int qmax = n - 1;
		  int tmax = n - 1;
		  int win = 0;
		  for (;n >= 1;n--)
		  {
				  if (*(tian + t) > *(qi + q))
				  {
					   win++;
					   t++;
					   q++;
				  }
				  else if (*(tian + t) == *(qi + q))
				  {
					   if (*(tian + tmax) > *(qi + qmax))
					   {
						   win++;
						   tmax--;
						   qmax--;
					   }
					   else if (*(tian + tmax) <= *(qi + qmax))
					   {
						   if (*(tian + t) < *(qi + qmax))
						   {
							   win--;
						   }
						   qmax--;
						   t++;
					   }


				  }
				  else if (*(tian + t) < *(qi + q))
				  {
					  win--;
					  t++;
					  qmax--;
				  }
		  }
		  System.out.printf("%d\n",win * 200);
		}

	}

}

