package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  int j;
	  int n;
	  int b;
	  int num = 0;
	  char[][] string = new char[10000][40];
	  char c;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  string[i] = tempVar2.charAt(0);
		  }
	  }

	  for (i = 0;i < n;i++)
	  {
		  for (j = 0,b = 0;(c = string[i][j]) != '\0';j++)
		  {
			  b++;
		  }
		  num = num + b + 1;

		  if (num < 81 || num == 81)
		  {
			  if (i == 0)
			  {
				  System.out.printf("%s", string[0]);
			  }
				  else
				  {
			System.out.printf(" %s", string[i]);
				  }
		  }
		  else if (num > 81)
		  {
			System.out.printf("\n%s", string[i]);
			num = b + 1;
		  }
	  }
	}

}

