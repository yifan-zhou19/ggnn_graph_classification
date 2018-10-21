package <missing>;

public class GlobalMembers
{
	public static char[] str = {null};
	public static char[] substr = {null};

	public static int Main()
	{
		 while (scanf("%s%s",str,substr) != EOF)
		 {
			  char[] rt = {null};
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			  char * p1;
			  String p2;
			  int n = 0; //indx[N]= {NULL};
			  int i = 0;
			  int k = 0;

			  for (p1 = str,p2 = str,i = 0; p1 - str < str.length(); p1++)
			  {
				   if (*p1 > k)
				   {
						k = p1;
						p2 = p1;
						n = p2 - str;
				   }
			  }
			  rt = str.substring(0, n + 1);
			  //  printf("%d",k);
			  System.out.printf("%s",rt);
			  System.out.printf("%s",substr);
			  System.out.printf("%s\n",p2.Substring(1));
		 }
		 return 0;
	}

}
