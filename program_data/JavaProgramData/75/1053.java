package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] count = new int[1001];
	 int i;
	 int j = 1;
	 int n;
	 int max;
	 char c;
	 for (i = 1;i <= 1000;i++)
	 {
		 a[j++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   cin.get(c);
	   if (c == ',')
	   {
		   ;
	   }
	   else
	   {
		   break;
	   }
	 }
	 n = j - 1;
	 j = 1;
	 for (i = 1;i <= 1000;i++)
	 {
		 b[j++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   cin.get(c);
	   if (c == ',')
	   {
		   ;
	   }
	   else
	   {
		   break;
	   }

	 }
	 for (i = 1;i <= n;i++)
	 {
		 for (j = a[i];j < b[i];j++)
		 {
		count[j]++;
		 }
	 }
	 max = count[1];
	 for (i = 1;i <= 1000;i++)
	 {
		 if (count[i] > max)
		 {
			 max = count[i];
		 }
	 }


	  System.out.print(n);
	  System.out.print(' ');
	  System.out.print(max);
	  System.out.print("\n");






	  return 0;

	}


}

