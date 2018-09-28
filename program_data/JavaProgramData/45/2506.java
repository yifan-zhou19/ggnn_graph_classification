package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[55]);
	  String w = new String(new char[55]);
	  int i;
	  int j;
	  int e = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  w = tempVar2.charAt(0);
	  }
	  for (i = 0;i <= w.length() - 1;i++)
	  {
		 for (j = 0;j <= s.length() - 1;j++)
		 {
			if (s.charAt(j) == w.charAt(i + j))
			{
			   e++;
			}
			 else
			 {
			  e = 0;
			  break;
			 }
		 }
		  if (e == s.length())
		  {
			  System.out.printf("%d",i);
			  break;
		  }

	  }
	   int y;
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   y = Integer.parseInt(tempVar3);
	   }
	   return 0;


	}

}

