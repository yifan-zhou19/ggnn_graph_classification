import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		int j;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		len = str.length();

		int[] space = new int[100];
		for (i = 0;i < 100;i++)
		{
			space[i] = len + 1;
		}
		int k = 0;
		for (i = 0;i <= len - 2;i++)
		{
			if (str.charAt(i) == ' ')
			{
						  if (str.charAt(i + 1) == ' ')
						  {
										  space[k] = i + 1;
										  k++;
						  }
			}
		}

		int[] s = new int[1000];
		int m;

		for (i = 0;i <= len - 1;i++)
		{
			j = 0;
			while ((space[j] != i) && (j < k))
			{
				  j++;
			}
			if (j == k)
			{
				s[i] = 1;
			}
			else
			{
				s[i] = 0;
			}
		}

	   for (i = 0;i <= len - 1;i++)
	   {
				if (s[i] == 0)
				{
						 ;
				}
				else
				{
					System.out.print(str.charAt(i));
				}
	   }

		return 0;
	}

}
