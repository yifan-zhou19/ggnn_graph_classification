package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int a;
	int b;
	int c;
	int d;
	//int A[100]={0};
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   a = 2;
	   b = 0;
	   d = 0;
	   c = 0;
	   for (i = 3;i <= n;i++)
	   {
		   for (j = 2;j < i;j++)
		   {
			   if (i % j == 0)
			   {
				   c = 1;
				   break;
			   }
			   else
			   {
				c = 0;
			   b = j + 1;

			   }
		   }
		   if (c == 0 && b - a == 2)
		   {
			   System.out.printf("%d %d\n",a,b);
			   a = b;
			   b = 0;
			   d += 1;
		   }
		   else
		   {
			   if (c == 0)
			   {
				   a = b;
			   }

		   }

	   }
	   if (d == 0)
	   {
		   System.out.print("empty");
	   }
	}
}

