package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   String a = new String(new char[1000]);
		   int n;
		   int i;
		   int j;
		   int count;
		   a = new Scanner(System.in).nextLine();
		   n = a.length();
		   for (i = 0;i < n;i++)
		   {
			 if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			 {
			   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			 }
		   }
			   i = 0;
			   for (;i < n;)
			   {
			   count = 1;
			   for (j = i + 1;;j++)
			   {
			   if (a.charAt(j) == a.charAt(i))
			   {
			   count++;
			   }
			   else
			   {
				   System.out.printf("(%c,%d)",a.charAt(i),count);
			   i = j;
			   break;
			   }
			   }
			   }
			   System.in.read();
			   System.in.read();
	}

}

