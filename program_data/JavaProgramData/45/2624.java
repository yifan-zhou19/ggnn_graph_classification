package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  int g;
	  int r;
	  int n;
	  int i;
	  int j;
	  int x = 0;
	  String s = new String(new char[50]);
	  String w = new String(new char[50]);
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
	  k = s.length();
	  g = w.length();
	  for (i = 0;i < g;i++)
	  {
		if (w.charAt(i) == s.charAt(x))
		{
				r = i;
	break;

		}
	  }
	   System.out.printf("%d",r);
	  return 0;
	}

}

