package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n;i++)
	 {
		 int h;
		 int j;
		 int[] a = new int[100];
	  h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  if (h == 0)
	  {
		  System.out.print("60");
		  System.out.print("\n");
	   continue;
	  }
	  for (j = 0;j < h;j++)
	  {
		 a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  int flag = 0;
	  for (j = 0;j < h;j++)
	  {
		  if (a[j] + 3 * j + 3 >= 60)
		  {
		  flag = 1;
	   if (a[j] + 3 * j + 3 > 63)
	   {
		   System.out.print(60 - 3 * j);
		   System.out.print("\n");
	   }
	   else
	   {
		   System.out.print(a[j]);
		   System.out.print("\n");
	   }
	   break;
		  }
	  }
	  if (flag == 0)
	  {
		  System.out.print(60 - 3 * h);
		  System.out.print("\n");
	  }
	 }
	 return 0;
	}
}

