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
	 char[][] a = new char[100][100];
	 void sort(char * a);
	 int i;
	 {
		 for (i = 0;i < n;i++)
		 {
	 a[i] = new Scanner(System.in).nextLine();
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 if ((a[i][0] == '_') || ((a[i][0] >= 'a') && (a[i][0] <= 'z')) || ((a[i][0] >= 'A') && (a[i][0] <= 'Z')))
		 {
			 sort(a[i]);
		 }
	  else
	  {
		  System.out.print("0\n");
	  }
	 }
	}
	public static void sort(tangible.RefObject<String> a)
	{
		int i;
		int m = 0;
		int n = 0;
	 for (i = 0; * (a.argValue.Substring(i)) != '\0';i++)
	 {
		 {
			 if ((*(a.argValue.Substring(i)) == '_') || ((*(a.argValue.Substring(i)) >= 'a') && (*(a.argValue.Substring(i)) <= 'z')) || ((*(a.argValue.Substring(i)) >= 'A') && (*(a.argValue.Substring(i)) <= 'Z')) || ((*(a.argValue.Substring(i)) >= '0') && (*(a.argValue.Substring(i)) <= '9')))
			 {
				 m++;
			 }
	 }
		 n++;
	 }
	 if (m == n)
	 {
		 System.out.print("1\n");
	 }
	 else if (m != n)
	 {
		 System.out.print("0\n");
	 }
	}

}

