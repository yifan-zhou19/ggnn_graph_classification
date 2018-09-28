package <missing>;

public class GlobalMembers
{
	public static int N(int i, int a, int b)
	{
	 int z = 0;
	 int j;
	 if (i > a && a != 0)
	 {
		 z = 0;
	 }
	 else
	 {
		 if (a == 0)
		 {
		  z = 1;
		 }
		 else
		 {
			 if (b == 1)
			 {
			   z = 1;
			 }
			 else
			 {
				 if (a <= b)
				 {
					 for (j = i;j <= a;j++)
					 {
					  z = z + N(j, a - j, b - 1);
					 }
				 }
				 else
				 {
					 if (i != 1)
					 {
					 z = N(i - 1, a - b, b) + N(i, a, b - 1);
					 }
				 else
				 {
					 z = N(1, a - b, b) + N(1, a, b - 1);
				 }
				 }

			 }
		 }
	 }
	 return z;
	}
	public static int Main()
	{
	 int[] n = new int[20];
	 int[] m = new int[20];
	 int c;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 c = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= c;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  n[i] = Integer.parseInt(tempVar3);
	  }
	 }
	 for (i = 1;i <= c;i++)
	 {
	  System.out.printf("%d\n",N(1, m[i], n[i]));
	 }
	return 0;
	}
}

