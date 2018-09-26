package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  char[][] a = new char[5][80];
	  (char)(*p1)[];
	  (char)(*p2)[];
	  int i;
	  int m;
	  int n;
	  for (i = 0;i < 5;i++)
	  {
	   a[i] = new Scanner(System.in).nextLine();
	  }
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  if (m < 0 || m>4 || n < 0 || n>4)
	  {
	  System.out.print("error");
	  }
	  else
	  {
		   p1 = a[m];
		   p2 = a[n];
		   for (i = 0;i < 5;i++)
		   {
			  if (i == m)
			  {
			   System.out.println(*p2);
			  }
			  else if (i == n)
			  {
			   System.out.println(*p1);
			  }
			  else
			  {
			   System.out.println(a[i]);
			  }
		   }
	  }

	}

}

