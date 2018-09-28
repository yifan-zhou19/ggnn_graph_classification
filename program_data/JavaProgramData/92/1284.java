package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] num1 = new int[1001];
	public static int[] num2 = new int[1001];

	public static int cmp(Object a, Object b)
	{
	return *(int)b - (int)a;
	}

	public static int Main()
	{
	while (true)
	{
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (n == 0)
	   {
		break;
	   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(num1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(num2,0,(Integer.SIZE / Byte.SIZE));
	   for (int i = 0 ; i < n; i++)
	   {
		num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (int i = 0 ; i < n; i++)
	   {
		num2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   qsort(num1,n,(Integer.SIZE / Byte.SIZE),cmp);
	   qsort(num2,n,(Integer.SIZE / Byte.SIZE),cmp);
	   int res = 0;
	   int m;
	   int head = 0;
	   int ttail = n - 1;
	   int ktail = n - 1;
	   for (int i = 0; i < n; i++)
	   {
		if (num1[head] > num2[i])
		{
		 res++;
		 head++;
		}
		else if (num1[head] < num2[i])
		{
		 ttail--;
		 res--;
		}
		else //??????????????????????
		{
		 for (int j = ttail,m = ktail ; j >= head;j--,m--)
		 {
		  if (num1[j] > num2[m])
		  {
		   res++;
		   ttail--;
		   ktail--;
		  }
		  else
		  {
		   if (num1[j] < num2[i])
		   {
			res--;
		   }
		   ttail = --j;
		   ktail = m;
		   break;
		  }
		 }
		}
		if (head > ttail)
		{
		  break;
		}
	   }
	   System.out.print(res * 200);
	   System.out.print("\n");
	}

	return 0;
	}

}

