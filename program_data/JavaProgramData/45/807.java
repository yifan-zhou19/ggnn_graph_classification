package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i = 0;
	  int j;
	  int a;
	  int b;
	  int c;
	  int d;
	  int m = 1;
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
	  a = s.length();
	  b = w.length();
	  for (j = 0;j < b;j++)
	  {
				if (s.charAt(i) == w.charAt(j))
				{
					  c = j - i;
					 for (d = i + 1;d < a;d++)
					 {
						   if (s.charAt(d) == w.charAt(d + c))
						   {
						  m++;
						   }
					 }
					 if (m == a)
					 {
					   System.out.printf("%d",j);
					 }
				}
	  }
	}

}

