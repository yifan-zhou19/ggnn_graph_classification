import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ?????? ???1000010500 
	// ???? 
	// 2010-12-31

	public static void print(int n, String xulie, int m, int f)
	{
		int i;
		int j;
		for (i = 0;i <= n;i++)
		{
			if (xulie[i].equals(m))
			{
				for (j = i + 1;j <= n;j++)
				{
					if (xulie[j].equals('0')) // ?????????
					{
					   continue;
					}
					else if (xulie[j].equals(f))
					{
						xulie[i] = '0'; // ?????????'0'
						xulie[j] = '0';
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
						print(n, xulie, m, f); // ????
					}
					else
					{
						break;
					}
				}
			}
		}
		return;
	}
	public static int Main()
	{
		String xulie = new String(new char[100]); // m??????f?????
		char m;
		char f;
		int len;
		xulie = new Scanner(System.in).nextLine();
		len = xulie.length(); // ?????
		m = xulie.charAt(0);
		f = xulie.charAt(len - 1);
		print(len - 1, xulie, m, f);
		return 0;
	}


}
