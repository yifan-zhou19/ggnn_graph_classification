package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String ch = new String(new char[300]);
	   final String r = "";
	   int[] n = new int[300];
	   int i;
	   int j;
	   int N;
	   int m;
	   ch = new Scanner(System.in).nextLine();
	   N = ch.length();
	   for (i = 0;i <= N - 1;i++)
	   {
		   for (j = 0;j < i;j++)
		   {
		 if (ch.charAt(i) == r.charAt(j) && ch.charAt(i) >= 97 && ch.charAt(i) <= 122)
		 {
			  n[j] = n[j] + 1;
		   break;
		 }
		   }
		if (i == j && ch.charAt(i) >= 97 && ch.charAt(i) <= 122)
		{
			 r = tangible.StringFunctions.changeCharacter(r, i, ch.charAt(i));
		  n[i] = 1;
		}
	   }
	   m = 0;
	   for (i = 0;i <= N - 1;i++)
	   {
		 if (r.charAt(i) != '\0')
		 {
		   m = m + 1;
		 }
	   }
	   if (m == 0)
	   {
		 System.out.print("No");
	   }
	   else
	   {
		  for (j = 97;j <= 122;j++)
		  {
		   i = 0;
		while (i <= N - 1)
		{
		if (r.charAt(i) == j)
		{
			 System.out.printf("%c=",r.charAt(i));
		  System.out.printf("%d\n",n[i]);
		 i = i + 1;
		}
	   else
	   {
		 i = i + 1;
	   }
		}
		  }
	   }
	}
}

