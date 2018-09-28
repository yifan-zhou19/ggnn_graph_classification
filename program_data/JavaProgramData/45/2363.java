package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[51]);
	  String w = new String(new char[51]);
	  int i;
	  int j;
	  int jd;
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
	  for (i = 0;i <= (w.length() - s.length());i++)
	  {
		  jd = 0;
		  if (w.charAt(i) == s.charAt(0))
		  {
			for (j = 0;j < s.length();j++)
			{
				if (w.charAt(i + j) == s.charAt(j))
				{
					jd = 0;
				}
				else
				{
					jd = 1;
				}
			}
			if (jd == 0)
			{
				System.out.printf("%d",i);
				break;
			}
		  }
	  }
	  return 0;
	}

}

