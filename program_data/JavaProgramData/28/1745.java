package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str = new String(new char[6000]);
	 char[][] words = new char[M][N];
	  int len;
	  int i = 0;
	  int j = 0;
	  int k = 0;
	  int p;
	 str = new Scanner(System.in).nextLine();
	 len = str.length();
	 while (i < len)
	 {
	  if (str.charAt(i) != ' ')
	  {
	   for (j = i;str.charAt(j) != ' ' && j < len;j++)
	   {
		words[k][j - i] = str.charAt(j);
	   }
	   words[k][j - i] = '\0';
	   k++;
	   i = j + 1;
	  }
	  else
	  {
	   i++;
	  }
	 }
	   p = k;
		System.out.printf("%d",len = String.valueOf(words[0]).length());
	 for (k = 1;k < p;k++)
	 {
	  System.out.printf(",%d",len = String.valueOf(words[k]).length());
	 }
	 return 0;
	}


}
