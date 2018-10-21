package <missing>;

public class GlobalMembers
{
	//**********************************
	//????????????
	//???2013.10.19
	//**********************************
	public static int Main()
	{
		 int n = 0;
		 int i = 0;
		 int j = 0;
		 int[] a = new int[100];
		 int[] b = new int[20];
		 int sum = 0;
		 int q = 0;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i < n;i++)
		 {
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 if (a[i] > 0)
			 {
				   for (j = 1;j <= a[i];j++)
				   {
						b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					  if (b[j] + j * 3 <= 60)
					  {
						  sum = 60 - 3 * j;
					  }
					  if (b[j] + j * 3 <= 63 && b[j] + j * 3>60)
					  {
						  sum = b[j];
					  }
				   }
			 }
			 if (a[i] == 0)
			 {
				 sum = 60;
			 }
			 System.out.print(sum);
			 System.out.print("\n");
		 }
	   return 0;
	}
}

