package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
	   int m;
	   int i;
	   int j;
	   int k;
	   int len;
	   int x;
	   int y;
	   int n;
	   int h;
	   s = new Scanner(System.in).nextLine();
	   len = s.length();
	   for (n = 2;n <= len;n++)
	   {
	   for (i = 0;i <= len - n;i++)
	   {

	   for (k = i,j = i + n - 1;s.charAt(k) == s.charAt(j);k++,j--)
	   {
	   if (k >= j)
	   {
	   for (h = i;h < i + n;h++)
	   {
	   System.out.printf("%c",s.charAt(h));
	   }
	   System.out.print("\n");
	   break;
	   }
	   }
	   }



	   }

	}
}
