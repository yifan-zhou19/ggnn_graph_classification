import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[1000]);
		s1 = new Scanner(System.in).nextLine();
		char[][] s2 = new char[300][100];
		int i;
		int j;
		int l = 0;
		int n = 0;
		int len;
		len = s1.length();
		for (i = 0;i <= len;i++)
		{
			if (s1.charAt(i) != ' ' && s1.charAt(i) != '\0')
			{
				s2[l][n] = s1.charAt(i);
				n++;
			}
			if (s1.charAt(i) == ' ' || s1.charAt(i) == '\0')
			{
				s2[l][n] = '\0';
				l++;
				n = 0;
			}
		}
		int[] sz = new int[300];
		for (j = 0;j < l;j++)
		{
			sz[j] = String.valueOf(s2[j]).length();
			if (sz[j] != 0)
			{
			System.out.print(sz[j]);
			if (j < l - 1)
			{
				System.out.print(",");
			}
			}
		}






		return 0;
	}


}
