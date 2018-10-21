package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i = 0;
	   int j = 0;
	   int k = 0;
	   int l;
	   int[] a = new int[500];
	   String ch = new String(new char[3000]);
	   ch = new Scanner(System.in).nextLine();
	   while (ch.charAt(i) != 0)
	   {
		   while (ch.charAt(i) <= '9' && ch.charAt(i) >= '0')
		   {
			   a[j] = a[j] * 10 + ch.charAt(i++) - '0';
			   k++;
		   }
		   i++;
		   if (k != 0)
		   {
			   k = 0;
			   j++;
		   }

	   }
	  /* for(i=0;i<j;i++)
	   {
	       printf("%d ",a[i]);
	   }*/
	  if (j == 1)
	  {
		   System.out.print("No");
	  }
	   else
	   {
		   int max = a[0];
		   int second = -1;
		   for (i = 0;i < j;i++)
		   {
			   if (a[i] > max)
			   {
				   second = max;
				   max = a[i];
			   }
			   else if (a[i] > second && a[i] < max)
			   {
				   second = a[i];
			   }
		   }
		   if (second == -1)
		   {
			System.out.print("No");
		   }
		   else
		   {
			   System.out.printf("%d",second);
		   }

	   }
		return 0;
	}

}
