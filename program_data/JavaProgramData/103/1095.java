package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String c = new String(new char[1000]);
	   c = new Scanner(System.in).nextLine();
	   int k = c.length();
	   for (int s = 0;s < k;s++)
	   {
		 if (c.charAt(s) >= 'a' && c.charAt(s) <= 'z')
		 {
			 c = tangible.StringFunctions.changeCharacter(c, s, c.charAt(s) - 'a'+'A');
		 }
	   }
	   int[] a = new int[1000];
	   int p = 0;
	   String C = new String(new char[1000]);
	   for (int i = 0,j;i < k;i++)
	   {
		   if (i > 0 && c.charAt(i) == c.charAt(i - 1))
		   {
			   continue;
		   }
		   else
		   {
			 for (j = i;j < k;j++)
			 {
			  if (c.charAt(i) == c.charAt(j))
			  {
				   a[p]++;
				   C = tangible.StringFunctions.changeCharacter(C, p, c.charAt(i));
			  }
			  else
			  {
				   p++;
				   break;
			  }
			 }
		   }
	   }
		for (int q = 0;q <= p;q++)
		{
		   System.out.printf("(%c,%d)",C.charAt(q),a[q]);
		}
	}
}

