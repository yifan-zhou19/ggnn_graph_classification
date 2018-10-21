package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //i,j,k?????
		int num;
		int[] a = new int[500];
		int i;
		int j = 0;
		int k;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n;i++)
	 {
	  num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  if (num % 2 == 1)
	  {
			a[j] = num;
		 j++;
	  } //????????????? ?j???????
	 }
	 for (i = 0;i < j - 1;i++)
	 {
	  for (k = 0;k < j - 1 - i;k++)
	  {
	   if (a[k] > a[k + 1])
	   {
		   num = a[k + 1];
		a[k + 1] = a[k];
		a[k] = num;
	   } //?????
	  }
	 }
	 for (i = 0;i < j - 1;i++)
	 {
	  System.out.print(a[i]);
	  System.out.print(",");
	 }
	 System.out.print(a[j - 1]);
	 return 0;
	}

}

