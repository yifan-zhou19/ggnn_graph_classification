package <missing>;

public class GlobalMembers
{
	public static void turn(tangible.RefObject<String> a, int n)
	{
		 String p;
		 String q;
		 int i;
		 int j;
		 int t;
		 int k;
		 k = n / 2 + n % 2;
		 p = a.argValue,q = a.argValue.Substring(n) - 1;
		 for (i = 0;i <= k - 1;i++)
		 {
								  t = (p.Substring(i));
								  *(p.Substring(i)) = *(q - i);
								  *(q - i) = t;
		 }
	}
	public static int Main()
	{
	int ii;
	for (ii = 0;ii <= 5;ii++)
	{
		 String A = new String(new char[100]);
		 int i;
		 int j;
		 int count = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(A,'\0',100);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 A = tempVar.charAt(0);
		 }

		 if (A.charAt(0) == '-')
		 {
			 for (j = 0;A.charAt(j) != '\0';j++)
			 {
			  A = tangible.StringFunctions.changeCharacter(A, j, A.charAt(j + 1));
			 }
		  System.out.print("-");
		 }
		 {
		 for (i = 0;A.charAt(i) != '\0';i++)
		 {
			 count++;
		 }
	 tangible.RefObject<String> tempRef_A = new tangible.RefObject<String>(A);
		 turn(tempRef_A, count);
		 A = tempRef_A.argValue;
		 if (A.charAt(0) == '0' && A.charAt(1) == '\0')
		 {
			 System.out.print("0");
		 }
		 else
		 {
				  for (i = 0;A.charAt(0) == '0';i++)
				  {
							   for (j = 0;A.charAt(j) != '\0';j++)
							   {
													  A = tangible.StringFunctions.changeCharacter(A, j, A.charAt(j + 1));
							   }
				  }
				  for (i = 0;A.charAt(i) != '\0';i++)
				  {
							  System.out.printf("%c",A.charAt(i));
				  }
		 }
	 }




		 System.out.print("\n");
	}


	}

}

