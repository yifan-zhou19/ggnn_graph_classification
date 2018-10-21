package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[150]);
		int[] b = new int[150];
		int word = 1;
		int c = 0;
		b[1] = 0;
		a = new Scanner(System.in).nextLine();
		int l = a.length();
		for (int i = 0;i <= l - 1;i++)
		{
			 if (a.charAt(i) == ' ')
			 {
				 word++;
				 b[word] = i;
			 }
		}
		 b[word + 1] = l;
		 for (int i = word;i >= 2;i--)
		 {
		   for (int j = b[i] + 1;j <= b[i + 1] - 1;j++)
		   {
			   System.out.print(a.charAt(j));
		   }
		   System.out.print(' ');
		 }
		  for (int i = 0;i <= b[2] - 1;i++)
		  {
			  System.out.print(a.charAt(i));
		  }
	return 0;
	}


}
