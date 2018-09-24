package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int l1;
	  int l2;
	  int[] s3 = new int[101];
	  int i;
	  int j;
	  String s1 = new String(new char[101]);
	  String s2 = new String(new char[101]);
	  String s6 = new String(new char[2]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  s6 = new Scanner(System.in).nextLine();
	   s1 = new Scanner(System.in).nextLine();
	   s2 = new Scanner(System.in).nextLine();
	  l1 = s1.length();
	  l2 = s2.length();
	  for (j = 1;j <= l2;j++)
	  {
		  if (s1.charAt(l1 - j) >= s2.charAt(l2 - j))
		  {
			  s3[l1 - j] = s1.charAt(l1 - j) - s2.charAt(l2 - j);
		  }
		if (s1.charAt(l1 - j) < s2.charAt(l2 - j))
		{
			s3[l1 - j] = 10 + s1.charAt(l1 - j) - s2.charAt(l2 - j);
			s1 = tangible.StringFunctions.changeCharacter(s1, l1 - j - 1, s1.charAt(l1 - j - 1) - 1);
		}
	  }
	  for (j = 0;j < l1 - l2;j++)
	  {
		  s3[j] = s1.charAt(j) - '0';
	  }
	   for (j = 0;j < l1;j++)
	   {
		  System.out.printf("%d",s3[j]);
	   }
		  System.out.print("\n");
	  }
	}


}

