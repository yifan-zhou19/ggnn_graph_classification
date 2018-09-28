package <missing>;

public class GlobalMembers
{
	public static int A;
	public static int B;
	public static int[] a = new int[250];
	public static int[] b = new int[250];
	public static int[] c = new int[501];
	public static void input()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = Integer.parseInt(tempVar);
		}
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 B = Integer.parseInt(tempVar2);
	 }
	 for (int i = 0;i < A;i++)
	 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i] = Integer.parseInt(tempVar3);
			 }
	 }
	 for (int j = 0;j < B;j++)
	 {
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 b[j] = Integer.parseInt(tempVar4);
			 }
	 }


	}
	 public static void paixu()
	 {
		  for (int j = A - 1;j > 0;j--)
		  {
		  for (int r = 0;r < j;r++)
		  {
				if (a[r] > a[r + 1])
				{
				int tmp;
			 tmp = a[r + 1];
			 a[r + 1] = a[r];
			 a[r] = tmp;
				}
		  }

		  }
			 for (int j = B - 1;j > 0;j--)
			 {
		  for (int r = 0;r < j;r++)
		  {
				if (b[r] > b[r + 1])
				{
				int tmp;
			 tmp = b[r + 1];
			 b[r + 1] = b[r];
			 b[r] = tmp;
				}
		  }

			 }
	 }

	 public static void hebing()
	 {
		  for (int i = 0;i < A;i++)
		  {
			  c[i] = a[i];
		  }
		  for (int i = A;i < A + B;i++)
		  {
			  c[i] = b[i - A];
		  }
	 }

	public static void show()
	{
		 for (int j = 0;j < A + B;j++)
		 {
			 System.out.printf("%d",c[j]);
		  if (j < A + B - 1)
		  {
			  System.out.print(" ");
		  }
		 }
	}


	public static int Main()
	{
		input();

	  paixu();

	  hebing();

	  show();


	}

}

