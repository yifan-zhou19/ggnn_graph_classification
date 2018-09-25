package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int m;
	   int n;
	   int i;
	   char[][] a = new char[5][10];
	   (char)(*p)[10];
	   p = a;
	   for (i = 0;i < 5;i++)
	   {
		   a[i] = new Scanner(System.in).nextLine();
	   }
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   if (m < 0 || m>4 || n < 0 || n>4)
	   {
		   System.out.print("error");
	   }
	   else
	   {
		   for (i = 0;i < 5;i++)
		   {
			  if (i == m)
			  {
				  System.out.println(*(p + n));
			  }
			  else if (i == n)
			  {
				  System.out.println(*(p + m));
			  }
			  else
			  {
				  System.out.println(*(p + i));
			  }
		   }
	   }
	}
}

