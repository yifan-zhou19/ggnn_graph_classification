package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
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
	 n = i;
	 for (i = 0;i < n;i++)
	 {
		 if (strcmp(x[i],x[n - 2]) == 0)
		 {
		 x[i] = x[n - 1];
		 }
	 }
	 System.out.printf("%s",x[0]);
	 for (i = 1;i < n - 2;i++)
	 {
		 System.out.printf(" %s",x[i]);
	 }
	}
}

