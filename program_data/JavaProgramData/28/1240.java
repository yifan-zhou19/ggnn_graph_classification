package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[10000]);
		  int[] b = new int[10000];
		  int i = 0;
		  int j;
		  int p;
		  a = new Scanner(System.in).nextLine();
		  for (j = 0;a.charAt(i) != '\0';i++)
		  {
								 if (a.charAt(i) != ' ')
								 {
								 b[j]++;
								 }
								 else
								 {
								 if (b[j] != 0)
								 {
								 System.out.printf("%d,",b[j]);
								 }
								 j++;
								 }
		  }
		  System.out.printf("%d",b[j]);

	}

}
