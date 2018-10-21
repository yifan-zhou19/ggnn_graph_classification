import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10000]);
		char[][] a = new char[1000][1000];
		str = new Scanner(System.in).nextLine();
		int n;
		int i;
		int k = 0;
		int l = 0;
		int s;
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) == ' ')
			{
				k++;
				l = 0;
			}
			else
			{
				a[k][l] = str.charAt(i);
				l++;
			}
		}
		for (s = k;s > 0;s--)
		{
				System.out.print(a[s]);
				System.out.print(" ");
		}
	   System.out.print(a[0]);
	   System.out.print("\n");
		return 0;
	}

}
