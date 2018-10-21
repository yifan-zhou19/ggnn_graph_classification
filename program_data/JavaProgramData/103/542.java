package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			  String s = new String(new char[1050]);
			  char bj;
			  int i;
			  int j;
			  int k;
			  int f;
			  int l;
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  s = tempVar.charAt(0);
			  }
			  l = s.length();
			  f = 0;
			  for (i = 0;i < l;i++)
			  {
					 if (f == 0)
					 {
							   bj = s.charAt(i);
							   if (bj >= 97)
							   {
								  bj = bj - 32;
							   }
							   f = 1;
					 }
						   else
						   {
							   if ((s.charAt(i) == bj) || (s.charAt(i) - 32 == bj))
							   {
											f++;
							   }
											else
											{
												System.out.printf("(%c,%d)",bj,f);
												f = 1;
												 bj = s.charAt(i);
												 if (bj >= 97)
												 {
												 bj = bj - 32;
												 }
											}
						   }
			  }
			  System.out.printf("(%c,%d)",bj,f);
	}



}

