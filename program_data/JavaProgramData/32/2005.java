package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static int l;
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int temp;
	public static void Main()
	{
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b = tempVar3.charAt(0);
		  }
		  l = a.length() - 1;
		  m = b.length() - 1;
		  for (j = 0;j <= (l - 1) / 2;j++)
		  {
			  temp = a.charAt(j);
			  a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(l - j));
			  a = tangible.StringFunctions.changeCharacter(a, l - j, temp);
		  }
		  for (j = 0;j <= (m - 1) / 2;j++)
		  {
			  temp = b.charAt(j);
			  b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(m - j));
			  b = tangible.StringFunctions.changeCharacter(b, m - j, temp);
		  }
		  for (j = m + 1;j <= l;j++)
		  {
			 b = tangible.StringFunctions.changeCharacter(b, j, '0');
		  }
		  for (j = 0;j <= l;j++)
		  {
			  if (a.charAt(j) < b.charAt(j))
			  {
				  a.charAt(j + 1)--;
				  a = tangible.StringFunctions.changeCharacter(a, j, 10 + a.charAt(j) - b.charAt(j));
			  }
			  else
			  {
				  a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(j));
			  }
		  }
		 while (a.charAt(l) == 0)
		 {
			 l--;
		 }
		 for (j = l;j >= 0;j--)
		 {
			 System.out.printf("%d",a.charAt(j));
		 }
		 if (l == -1)
		 {
			 System.out.print("0\n");
		 }
		 else
		 {
			 System.out.print("\n");
		 }
	  }
	}
}

