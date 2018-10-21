package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 int f;
	 int k;
	 int l;
	 int c;
	 String a = new String(new char[1000]);
	 int[] h = new int[300];
	 a = new Scanner(System.in).nextLine();
	 n = a.length();
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 s:
	 ;
	 for (i = 0;i < n;i++)
	 {
	   if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
	   {
		 for (j = i;j <= n;j++)
		 {
		   a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
		 }
		 n = n - 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		 goto s;
	   }
	 }
	 n = a.length();
	 c = 0;
	 f = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 pp:
	 ;
	 for (i = 0;i <= n;i++)
	 {
	   if (a.charAt(i) != '\0')
	   {
		 if (a.charAt(i) != ' ')
		 {
		   c = c + 1;
		 }
		 else
		 {
		  for (k = 0;k <= i;k++)
		  {
			for (j = 0;j < n;j++)
			{
			  a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
			}
		  }
		  h[f] = c;
		  f = f + 1;
		  n = n - c - 1;
		  c = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		  goto pp;
		 }
	   }
		else
		{
			h[f] = c;
		}
	 }
	 for (l = 0;l < f;l++)
	 {
	   System.out.printf("%d,",h[l]);
	 }
	 System.out.printf("%d",h[f]);
	 return 0;
	}

}

