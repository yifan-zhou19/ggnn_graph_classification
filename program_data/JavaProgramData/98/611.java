package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
		  char[][] a = new char[10000][40];
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = tempVar2.charAt(0);
			  }
		  }
		  int t;
		  int s = 0;
		  for (i = 0;i < n;i++)
		  {
			 if (i == 0)
			 {
			   t = String.valueOf(a[i]).length();
			   System.out.printf("%s",a[i]); //????????? ?s?????????????
			   s = s + t;
			 }
			 else
			 {
			   t = String.valueOf(a[i]).length();
			   s = s + t + 1;
			   if (s <= 80)
			   {
				   System.out.printf(" %s",a[i]); //??????????????80??????????
			   }
			   else
			   {
				   System.out.print("\n");
				   System.out.printf("%s",a[i]); //?????80?????????s ??????????????
				   s = t;
			   }
			 }
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

