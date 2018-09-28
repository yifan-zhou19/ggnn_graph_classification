package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int t;
		  int i;
		  int j;
		  int k;
		  int x;
		  String a = new String(new char[100000]);
		  char firstone;
		  int c;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < t;i++)
		  {
			  c = 0;
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = tempVar2.charAt(0);
			  }
			  for (j = 0;a.charAt(j) != '\0';j++)
			  {
				  x = 0;
				  for (k = 0;a.charAt(k) != '\0';k++)
				  {
					  if (a.charAt(j) == a.charAt(k))
					  {
						  x = x + 1;
					  }
				  }
				  if (x == 1)
				  {
					  firstone = a.charAt(j);
					  break;
				  }
			  }
			  if (x != 1)
			  {
				  c = c + 1;
			  }
			  if (c == 0)
			  {
				  System.out.printf("%c\n",firstone);
			  }
			  else
			  {
				  System.out.print("no\n");
			  }
		  }
	}

}

