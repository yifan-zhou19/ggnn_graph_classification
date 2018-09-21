package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i = 0;
	   int j;
	   int m = 0;
	   int k;
	   int l = 0;
	   final String str = ""; //???]={'\0'}
	   String a = new String(new char[100]);
	   a = new Scanner(System.in).nextLine();
	   k = a.length();
	   for (i = 0;i < k;i++)
	   {
		   if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
		   {
		 l++;
		   }
	   }
	   l = l + 1;
	   i = 0; //???i=0;
	   for (j = 0;j < k;j++)
	   {
		   if (a.charAt(j) != ' ')
		   {
			  str.charAt(i)[m] = a.charAt(j);
			  m++;
		   }
		   if (a.charAt(j) == ' ' && a.charAt(j + 1) != ' ')
		   {
			  i++;
			  m = 0;
		   }
	   }
	   for (j = 0;j < l - 1;j++)
	   {
	   System.out.printf("%s ",str.charAt(l - j - 1));
	   }
	   System.out.printf("%s",str.charAt(0));
	}
}
