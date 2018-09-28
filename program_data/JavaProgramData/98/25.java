package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int m = 0;
	  char[][] word = new char[1000][20];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  word[i] = tempVar2.charAt(0);
		  }
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
		  if (m <= 80 - String.valueOf(word[i]).length())
		  {
			  System.out.printf("%s",word[i]);
			  if (m <= 79 - String.valueOf(word[i]).length() - String.valueOf(word[i + 1]).length() && i < n - 1)
			  {
			  System.out.print(" ");
			  }
			  m += String.valueOf(word[i]).length() + 1;
		  }
		  else
		  {
			  i = i - 1;
			  System.out.print("\n");
			  m = 0;
		  }

	  }
	  return 0;
	}
}

