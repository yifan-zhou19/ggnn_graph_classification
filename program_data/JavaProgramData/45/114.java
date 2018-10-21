package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[60]);
	   String b = new String(new char[60]);
	   a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   b = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   int l1;
	   int l2;
	   l1 = a.length();
	   l2 = b.length();
	   int i;
	   for (i = 0;i <= l2 - l1;i++)
	   {
		   int c = 0;
		   int j;
		   int k;
		   for (j = i,k = 0;j <= i + l1 - 1;j++,k++)
		   {
			   if (b.charAt(j) == a.charAt(k))
			   {
				   c++;
			   }

		   }

		   if (c == l1)
		   {
			   System.out.print(i);
			   break;
		   }
	   }
	   return 0;
	}

}

