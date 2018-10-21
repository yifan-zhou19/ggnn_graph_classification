package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j = 0;
	  int k = 0;
	  int lth1 = 99;
	  int lth2 = 0;
	  int n1;
	  int n2;
	  String a = new String(new char[1000]);
	  char[][] b = new char[50][20];
	  a = new Scanner(System.in).nextLine();
	  for (i = 0;i < 999;i++)
	  {

		  if (a.charAt(i) != ' ' && a.charAt(i) != '.' && a.charAt(i) != '\0')
		  {
			  b[j][k] = a.charAt(i);
			  k++;
		  }
		  else
		  {
			  b[j][k] = '\0';
			  if (k < lth1)
			  {
				  lth1 = k;
				  n1 = j;
			  }
			  if (k > lth2)
			  {
				  lth2 = k;
				  n2 = j;
			  }
			  k = 0;
			  j++;
		  }
		  if (a.charAt(i) == '\0' || a.charAt(i) == '.')
		  {
			  break;
		  }

	  }
	  System.out.printf("%s\n%s",b[n2],b[n1]);

	  return 0;
	}
}
