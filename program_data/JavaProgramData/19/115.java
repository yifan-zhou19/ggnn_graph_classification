package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String str = new String(new char[80]);
	 char[][] s = new char[30][20];
	 String test1 = new String(new char[20]);
	 String test2 = new String(new char[20]);
	 String p;
	 int i;
	 int j;
	 int l;
	 int c;
	 int m = 0;
	 str = new Scanner(System.in).nextLine();
	 test1 = new Scanner(System.in).nextLine();
	 test2 = new Scanner(System.in).nextLine();
	 p = str;
	 for (i = 0,c = 0; * (p.Substring(i)) != ' ';i++,c++)
	 {
	  s[0][c] = (p.Substring(i));
	 }
	  s[0][c] = '\0';
	 l = str.length();
	 m = 1;
	 for (i = 0;i < l;i++)
	 {
	  if (*(p.Substring(i) - 1) == ' ' && *(p.Substring(i)) != ' ')
	  {
	   for (j = i,c = 0;str.charAt(j) != ' ';j++,c++)
	   {
		s[m][c] = str.charAt(j);
	   }
	   s[m][c] = '\0';
	   m++;
	  }
	 }
	 for (i = 0;i < m;i++)
	 {
	  if (strcmp(test1,s[i]) == 0)
	  {
	   s[i] = test2;
	  }
	 }
	 for (i = 0;i < m - 1;i++)
	 {
	 System.out.printf("%s ",s[i]);
	 }
	 System.out.printf("%s",s[m - 1]);
	}
}
