package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int result = 0;
	char[][] x = new char[1000][21];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	 for (int i = 0;i < n;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x[i] = tempVar2.charAt(0);
		}
	 }
	  for (int j = 0;j < n;j++)
	  {
		if (((x[j][0] >= 'a') && (x[j][0] <= 'z')) || ((x[j][0] >= 'A') && (x[j][0] <= 'Z')) || (x[j][0] == '_'))
		{
		  for (int k = 1;x[j][k] != '\0';k++)
		  {
			if (((x[j][k] >= 'a') && (x[j][k] <= 'z')) || ((x[j][k] >= '0') && (x[j][k] <= '9')) || ((x[j][k] >= 'A') && (x[j][k] <= 'Z')) || (x[j][k] == '_'))
			{
			}


			else
			{
				result = 1;
			}
		  }
		}
		 else
		 {
			  result = 1;
		 }
	   if (result == 0)
	   {
		   System.out.print("yes\n");
	   }
	   else
	   {
		   System.out.print("no\n");
	   };
	  result = 0;
	  }
	 return 0;
	}


}

