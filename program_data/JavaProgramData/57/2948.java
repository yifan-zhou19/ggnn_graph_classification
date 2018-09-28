package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int[] cd = new int[50];
	  char[][] dc =
	  {
		  {'0', '0', '0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	  };
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n + 1;i++)
	  {
		  dc[i] = new Scanner(System.in).nextLine();
		 cd[i] = String.valueOf(dc[i]).length();
	  }
	  for (i = 0;i < n + 1;i++)
	  {
	   if (dc[i][cd[i] - 1] == 'g')
	   {
		   dc[i][cd[i] - 3] = 0;
	   }
	   if (dc[i][cd[i] - 1] == 'r')
	   {
		   dc[i][cd[i] - 2] = 0;
	   }
	   if (dc[i][cd[i] - 1] == 'y')
	   {
		   dc[i][cd[i] - 2] = 0;
	   }
	  }
	  for (i = 0;i < n + 1;i++)
	  {
	  System.out.printf("%s\n",dc[i]);
	  }

		  return 0;
	}


}

