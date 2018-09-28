package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
	  String a = new String(new char[100]);
	  String b = new String(new char[100]);
	  int i;
	  int j;
	  int n;
	  int m;
	  int z;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   b = tempVar2.charAt(0);
	   }
		 n = a.length();
		 m = b.length();
		  for (i = 0;i < n - 1;i++)
		  {
			  for (j = 0;j < n - 1 - i;j++)
			  {
				 if (a.charAt(j) < a.charAt(j + 1))
				 {
				 z = a.charAt(j);
				 a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				 a = tangible.StringFunctions.changeCharacter(a, j + 1, z);
				 }
			  }
		  }

		 for (i = 0;i < m - 1;i++)
		 {
			  for (j = 0;j < m - 1 - i;j++)
			  {
				 if (b.charAt(j) < b.charAt(j + 1))
				 {
				 z = b.charAt(j);
				 b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
				 b = tangible.StringFunctions.changeCharacter(b, j + 1, z);
				 }
			  }
		 }
		 if (strcmp(a,b) == 0)
		 {
			 System.out.print("YES");
		 }
		 else
		 {
			 System.out.print("NO");
		 }

		 return 0;
	} //?????????????????????????
}

