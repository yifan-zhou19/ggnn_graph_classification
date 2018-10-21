package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 b[i] = Integer.parseInt(tempVar3);
						 }
		}
		 for (i = 0;i < n;i++)
		 {
						  if (a[i] < b[i])
						  {
										if (a[i] == 0 && b[i] == 2)
										{
													   d = d + 1;
										}
										else
										{
											 c = c + 1;
										}
						  }
						  else if (a[i] > b[i])
						  {
							   if (b[i] == 0 && a[i] == 2)
							   {
													   c = c + 1;
							   }
										else
										{
											 d = d + 1;
										}
						  }
		 }

		 if (c > d)
		 {
			 System.out.print("A");
		 }
		 else if (d > c)
		 {
			 System.out.print("B");
		 }
		 else
		 {
			 System.out.print("Tie");
		 }




		return 0;
	}
}

