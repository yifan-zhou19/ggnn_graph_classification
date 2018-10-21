package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String a = new String(new char[301]);
	   int[] b = new int[130];
	   int c = 0;
	   int i;
	   a = new Scanner(System.in).nextLine();
	   for (i = 65;i <= 122;i++)
	   {
		   b[i] = 0;
	   }
	   for (i = 0;a.charAt(i) != 0;i++)
	   {
		 if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
		 {
			 b[a.charAt(i)] = b[a.charAt(i)] + 1;
		 }
		 if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
		 {
			 b[a.charAt(i)] = b[a.charAt(i)] + 1;
		 }
	   }
	   for (i = 65;i <= 122;i++)
	   {
		 c = c + b[i];
	   }
	   if (c == 0)
	   {
		   System.out.print("No");
	   }
	   if (c != 0)
	   {
		   for (i = 65;i <= 122;i++)
		   {
			  if (b[i] != 0)
			  {
			  System.out.printf("%c=%d\n",i,b[i]);
			  }
		   }


	   }
	}

}
