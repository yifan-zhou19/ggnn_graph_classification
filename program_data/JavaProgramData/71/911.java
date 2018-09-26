package <missing>;

public class GlobalMembers
{
	//**********************************
	//????????
	//???2013.10.17
	//**********************************
	public static int Main()
	{
		 int[] a = new int[200];
		 int[] b = new int[200];
		 int[] c = new int[200];
		 int n = 0;
		 int i = 0;
		 int j = 0;
		 int k = 0;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i < n;i++)
		 {
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 k = 0;
			 j = 0;
			 if (c[i] < b[i])

			 {
					j = c[i];
				 c[i] = b[i];
				 b[i] = j;
			 }
			 for (;b[i] < c[i];b[i]++)
			 {
				 if (b[i] == 1 || b[i] == 3 || b[i] == 5 || b[i] == 7 || b[i] == 8 || b[i] == 10 || b[i] == 12)
				 {
					 k = k + 31;
				 }
				 else if (b[i] == 2)
				 {
					 if (a[i] % 100 == 0 && a[i] % 400 == 0)
					 {
					   k = k + 29;
					 }
					 else if (a[i] % (100) != 0 && a[i] % 4 == 0)
					 {
						k = k + 29;
					 }
					 else
					 {
					   k = k + 28;
					 }
				 }
				 else
				 {
					 k = k + 30;
				 }
			 }
		   if (k % 7 == 0)
		   {
			   System.out.print("YES");
			   System.out.print("\n");
		   }
		   else
		   {
			   System.out.print("NO");
			   System.out.print("\n");
		   }
		 }
	   return 0;
	}
}

