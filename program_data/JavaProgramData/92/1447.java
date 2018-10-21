package <missing>;

public class GlobalMembers
{
	//??????
	public static void f(int[] p, int n)
	{
	 int i;
	 int j;
	 int t;
	 for (i = 0;i < n;i++)
	 {
			for (j = (i + 1);j < n;j++)
			{
				 if (p[j] < p[i])
				 {
					 t = p[i];
					 p[i] = p[j];
					 p[j] = t;
				 }
			}
	 }
	}

	public static int Main()
	{

		   for (;;)
		   {

			int n;
			int i;
			int j;
			int m;
			int win;
			int pmax;
			int qmax;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}

			int[] q = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int* p=(int*)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			int p = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					q[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i] = tempVar3;
				}
			}
			f(p, n);
			f(q, n);

			i = 0;
			j = 0;
			win = 0;
			pmax = n - 1;
			qmax = n - 1;
			m = n;
			 for (;m >= 1;m--)
			 {
				  if (q[i] > p[j])
				  {
					   win++;
					   i++;
					   j++;
				  }
				  else if (q[i] == p[j])
				  {
					   if (q[qmax] > p[pmax])
					   {
						   win++;
						   qmax--;
						   pmax--;
					   }
					  else
					  {
						   if (q[i] < p[pmax])
						   {
							   win--;
						   }
						   pmax--;
						   i++;
					  }


				  }
				  else if (q[i] < p[j])
				  {
					  win--;
					  i++;
					  pmax--;
				  }
			 }
		  System.out.printf("%d\n",win * 200);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(q);
		   }
	}

}

