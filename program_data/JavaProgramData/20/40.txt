package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  int j;
	  int kong;
	  int[] max = new int[100];
	  int hang;
	  char bi;
	  char[][] a = new char[100][50];
	  char[][] b = new char[100][50];
	  for (i = 0;i < 100;i++)
	  {
		  a[i] = new Scanner(System.in).nextLine();
		  if (String.valueOf(a[i]).length() == 0)
		  {
			  break;
		  }
		  max[i] = 0;
		  bi = a[i][0];
		  for (j = 1;a[i][j] != ' ';j++)
		  {
			  if (a[i][j] > bi)
			  {
				  bi = a[i][j];
				  max[i] = j;
			  }
		  } //???ASCII??????????
		  for (j = 1;j < String.valueOf(a[i]).length();j++)
		  {
			  if (a[i][j] == ' ')
			  {
				  kong = j;
				  break;
			  } //kong????????
		  }
		  for (j = 0;j <= max[i];j++)
		  {
			  System.out.printf("%c",a[i][j]);
		  }
		  System.out.printf("%c%c%c",a[i][kong + 1],a[i][kong + 2],a[i][kong + 3]);
		  for (j = max[i] + 4;j < String.valueOf(a[i]).length() - 1;j++)
		  {
			  System.out.printf("%c",a[i][j - 3]);
		  }
		  System.out.print("\n");


	  }


	}

}
