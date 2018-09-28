package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int i;
	   int j;
	   int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct num
	//   {
	////C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	////ORIGINAL LINE: unsigned int a;
	//   uint a;
	//   double b;
	//   }
	//   num[301];
	   double aver;
	   double sum = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   System.out.print("\n");
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   num[i].a = tempVar2;
		   }
		   sum = sum + num[i].a;
	   }
	   System.out.print("\n");
	   aver = sum / n;

	   for (i = 0;i < n;i++)
	   {
		   num[i].b = Math.abs(num[i].a - aver);
	   }
	   for (j = 0;j < n - 1;j++)
	   {
		   for (i = 0;i < n - 1 - j;i++)
		   {
		   if (num[i].b < num[i + 1].b)
		   {
			   num[300] = num[i];
			   num[i] = num[i + 1];
			   num[i + 1] = num[300];
		   }
		   }
	   }
	   for (i = 1;i < n;i++)
	   {
			  if (Math.abs(num[i].b - num[0].b) < 0.000001)
			  {
		  k++;
			  }
	   }
	   for (j = 0;j < k;j++)
	   {
		   for (i = 0;i < k - j;i++)
		   {
		   if (num[i].a > num[i + 1].a)
		   {
			   num[300] = num[i];
			   num[i] = num[i + 1];
			   num[i + 1] = num[300];
		   }
		   }
	   }
	   if (k == 0)
	   {
		   System.out.printf("%d",num[0].a);
	   }
	   else
	   {
		   System.out.printf("%d",num[0].a);
	   for (i = 1;i < k + 1;i++)
	   {
		   System.out.printf(",%d",num[i].a);
	   }
	   }
	}









}

