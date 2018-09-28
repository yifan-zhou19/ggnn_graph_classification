package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[300];
	   int[] b = new int[300];
	   int n;
	   int i;
	   int num = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	   int p;
	   int j;
	   int m;
	   int l;
	   for (i = 0;;i++)
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i] = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   b[i] = Integer.parseInt(tempVar2);
		   }
		   num = num + 1;
		   if (a[i] == 0 && b[i] == 0)
		   {
			   break;
		   }
	   }
	   num = num - 1;
	   for (i = 0;i <= num - 1;i++)
	   {
		   int[] c = new int[300];
		   p = c;
		   for (j = 0;j < a[i];j++)
		   {
			   *(p + j) = j + 1;
		   }
		   j = 0;
		   m = 0;
		   l = 0;
		   while (l < a[i] - 1)
		   {
			   if (*(p + j) != 0)
			   {
				   m++;
			   }
			   if (m == b[i])
			   {
				   *(p + j) = 0;
				   m = 0;
				   l++;
			   }
			   j++;
			   if (j == a[i])
			   {
				   j = 0;
			   }
		   }
		   while (p == 0)
		   {
			   p++;
		   }
		   System.out.printf("%d\n", p);
	   }
	   return 0;
	}
}

