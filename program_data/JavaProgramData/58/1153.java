package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int j;
	  int k;
	  int n;
	  int m;
	  int x = 0;
	  final String a = "";
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (j = 0;j < n;j++)
	  {
		  final String a = "";
	  a = new Scanner(System.in).nextLine();
	  x = 0;
	  if (a.charAt(0) == '_' || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
	  {
	  x = 1;
	  }
	  else
	  {
		  x = 0;
	  }
		 for (k = 1;k < 80;k++)
		 {
			   if (a.charAt(k) == '_' || (a.charAt(k) >= 'a' && a.charAt(k) <= 'z') || (a.charAt(k) >= 'A' && a.charAt(k) <= 'Z') || (a.charAt(k) >= '0' && a.charAt(k) <= '9'))
			   {
			 x = x;
			   }
			 else
			 {
				 if (a.charAt(k) != '\0')
				 {
			   x = 0;
				 }
			   else
			   {
					 for (m = k;m < 80;m++)
					 {
						   if (a.charAt(k) != '\0')
						   {
								x = 0;
							  break;
						   }
					 }
					   if (m = 80)
					   {
						   x = x;
					   }
			   }
			 }
		 }
	  System.out.printf("%d\n",x);
	  }
	}

}

