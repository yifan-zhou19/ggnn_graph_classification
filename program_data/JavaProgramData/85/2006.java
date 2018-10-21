package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int a;
	  int b;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  char[][] bsf = new char[n][21];
	  int[] l = new int[21];
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  bsf[i] = tempVar2.charAt(0);
		  }
		  l[i] = String.valueOf(bsf[i]).length();
		  a = 0;
		  if ((bsf[i][a] >= 'a' && bsf[i][a] <= 'z') || (bsf[i][a] >= 'A' && bsf[i][a] <= 'Z') || (bsf[i][a] == '_'))
		  {
		  b = 1;
		  for (a = 1;a < l[i];a++)
		  {
			  if ((bsf[i][a] >= 'a' && bsf[i][a] <= 'z') || (bsf[i][a] >= 'A' && bsf[i][a] <= 'Z') || (bsf[i][a] == '_') || (bsf[i][a] >= '0' && bsf[i][a] <= '9'))
			  {
				  b++;
			  }
		  }
		  if (b == l[i])
		  {
			  System.out.print("yes\n");
		  }
		  else
		  {
			  System.out.print("no\n");
		  }
		  }
		  else
		  {
			  System.out.print("no\n");
		  }
	  }
	  return 0;
	}










}

