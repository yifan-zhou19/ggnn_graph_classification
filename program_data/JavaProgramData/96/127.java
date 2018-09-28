package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int l;
	  int i;
	  int j;
	  int s;
	  int k;
	  int m;
	  int[] b = new int[100];
	  int[] c = new int[100];
	  int[] d = new int[101];
	  String a = new String(new char[101]);
	  String e = new String(new char[100]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  l = a.length();
	  if (l == 1)
	  {
		 System.out.print("0\n");
		 System.out.printf("%d",a.charAt(0) - '0');
	  }
	  else
	  {
		  if (l == 2 && a.charAt(0) - '0' == 1 && a.charAt(1) - '0' < 3)
		  {
			System.out.print("0\n");
			System.out.printf("%d",a.charAt(1) - '0' + 10);
		  }
	  else
	  {
	   for (i = 0;i < l;i++)
	   {
		 d[i] = a.charAt(i) - '0';
	   }
	   for (i = 0;i < l;i++)
	   {
		  b[i] = d[i] / 13;
		  c[i] = d[i] % 13;
		  d[i + 1] = c[i] * 10 + d[i + 1];
	   }
		s = 0;
	   if (b[1] == 0)
	   {
		 for (j = 2;j < l;j++)
		 {
		   e = tangible.StringFunctions.changeCharacter(e, j - 2, b[j] + '0');
		 }
		 e = tangible.StringFunctions.changeCharacter(e, l - 2, '\0');
		 System.out.println(e);
	   }
	   else
	   {
		 for (j = 1;j < l;j++)
		 {
		   e = tangible.StringFunctions.changeCharacter(e, j - 1, b[j] + '0');
		 }
		 e = tangible.StringFunctions.changeCharacter(e, l - 1, '\0');
		 System.out.println(e);
	   }
	   System.out.printf("%d",c[i - 1]);
	  }
	  }
	  System.in.read();
	  System.in.read();
	}

}

