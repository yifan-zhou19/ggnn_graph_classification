package <missing>;

public class GlobalMembers
{
	public static int len;
	public static int k;
	public static int m;
	public static int t;
		public static String str = new String(new char[101]);
	public static int work(int i,int j)
	{
	if (i == 0 && j == len - 1)
	{
		System.out.printf("%d %d",i,j);
	return 0;
	}
	else if (str.charAt(i) != str.charAt(j) && str.charAt(i) != ' ' && str.charAt(i) != ' ')
	{
	  System.out.printf("%d %d\n",i,j);
	  str = tangible.StringFunctions.changeCharacter(str, i, ' ');
	  str = tangible.StringFunctions.changeCharacter(str, j, ' ');
	  for (k = i - 1;;k--)
	  {
		  if (str.charAt(k) != ' ')
		  {
			  break;
		  }
	  }
	  for (m = j + 1;;m++)
	  {
		  if (str.charAt(m) != ' ')
		  {
			  break;
		  }
	  }
	  work(k, m);

	}
	else if (str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ' && str.charAt(i) != ' ')
	{
		 for (t = j + 1;t < len;t++)
		 {
			 if (str.charAt(t) != ' ')
			 {
				 break;
			 }
		 }
		 work(j, t);
	}
	}
	public static int Main()
	{

		int i;
		int j;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		work(0, 1);
	}

}

