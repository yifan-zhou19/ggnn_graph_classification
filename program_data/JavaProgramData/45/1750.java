package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[50]);
	  String w = new String(new char[50]);
	  int i;
	  int j;
	  int z;
	  int k = 0;
	  int len1;
	  int len2;
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
	  len1 = s.length();
	  len2 = w.length();
	  for (i = 0;i < len2;i++)
	  {
		   if (w.charAt(i) == s.charAt(0))
		   {
			   for (z = 0,j = i;j < i + len1;j++,z++)
			   {
					if (s.charAt(z) == w.charAt(j))
					{
						k++;
					}
			   }
			   if (k == len1)
			   {
				   System.out.printf("%d",i);
			   }
		   }
	  }

	   return 0;
	}



}

