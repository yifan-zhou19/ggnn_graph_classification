package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 int l;
		 int i;
		 char[][] sz = new char[99][99];
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
			 sz[i] = tempVar2.charAt(0);
		 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 l = String.valueOf(sz[i]).length();
			 if (sz[i][l - 1] == 'r' || sz[i][l - 1] == 'y')
			 {
			 sz[i][l - 2] = '\0';
			 }
			 else if (sz[i][l - 1] == 'g')
			 {
			 sz[i][l - 3] = '\0';
			 }
		 }
		  for (i = 0;i < n - 1;i++)
		  {
		  System.out.printf("%s\n",sz[i]);
		  }
		  System.out.printf("%s",sz[n - 1]);
		  return 0;

	 }

}

