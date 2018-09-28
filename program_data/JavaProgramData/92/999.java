package <missing>;

public class GlobalMembers
{
	public static int bijiao(Object x, Object y)
	{
	return *((int)y) - (int)x; //???
	}

	public static int Main()
	{
	  int n;
	  while (scanf("%d", n) && (n != 0)) //?????
	  {
	   int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *tj;
	   int tj;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *qw;
	   int qw;
	   int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   tj = (int)malloc(4 * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   qw = (int)malloc(4 * n);
	   for (i = 0;i < n;i++)
	   {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   tj + i = Integer.parseInt(tempVar);
	   }
	   }
	   for (i = 0;i < n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   qw + i = Integer.parseInt(tempVar2);
	   }
	   }
	   qsort(tj,n,4,bijiao);
	   qsort(qw,n,4,bijiao);

	   int tmax = 0;
	   int qmax = 0;
	   int tmin = n - 1;
	   int qmin = n - 1;
	   for (i = 0;i < n;i++)
	   {
		  if (*(tj + tmax) > *(qw + qmax))
		  {
			  sum += 200;
			  tmax++;
			  qmax++;
		  }
		  else if (*(tj + tmax) < *(qw + qmax))
		  {
			  sum -= 200;
			  tmin--;
			  qmax++;
		  }
		  else
		  {
			if (*(tj + tmin) > *(qw + qmin))
			{
				sum += 200;
				tmin--;
				qmin--;
			}
			else if (*(tj + tmin) < *(qw + qmin))
			{
				sum -= 200;
				tmin--;
				qmax++;
			}
			else
			{
				   if (*(tj + tmax) == *(qw + qmin))
				   {
				   break;
				   }
				   else
				   {
					   sum -= 200;
					   tmin--;
					   qmax++;
				   }
			}
		  }

	   }
	   System.out.printf("%d\n",sum);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	   free(tj);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	   free(qw);
	  }

	return 0;
	}

}

