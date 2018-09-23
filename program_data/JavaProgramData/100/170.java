package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String a = new String(new char[300]);
	  int i;
	  int j;
	  int k;
	  int[] b = new int[30];
	  a = new Scanner(System.in).nextLine();
	  for (i = 0;i <= 25;i++)
	  {
		b[i] = 0;
	  }
	  for (i = 0;a.charAt(i) != 0;i++)
	  {
	  }
	  for (i = 0,k = 0;a.charAt(i) != '\0';i++)
	  {
		 if ((a.charAt(i) >= 97) && (a.charAt(i) <= 122))
		 {
			   b[(a.charAt(i) - 97)]++;
		 }
	  }
	  for (i = 0;i <= 25;i++)
	  {
		 if (b[i] > 0)
		 {
		   System.out.printf("%c=%d\n",i + 97,b[i]);
		   k = 1;
		 }

	  }
	  if (k == 0)
	  {
		  System.out.print("No\n");
	  }
	}
}
