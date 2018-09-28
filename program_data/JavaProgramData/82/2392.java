package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] c = new int[100];
	   int n;
	   int i;
	   int j = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		   c[i] = 0;
	   }
	   int a;
	   int b;
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b = Integer.parseInt(tempVar3);
		   }
		   if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		   {
			   c[j]++;
		   }
		   else
		   {
			   j++;
		   }
	   }
	   int m;
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < n - 1;j++)
		   {
			   if (c[j] < c[j + 1])
			   {
				   m = c[j];
				   c[j] = c[j + 1];
				   c[j + 1] = m;
			   }
		   }
	   }
	   System.out.printf("%d",c[0]);
		System.in.read();
		System.in.read();
			return 0;
	}
}

