import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[35]);
		a = new Scanner(System.in).nextLine();
		int n;
		int i;
		int j;
		int[] m = new int[35];
		n = a.length();
		for (i = 0 ; i <= 34 ; i++)
		{
		m[i] = -1;
		}
		j = 0;
		for (i = 0 ; i <= n - 1 ; i++)
		{
			if (a.charAt(i) == '0' || a.charAt(i) == '1' || a.charAt(i) == '2' || a.charAt(i) == '3' || a.charAt(i) == '4' || a.charAt(i) == '5' || a.charAt(i) == '6' || a.charAt(i) == '7' || a.charAt(i) == '8' || a.charAt(i) == '9')
			{
					if (m[j] == -1)
					{
					m[j] = (m[j] + 1) * 10 + a.charAt(i) - '0';
					}
					else
					{
					m[j] = m[j] * 10 + a.charAt(i) - '0';
					}
			}
			else
			{
			j++;
			}
		}
		for (i = 0 ; i <= j ; i++)
		{
			if (m[i] != -1)
			{
			System.out.print(m[i]);
			System.out.print("\n");
			}
		}
			return 0;
	}

}
