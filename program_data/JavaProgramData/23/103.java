package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String s = new String(new char[10000]);
	  int n = 0;
	  int q = 0;
	  int i;
	  int j;
	  int[] num = new int[100];
	  int[] point = new int[10000];
	  s = new Scanner(System.in).nextLine();
	  for (i = 0;i < s.length();i++)
	  {
		  if (s.charAt(i) != ' ')
		  {
		  if (q == 0)
		  {
			  q = 1;
			  n++;
			  num[n] = 1;
			  point[n] = i;
		  }
		  else
		  {
			  num[n]++;
		  }
		  }
		  else
		  {
			  q = 0;
		  }
	  }
	 for (i = n;i >= 1;i--)
	 {
		 for (j = 0;j < num[i];j++)
		 {
			 System.out.printf("%c",s.charAt(point[i] + j));
		 }
	 if (i > 1)
	 {
		 System.out.print(" ");
	 }
	 }
	}
}
