package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void turn(char a[]);
		String words = new String(new char[101]);
	   words = new Scanner(System.in).nextLine();
	   turn(words);
	   System.out.println(words);
	}
	  public static void turn(String a)
	  {
		  char[][] b = new char[50][101];
		  final String c = "";
		  int i;
		  int j = 0;
		  int k;
		  int l;
		  int len;
		  len = a.length();
		  for (i = 0;i < len;i++)
		  {
			  if (a[i].equals(' '))
			  {
				  k = i;
				 while (!a[k - 1].equals(' ') && k != 0)
				 {
					 k--;
				 }
				 for (l = 0;k < i;k++,l++)
				 {
					 b[j][l] = a[k];
				 }
				 b[j][l] = '\0';
				 j++;
			  }
		  }
			k = i;
			while (!a[k - 1].equals(' ') && k != 0)
			{
				k--;
			}
			for (l = 0;k < i;k++,l++)
			{
				b[j][l] = a[k];
			}
			b[j][l] = '\0';
			a = c;
			for (i = j;i > 0;i--)
			{
				a += b[i];
				a += " ";
			}
			a += b[0];
			a += "\0";
	  }
}
