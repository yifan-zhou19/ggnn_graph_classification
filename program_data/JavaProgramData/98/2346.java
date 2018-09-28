package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  char[][] word = new char[n][20];
		  int i;
		  int sum = 0;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  word[0] = tempVar2.charAt(0);
		  }
		  sum += String.valueOf(word[0]).length() + 1;
		  for (i = 1;i < n;i++)
		  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  word[i] = tempVar3.charAt(0);
				  }
				  sum += String.valueOf(word[i]).length();
				  if (sum > 80)
				  {
						  System.out.printf("%s\n",word[i - 1]);
						  sum = String.valueOf(word[i]).length() + 1;
				  }
				   else
				   {
						  System.out.printf("%s ",word[i - 1]);
						  sum += 1;
				   }
		  }
		  System.out.printf("%s",word[n - 1]);
	}
}

