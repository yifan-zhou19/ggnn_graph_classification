package <missing>;

public class GlobalMembers
{
	public static String ch = new String(new char[1000]);
	public static char a;
	public static char b;
	public static int len;
	public static void pick(int m, int n)
	{
		 if (n - m == 1) //????????????????
		 {
			 System.out.print(m);
			 System.out.print(" ");
			 System.out.print(n);
			 System.out.print("\n");
		 }
		 else
		 {
			 int len1 = 0;
			 int len2 = 0;
			 int i = 0;
			 int k;
			 for (i = m ; i <= n ; i++)
			 {
				  k = i;
				  if (ch.charAt(i) == a)
				  {
					  len1++;
				  }
				  else
				  {
					  len2++;
				  }
				  if (len1 == len2)
				  {
					  if (k < n) //??len1?len2???k < n??k???k??????
					  {
						  pick(m, m + 2 * len1 - 1); //??????????
						  pick(m + 2 * len1, n);
					  }
					  else if (k = n) //??len1?len2???k = n????????????
					  {
						   pick(m + 1, n - 1); //??????????????????????
						   System.out.print(m);
						   System.out.print(" ");
						   System.out.print(n);
						   System.out.print("\n");
					  }
					  break;
				  }
			 }
		 }
	}
	public static int Main()
	{
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = ch.length();
		a = ch.charAt(0);
		b = ch.charAt(len - 1);
		pick(0, len - 1);
		return 0;
	}

}

