package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] m = new int[300];
	 int n1;
	 int n2;
	 int a;
	 int i;
	 int b;
	 a = 0;
	 String n = new String(new char[300]);
	 for (i = 0;i <= 300;i++)
	 {
	 a = a + 1;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m[i] = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(null, 1);
	 if (tempVar2 != null)
	 {
		 n = tangible.StringFunctions.changeCharacter(n, i, tempVar2);
	 }
	 if (n.charAt(i) == '\n')
	 {
	 break;
	 }
	 }
	 if (a == 1)
	 {
		 System.out.print("No");
	 }
	 else
	 {
	  n1 = 0;
	  n2 = 0;
	  for (i = 0;i < a;i++)
	  {
	   if (m[i] > n1)
	   {
		   b = n1;
		   n1 = m[i];
		   m[i] = b;
	   }
	   if ((m[i] > n2) && (m[i] != n1))
	   {
		   n2 = m[i];
	   }
	  }
	 if (n2 == 0)
	 {
		 System.out.print("No");
	 }
	 else
	 {
		 System.out.printf("%d",n2);
	 }
	 }
	 return 0;
	}
}

