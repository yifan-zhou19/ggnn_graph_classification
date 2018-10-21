package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[500];
		int i;
		int t;
		int k;
		int j;
		int m;
		  String c = new String(new char[500]);
		 for (j = 1,m = 1;c.charAt(m) != '\n';j++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 s[j] = Integer.parseInt(tempVar);
			 }
		  c = tangible.StringFunctions.changeCharacter(c, m, System.in.read());
		 }
		 if (j == 2)
		 {
		 System.out.print("No");
		 }
		 else if (j == 3)
		 {
			 if (s[1] > s[2])
			 {
				 System.out.printf("%d",s[2]);
			 }
		  else if (s[1] < s[2])
		  {
			  System.out.printf("%d",s[1]);
		  }
		  else
		  {
			  System.out.print("No");
		  }
		 }
		 else
		 {

		  for (k = 1;k <= j - 1;k++)
		  {
		  for (i = 1;i <= j - k - 1;i++)
		  {
		  if (s[i + 1] > s[i])
		  {
			  t = s[i + 1];
			  s[i + 1] = s[i];
			  s[i] = t;
		  }
		  }
		  }
		  for (i = 1;i < j - 1;i++)
		  {
		  if (s[i] != s[i + 1])
		  {
			  break;
		  }
		  }
		  if (i < j - 1)
		  {
			  System.out.printf("%d",s[i + 1]);
		  }
		  else if (i >= j - 1)
		  {
			  System.out.print("No");
		  }
		 }

	}
}

