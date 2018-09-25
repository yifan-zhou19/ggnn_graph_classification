package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int n;
	 char[][] x = new char[100][100];
	 for (i = 0;i < 100;i++)
	 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 x[i] = tempVar.charAt(0);
		 }
	  if (String.valueOf(x[i]).length() == 0)
	  {
		  break;
	  }
	 }
	 n = i - 2;
	 for (i = 0;i < n;i++)
	 {
		 if (j != 0)
		 {
		 System.out.print(" ");
		 }
		 if (strcmp(x[i],x[n]) == 0)
		 {
		System.out.printf("%s",x[n + 1]);
		 }
	else
	{
	  System.out.printf("%s",x[i]);
	}
	 j++;
	 }
	}




}

