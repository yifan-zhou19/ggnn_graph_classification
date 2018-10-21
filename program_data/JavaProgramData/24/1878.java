package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[1500]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * ps;
	  String l = new String(new char[1500]);
	  int[] a = new int[200];
	  int i = 0;
	  int n;
	  int m;
	  int c = 0;
	  int d = 0;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s = tempVar.charAt(0);
	  }
	  l = s;
	  s = new Scanner(System.in).nextLine();
	  l += s;
	  for (ps = l; * ps != 0;ps++)
	  {
		if (*ps != ' ' && *ps != ',')
		{
			a[i]++;
		}
		 else if (*ps == ' ' || *ps == ',')
		 {
			i++;
		 }
	  }
	  k = i;
	 n = a[0];
	 m = a[0];
	 for (i = 0;i < k + 1;i++)
	 {
		 if (a[i] != 0)
		 {
	   if (a[i] < n)
	   {
		   n = a[i];
		   c = i;
	   }
	   if (a[i] > m)
	   {
		   m = a[i];
		   d = i;
	   }
		 }
	 }
	 i = 0;
	 for (ps = l; * ps != 0;ps++)
	 {
	  if (*ps == ' ' || *ps == ',')
	  {
		  i++;
	  }
	  if (i == d)
	  {
		  i = 1000;
		  if (*ps == ' ' || *ps == ',')
		  {
			  ps++;
		  }
	  }
	  if (i == 1000)
	  {
		  System.out.printf("%c",*ps);
	  }
	 }
	 System.out.print("\n");
	 i = 0;
	 for (ps = l; * ps != 0;ps++)
	 {
	  if (*ps == ' ' || *ps == ',')
	  {
		  i++;
	  }
	  if (i == c)
	  {
		  i = 1000;
		  if (*ps == ' ' || *ps == ',')
		  {
			  ps++;
		  }
	  }
	   if (i == 1000)
	   {
		   System.out.printf("%c",*ps);
	   }
	 }
	 return 0;
	}



}

