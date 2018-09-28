package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int s;
		int M;
		int k1;
		int l1;
		int l2;
		for (i = 0;;i++)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   if (n == 0)
		   {
			   break;
		   }
		   else
		   {
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * t=(int*)malloc((n+1)*sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 int t = (int)malloc((n + 1) * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * q=(int*)malloc((n+1)*sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 int q = (int)malloc((n + 1) * (Integer.SIZE / Byte.SIZE));
			 for (j = 0;j < n;j++)
			 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 t + j = Integer.parseInt(tempVar2);
				 }
			 }
			 for (j = 0;j < n;j++)
			 {
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 q + j = Integer.parseInt(tempVar3);
				 }
			 }
			for (j = 0;j < n - 1;j++)
			{
				 for (m = j + 1;m < n;m++)
				 {
					if (*(t + j) < *(t + m))
					{
						s = (t + j);
						*(t + j) = *(t + m);
						*(t + m) = s;
					}
				 }
			}
			 for (j = 0;j < n - 1;j++)
			 {
				 for (m = j + 1;m < n;m++)
				 {
					if (*(q + j) < *(q + m))
					{
						s = (q + j);
						*(q + j) = *(q + m);
						*(q + m) = s;
					}
				 }
			 }
					 k1 = 0;
					 M = 0;
					 l2 = n - 1;
					 l1 = n - 1;
				 for (j = 0;j < n;j++)
				 {
					   if (q[j] < 0)
					   {
						 break;
					   }
						 else
						 {
						if (q[j] < t[k1])
						{
							M = M + 200;
							k1 += 1;
							q[j] = -9;
						}
						if (q[j] == t[k1])
						{
							  for (m = 0;;m++)
							  {
								  if (q[l2] < 0)
								  {
								  break;
								  }
								 if (q[l2] >= t[l1])
								 {
									 if (t[l1] < q[j])
									 {
										 M = M - 200;
										 l1 = l1 - 1;
										 q[j] = -9;
										 break;
									 }
									 else
									 {
										 l1 = l1 - 1;
										 q[j] = -9;
										 break;
									 }
								 }
								 if (q[l2] < t[l1])
								 {
									 M = M + 200;
									 q[l2] = -9;
									 l1 = l1 - 1;
									 l2 = l2 - 1;
								 }
							  }
						}
						if (q[j] > t[k1])
						{
							M = M - 200;
							l1 = l1 - 1;
							q[j] = -9;
						}
						 }
				 }
				  System.out.printf("%d\n",M);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				  free(t);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				 free(q);
		   }
		}
			  return 0;
	}



}

