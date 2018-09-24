package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int[] a = new int[50];
		 char[][] str = new char[50][32];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 i = n;
		 for (;i > 0;i--)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 str[n - i] = tempVar2.charAt(0);
			 }
			 a[n - i] = String.valueOf(str[n - i]).length();
			 if (str[n - i][a[n - i] - 1] == 'r')
			 {
				 str[n - i][a[n - i] - 2] = '\0';
			 }
			 else if (str[n - i][a[n - i] - 1] == 'y')
			 {
				 str[n - i][a[n - i] - 2] = '\0';
			 }
			 else if (str[n - i][a[n - i] - 1] == 'g')
			 {
				 str[n - i][a[n - i] - 3] = '\0';
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 System.out.printf("%s\n",str[i]);
		 }
	}
}

