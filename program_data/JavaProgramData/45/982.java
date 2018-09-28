package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int lenw;
	  int lens;
	  int a = 100;
	  int j;
	  String s = new String(new char[50]);
	  String w = new String(new char[50]);
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
	  lenw = w.length();
	  lens = s.length();
	  for (i = 0;i < lenw;i++)
	  {
		  for (j = 0;j < lens;j++)
		  {
				  if (w.charAt(i + j) != s.charAt(j))
				  {
					  break;
				  }
				  if (w.charAt(i + j) == s.charAt(j))
				  {
					  a = i;
				  }
				  break;

		  }
		  if (a == i)
		  {
			  break;
		  }
	  }
		  System.out.printf("%d",a);

	  return 0;

	}



}

