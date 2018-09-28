package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[50]);
	   a = ConsoleInput.readToWhiteSpace(true).charAt(0);

	   String b = new String(new char[50]);
	   b = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   int i;
	   int j;
	   int k = 0;
	   int l1;
	   int l2;
	   l1 = a.length();
	   l2 = b.length();
	   i = 0;
	   if (l1 != l2)
	   {
		 System.out.print("NO");
		 System.out.print("\n");
	   }
	   else
	   {
		 while (i < l1)
		 {
			 for (j = 0;j < l1;j++)
			 {
			   if (b.charAt(i) == a.charAt(j))
			   {
				 k++;

				  a = a.substring(0, j);
				  break;
			   }
			 }
			 i++;
		 }

		   if (k == l1)
		   {
			 System.out.print("YES");
			 System.out.print("\n");
		   }
		   else
		   {
			System.out.print("NO");
			System.out.print("\n");
		   }
	   }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   return 0;
	}

}

