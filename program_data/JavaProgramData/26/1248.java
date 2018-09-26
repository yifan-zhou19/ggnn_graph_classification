package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 String s = new String(new char[1000]);
		 int l;
		 int i;
		 int j;
		 int[] a = new int[1000];
		 s = new Scanner(System.in).nextLine();
		 l = s.length();
		 for (i = 0;i < l;i++)
		 {
			 if (s.charAt(i) == ' ')
			 {
				   for (j = i + 1;s.charAt(j) == ' ';j++)
				   {
					   a[j] = 1;
				   }
				   i = j;
			 }
		 }
		 for (i = 0;i < l;i++)
		 {
			 if (a[i] == 0)
			 {
			 System.out.printf("%c",s.charAt(i));
			 }
		 }

	}

}
