package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String s = new String(new char[257]);
	   String a = new String(new char[257]);
	   String b = new String(new char[257]);
	   int n;
	   int m;
	   int i;
	   int j;
	   int k = 0;
	   s = new Scanner(System.in).nextLine();
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
	   n = s.length();
	   m = a.length();
	   for (i = 0;i < n;i++)
	   {
		   if (s.charAt(i) == a.charAt(0) && s.charAt(i + m - 1) == a.charAt(m - 1))
		   {
			   for (j = i;j < i + m;j++)
			   {
				   if (s.charAt(j) == a.charAt(j - i))
				   {
					   k++;
				   }
			   }

			   if (k == m)
			   {
						System.out.printf("%s",b);
					   i += m - 1;
			   }
			   else
			   {
				   System.out.printf("%c",s.charAt(i));
			   }

		   }
			else
			{
				System.out.printf("%c",s.charAt(i));
			}
	   }
	   System.out.print("\n");



	   return 0;
	}
}

