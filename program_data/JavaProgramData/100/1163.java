package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   str = tempVar.charAt(0);
	   }
	   int len;
	   len = str.length();
	   int count = 0;
	   int i;
	   int j;
	   for (i = 0;i < len;i++)
	   {
		  if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
		  {
		 count++;
		  }
	   }
		 if (count == 0)
		 {
	   System.out.print("No");
		 }
		 else
		 {
			 for (j = 97;j <= 122;j++)
			 {
		  int n = 0;
		 for (i = 0;i < len;i++)
		 {
			 if (str.charAt(i) == j)
			 {
			n++;
			 }
		 }
		 char a;
		 a = (char)j;
		 if (n != 0)
		 {
		 System.out.printf("%c=%d\n", a,n);
		 }

			 }
		 }

		return 0;
	}

}

