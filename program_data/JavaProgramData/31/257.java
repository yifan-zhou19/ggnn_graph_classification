package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  char[][] a = new char[3000][50];
		  final String end = "end";
		  int i = -1;
		  do
		  {
			   i++;
			   a[i] = new Scanner(System.in).nextLine();
		  } while (a[i][0] != 'e');
		  i--;
		  while (i >= 0)
		  {
		  System.out.println(a[i]);
		  i--;
		  }
	}

}
