package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[100]);
	  String w = new String(new char[200]);
	  int i;
	  int j;
	  int k;
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
	  for (i = 0;w.charAt(i) != 0;i++)
	  {
							 if (w.charAt(i) == s.charAt(0))
							 {
							 for (k = i + 1,j = 1;s.charAt(j) != 0;j++)
							 {
												   if (w.charAt(k) != w.charAt(j))
												   {
												   break;
												   }
							 }
												System.out.printf("%d",i);
												break;
							 }
	  }

	  return 0;

	}

}

