package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		  int[] a = new int[1000000];
		  int i;
		  int n;
		  int del;
		  int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	int p;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		  }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   del = Integer.parseInt(tempVar3);
		   }
		  p = a;
		   for (i = 0;i < n;i++)
		   {
							   if (a[i] == del)
							   {
								 for (j = i;j < n;j++)
								 {
								 a[j] = a[j + 1];
								 }
								 i--;
								 n--;
							   }
		   }
		  for (i = 0;i < n - 1;i++,p++)
		  {
		  System.out.printf("%d ", p);
		  }
		  System.out.printf("%d", p);
	}

}

