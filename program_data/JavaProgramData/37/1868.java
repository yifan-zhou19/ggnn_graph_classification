package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int j;
		  int y;
		  int len;
		  int k;
		  char w;
		  String s = new String(new char[100000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  s = tempVar2.charAt(0);
			  }
		   len = s.length();
			 for (j = 0;j < len;j++)
			 {
				   for (k = 0;k < len;k++)
				   {
					  if (k != j && s.charAt(j) == s.charAt(k))
					  {
					break;
					  }
				   }
				 if (k == len)
				 {
					System.out.printf("%c",s.charAt(j));
				 System.out.print("\n");
				 break;
				 }
			 }
				 if (j == len)
				 {
					  System.out.print("no");
				  System.out.print("\n");
				 }
		  }


	}


}

