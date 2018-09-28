package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int i;
		int s = 0;
		int flg = 0;
		  char[][] p = new char[1000][50];
		  String l = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 p[i] = tempVar2.charAt(0);
				 }
			 l = tangible.StringFunctions.changeCharacter(l, i, String.valueOf(p[i]).length());
		  }
		  for (i = 0;i < n;i++)
		  {
				  if (flg != 0) //shouwei 0
				  {
				  if ((s + l.charAt(i) + 1) <= 80)
				  {
						 System.out.printf(" %s",p[i]);
					 s = s + l.charAt(i) + 1;
				  }
				  else
				  {
				   System.out.print("\n");
				   System.out.printf("%s",p[i]);
				   s = l.charAt(i);
				  }
				  }
			  else
			  {
						 System.out.printf("%s",p[i]);
					 flg = 1;
					 s = s + l.charAt(i);
			  }


		  }


	}
}

