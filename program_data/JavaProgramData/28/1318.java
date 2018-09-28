package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   int a;
	   int b;
	   int k;
	   int[] n = new int[300];
	   String str = new String(new char[10000]);
	   str = new Scanner(System.in).nextLine();
	   a = str.length();
	   n[0] = 0;
	   b = 1;
	   k = 0;
	   for (i = 1;i < a;)
	   {
		  if (str.charAt(i) == ' ')
		  {
			  if (b == 1)
			  {
				  n[b] = i - k;
			  }
			  else
			  {
				  n[b] = i - k - 1;
			  }
			   if (n[b] != 0)
			   {
				   System.out.printf("%d,",n[b]);
			   }
			  k = i;
			  b += 1;
		  }
		   i++;
	   }
	   if (b == 1)
	   {
		   n[b] = a - k;
	   }
	   else
	   {
		   n[b] = a - k - 1;
	   }
	   System.out.printf("%d\n",n[b]);
	}

}
