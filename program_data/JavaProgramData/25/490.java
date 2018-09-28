package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int i;
	  int ans = 1;
	  int j;
	  int k = 1;
	  int[] a = new int[100];
	  if (n == 0)
	  {
		System.out.print(1);
		System.out.print("\n");
	  }
	  else
	  {
		 a[0] = 1;
		 int t = 0;
		 while (t < n)
		 {
		   t++;
		   for (i = 0;i < 100;i++)
		   {
			 a[i] = a[i] * 2;

		   }
		   for (i = 0;i < 100;i++)
		   {
			 if (a[i] >= 10)
			 {


			   a[i + 1] = a[i + 1] + (a[i] / 10);
			   a[i] = a[i] % 10;

			 }
		   }
		 }

		  j = 99;
		  while (a[j] == 0)
		  {
			j--;
		  }
		 for (;j >= 0;j--)
		 {
		   System.out.print(a[j]);
		 }
		 System.out.print("\n");
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}

}

