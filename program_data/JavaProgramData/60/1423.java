package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {


		 int i;
		 int j;
		 int t;
		 int n;
		 int m;
		 int[] k = new int[100000];

		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 m = 0;
		   for (i = 1;i <= n;i++)
		   {
			   k[i] = 1;
		   }


		 for (i = 1;i <= n;i++)
		 {
			 t = 0;
			  for (j = 2;j < i;j++)
			  {

				  if ((i % j) != 0)
				  {
					  t = t + 1;
				  }
			  }
			 if (t == (i - 2))
			 {
				 k[i] = 0;
			 }

			   if ((k[i] == 0) && (k[i - 2] == 0) && (i - 2) > 1)
			   {
				   System.out.printf("%d %d\n",(i - 2),i);
			   m = m + 1;
			   }
		 }


		 if (m == 0)
		 {
			 System.out.print("empty");
		 }


















	 }

}

