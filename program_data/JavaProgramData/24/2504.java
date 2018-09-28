import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int l = 10;
		int t;
		int i;
		int j;
		int k;
		String str = new String(new char[200]);
		str = new Scanner(System.in).nextLine();
		k = str.length();
		for (i = 0 ; i < k ; i++)
		{
			if (str.charAt(i) != ' ')
			{
				m++;
			}
			else
			{
				if (m > n)
				{
					n = m;
					t = i;
				}
				m = 0;
			}
		}
		m = 0;
		for (j = k - 1 ; j >= 0 ; j--)
		{
			if (str.charAt(j) != ' ')
			{
				m++;
			}
			else
			{
				break;
			}
		}
		if (m > n)
		{
			n = m;
			t = k;
		}
		for (i = t - n ; i < t ; i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.print("\n");
		m = 0;
		for (i = 0 ; i < k ; i++)
		{
			if (str.charAt(i) != ' ')
			{
				m++;
			}
			else
			{
				if ((m < l) && (m != 0))
				{
					l = m;
					t = i;
				}
				m = 0;
			}
		}
		if (m < l)
		{
			for (j = k - m ; j < k ; j++)
			{
				System.out.print(str.charAt(j));
			}
		}
		else
		{
			for (i = t - l; i < t ; i++)
			{
				System.out.print(str.charAt(i));
			}
		}
		return 0;
	}

}
