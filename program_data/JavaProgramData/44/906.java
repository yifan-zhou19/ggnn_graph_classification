package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 void doc(char b[20]);
	 char[][] a = new char[6][20];
	 String c = new String(new char[20]);
	 int i;
	 int j;
	 for (i = 0;i < 6;i++)
	 {
		 for (j = 0;j < 20;j++)
		 {
			 a[i][j] = '0';
		 }
		a[i] = new Scanner(System.in).nextLine();
	 }
	  for (i = 0;i < 6;i++)
	  {
	   if (a[i][0] == '0')
	   {
		System.out.print("0\n");
	   }
	   else
	   {
		if (a[i][0] == '-' && a[i][1] == '0')
		{
		 System.out.print("-0\n");
		}
		else
		{
		 if (a[i][0] == '-')
		 {
		  for (j = 0;j < 19;j++)
		  {
		   c = tangible.StringFunctions.changeCharacter(c, j, a[i][j + 1]);
		  }
			  c = tangible.StringFunctions.changeCharacter(c, 20, '0');
		  System.out.print("-");
		  doc(c);
		  System.out.print("\n");
		 }
		 else
		 {
		  for (j = 0;j < 20;j++)
		  {
		   c = tangible.StringFunctions.changeCharacter(c, j, a[i][j]);
		  }
		  doc(c);
		  System.out.print("\n");
		 }
		}
	   }
	  }
	}
	public static void doc(String b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p;
	 p = b;
	 p = p + 19;
	 while (*p == '\0' || *p == '0')
	 {
	  p = p - 1;
	  if (*p != '0' && *p != '\0')
	  {
	   break;
	  }
	 }
	 for (p = p;p >= b;p--)
	 {
	  System.out.printf("%c",*p);
	 }
	}

}

