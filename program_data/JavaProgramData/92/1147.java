package <missing>;

public class GlobalMembers
{
	public static int compare(Object a1, Object a2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int)a1;
		p2 = (int)a2;
		return (p2) - p1;
	}
	public static int Main()
	{
		  int k;
		  for (k = 1; ;k++)
		  {
				int n;
				int j;
				int i;
				int c = 0;
				int p = 200;
				int money;
				int m;
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					n = Integer.parseInt(tempVar);
				}
				if (n == 0)
				{
					break;
				}
				int[] t = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q=(int*)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				int q = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
				for (j = 0;j < n;j++)
				{
					  String tempVar2 = ConsoleInput.scanfRead();
					  if (tempVar2 != null)
					  {
						  t[j] = Integer.parseInt(tempVar2);
					  }
				}
				 for (j = 0;j < n;j++)

				 {
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  q[j] = tempVar3;
						  }
				 }

				 qsort(t,n,(Integer.SIZE / Byte.SIZE),compare);
				 qsort(q,n,(Integer.SIZE / Byte.SIZE),compare);
				 for (i = 0;i < n;i++)
				 {
						  if (t[i] > q[i]) //????
						  {
						  c++;
						  }
						  else
						  {
							  if (t[n - 1] > q[n - 1]) //??????????????????
							  {
								   c++;
								   for (j = n - 2;j >= i;j--)
								   {
										t[j + 1] = t[j];
									q[j + 1] = q[j];
								   }
							  }
							  else
							  {
								  if (t[n - 1] < q[i])
								  {
												 c--;
												 for (j = n - 2;j >= i;j--)
												 {
												 t[j + 1] = t[j];
												 }
								  }
							  }
						  }

						   money = c * p;

				 }
						   System.out.printf("%d\n",money);


		  }

						  return (0);

						   System.in.read();
						   System.in.read();
						   System.in.read();
						   System.in.read();
						   System.in.read();
						   System.in.read();
						   System.in.read();


	}




}

