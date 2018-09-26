package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
	 int i;
	 int m;
	 int n;
	 int j;
	 int s = 0;
	 int t = 0;
	 int k = 0;
	 for (i = 0;i <= 19;i++)
	 {
		  String tempVar = ConsoleInput.scanfRead(null, 1);
		  if (tempVar != null)
		  {
			  a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
		  }
	   if (a.charAt(i) == ' ')
	   {
			a = a.substring(0, i);
		 break;
	   }
	 }
	 b = new Scanner(System.in).nextLine();
	 m = a.length();
	 n = b.length();
	 if (m != n)
	 {
	 System.out.print("NO");
	 }
	 else
	 {
		for (i = 'a';i <= 'z';i++)
		{
		  for (j = 0;j < m;j++)
		  {
			if (a.charAt(j) == i)
			{
		  s = s + 1;
			}
		  }
	   for (j = 0;j < n;j++)
	   {
			 if (b.charAt(j) == i)
			 {
		  t = t + 1;
			 }
	   }
	   if (s != t)
	   {
			 System.out.print("N0");
		  k = 1;
		  break;
	   }
		}
	 if (k == 0)
	 {
	 System.out.print("YES");
	 }
	 }
	}

}

