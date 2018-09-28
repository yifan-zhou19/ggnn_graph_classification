package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String zfc = new String(new char[1000]);
	 char[][] zsz = new char[1000][1000];
	 zfc = new Scanner(System.in).nextLine();
	 int word_i = 0;
	 int word_j = 0;
	 int i;
	 int n;
	 n = zfc.length();
	 for (i = 0;i < n;i++)
	 {
	  if (zfc.charAt(i) == ' ')
	  {

	   zsz[word_i][word_j] = '\0';
	   word_j = 0;
	   word_i++;
	  }
	  else
	  {
	   zsz[word_i][word_j] = zfc.charAt(i);
	   word_j++;
	   if (i == n - 1)
	   {
		zsz[word_i][word_j] = '\0';
		word_i++;
	   }
	  }
	 }

	 int[] l = new int[1000];
	 int j;
	 for (j = 0;j < word_i;j++)
	 {
	  l[j] = String.valueOf(zsz[j]).length();
	  if (l[j] != 0)
	  {
	   if (j != 0)
	   {
		System.out.printf(",%d",l[j]);
	   }
		  else
		  {
		   System.out.printf("%d",l[j]);
		  }
	  }
	 }
		return 0;
	}
}
