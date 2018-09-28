package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String c = new String(new char[500]);
	  c = new Scanner(System.in).nextLine();
	  int[] word = new int[500];
	  char[][] a = new char[500][100];
	  int i;
	  int k = 0;
	  int m = 0;
	  word[0] = 0;
	  for (i = 0;c.charAt(i) != '\0';i++)
	  {
		  if (c.charAt(i) != ' ' && c.charAt(i) != ',')
		  {
			  word[k]++;
			  a[k][m] = c.charAt(i);
			  m++;
		  }
		  else if (c.charAt(i) == ' ' || c.charAt(i) == ',')
		  {
			  k++;
			  m = 0;
			  word[k] = 0;
		  }

	  }

	int MAX = 0;
	int MIN = 0;
	int max = word[0];
	int min = word[0];
	  for (i = 1;i <= k;i++)
	  {


		 if (word[i] > max)
		 {
			 max = word[i];
			 MAX = i;
		 }

	  }
	  for (i = 1;i <= k;i++)
	  {

		 if (word[i] < min && word[i]>0)
		 {
			 min = word[i];
			 MIN = i;
		 }
	  }


	for (i = 0;i < max;i++)
	{
	System.out.printf("%c",a[MAX][i]);
	}
	System.out.print("\n");

	for (i = 0;i < min;i++)
	{
	System.out.printf("%c",a[MIN][i]);
	}



	  return 0;
	}
}
