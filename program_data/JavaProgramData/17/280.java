package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int k;
	 int l;
	 int n;
	 int m;
	 String a = new String(new char[150]);
	 String b = new String(new char[150]);
	 for (m = 0;m < 1000;m++)
	 {
		 for (i = 0;i < 150;i++)
		 {
	   a = tangible.StringFunctions.changeCharacter(a, i, 0,b[i] = 0);
		 }
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  l = a.length();
	  if (l == 0)
	  {
		  break;
	  }
	  for (i = 0;i < l;i++)
	  {
	   b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i));
	  }
	  for (i = 0;i < l;i++)
	  {
	   for (j = 0;j < l;j++)
	   {
		if (a.charAt(j) == '(')
		{
			for (k = j + 1;k < l;k++)
			{
			 if (a.charAt(k) == '(')
			 {
				 break;
			 }
		  if (a.charAt(k) == ')')
		  {
			  a = tangible.StringFunctions.changeCharacter(a, j, 'a',a[k] = 'a');
			  break;
		  }
			}
		}
	   }
	  }
	  System.out.printf("%s\n",b);
	  for (i = 0;i < l;i++)
	  {
		  if (a.charAt(i) == '(')
		  {
			  System.out.print("$");
		  }
	   else if (a.charAt(i) == ')')
	   {
		   System.out.print("?");
	   }
	   else
	   {
		   System.out.print(" ");
	   }
	  }
	  System.out.print("\n");

	 }
	}

}

