package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  String c = new String(new char[30]);
	  int[] sz = new int[30];

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

	  for (i = 0;i < n;i++)
	  {
		  c = new Scanner(System.in).nextLine();

		  if ((c.charAt(0) >= 'a' && c.charAt(0) <= 'z') || (c.charAt(0) >= 'A' && c.charAt(0) <= 'Z') || (c.charAt(0) == '_'))
		  {
			  for (j = 1;c.charAt(j) != '\0';j++)
			  {
				  if (!((c.charAt(j) >= 'a' && c.charAt(j) <= 'z') || (c.charAt(j) >= 'A' && c.charAt(j) <= 'Z') || (c.charAt(j) == '_') || (c.charAt(j) >= '0' && c.charAt(j) <= '9')))
				  {
					 sz[i] = 1;
					 break;
				  }
			  }
		  }
		  else
		  {
			  sz[i] = 1;
		  }
	  }

	  for (i = 0;i < n;i++)
	  {
		  if (sz[i] == 0)
		  {
			  System.out.print("yes\n");
		  }
		  else
		  {
			  System.out.print("no\n");
		  }
	  }




	  return 0;
	}

}

