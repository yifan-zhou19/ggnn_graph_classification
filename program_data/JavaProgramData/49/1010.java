import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String str = new String(new char[500]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		for (j = 2; j <= len; j++)
		{
			 for (i = 0; i <= len - j; i++)
			 {
				  for (k = 0; k < j / 2; k++)
				  {
					   if (str.charAt(i + k) != str.charAt(i + j - k - 1))
					   {
						   break;
					   }
				  }
				  if (k == j / 2)
				  {
					  for (int ii = i; ii < i + j; ii++)
					  {
						   System.out.print(str.charAt(ii));
					  }
					  System.out.print("\n");
				  }
			 }
		}
		return 0;
	}

}
