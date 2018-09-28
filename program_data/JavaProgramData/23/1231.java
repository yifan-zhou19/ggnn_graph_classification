package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		int word;
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String string = new String(new char[100]);
		String[] pp = new String[100];
		char[][] s = new char[100][100];
		a = new Scanner(System.in).nextLine();
		n = a.length();
		k = 1;
		for (p = a;p < a.Substring(n);p++)
		{
	  if (*p == ' ')
	  {
	   word = 0;
	  }
	  else
	  {
	   if (word == 0)
	   {
		word = 1;
		k++;
	   }
	  }
		}
	 i = 0;
	 j = 0;
	 p = a;
	 m = 0;
	 while (*p != '\0')
	 {
		 pp[i] = p;
	  while (*p != ' ')
	  {

		  *(pp[i] + j) = *p;
	  p++;
	  j++;
	  if (*p == '\0')
	  {
	   break;
	  }
	  }
	 *(pp[i] + j) = '\0';
	 i++;
	 p++;
	 j = 0;
	 }

	 for (i = k - 1;i > 0;i--)
	 {
		 System.out.printf("%s ",pp[i]);
	 }
	 System.out.printf("%s",pp[0]);
	}

}
