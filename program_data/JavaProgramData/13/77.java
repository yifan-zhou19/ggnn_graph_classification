package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //????????n?????i,k???a??????
		int j;
		int n;
		int[] a = new int[20000];
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	   for (i = 0;i < n;i++)
	   {
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   } //????
	   if (n > 1)
	   {
	   for (i = 1;i < n;i++)
	   {
	  for (j = 0;j < i;j++)
	  {
	  if (a[i] == a[j])
	  {
		  a[i] = 0; //?????????????????????0
	  }
	  }
	   }
	  System.out.print(a[0]);
	  for (i = 1;i < n;i++)
	  {
		  if (a[i] != 0)
		  {
			  System.out.print(" ");
			  System.out.print(a[i]);
		  }
	  } //????0????????
	   }
	   if (n == 1)
	   {
		   System.out.print(a[0]);
	   }
	 return 0;
	}
}

