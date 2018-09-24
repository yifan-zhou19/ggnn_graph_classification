package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[100]);
	  String w = new String(new char[100]);
	  int i;
	  int k = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  w = tempVar2.charAt(0);
	  }
	  for (i = 0;w.charAt(i);i++)
	  {
		if (w.charAt(i) == s.charAt(k))
		{
		  k++;
		  if (k == s.length() - 1)
		  {
			break;
		  }
		}
		else
		{
		  k = 0;
		}
	  }
	  System.out.printf("%d\n",i - s.length() + 2);
	}

}

