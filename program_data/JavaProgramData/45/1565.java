package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String w = new String(new char[100]);
		int j;
		int sl;
		int wl;
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
		  sl = s.length();
		  wl = w.length();
		   for (j = 0;j < wl;j++)
		   {
				   if (w.charAt(j) == s.charAt(0))
				   {
					   System.out.printf("%d",j);
					   break;
				   }
		   }
				   return 0;

	}

}

