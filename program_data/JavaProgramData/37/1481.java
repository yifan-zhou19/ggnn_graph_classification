package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int t;
		  int i;
		  int x;
		  int j;
		  int r;
		  int k = 0;
		  String a = new String(new char[100000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < t;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a = tempVar2.charAt(0);
						  }
						  x = a.length();
						  for (j = 0;j < x;j++)
						  {
										  if (j == 0)
										  {
										  for (r = 1;r < x;r++)
										  {
														  if (a.charAt(r) == a.charAt(j))
														  {
														  break;
														  }
										  }
										  }
										  else
										  {

							  for (r = 0;r < x;r++)
							  {
												 if (a.charAt(j) == a.charAt(r) && j != r)
												 {


												 break;
												 }

							  }
										  }

										 if (r == x)
										 {
										 System.out.printf("%c\n",a.charAt(j));
						  k++;
						  break;
										 }
						  }
						  if (k == 0)
						  {
						  System.out.print("no\n");
						  }
						  else
						  {
						  k = 0;
						  }
		  }

	}
}

