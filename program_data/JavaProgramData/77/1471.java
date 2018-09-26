import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************
	//*???? 
	//********************************


	public static String a = new String(new char[110]);
	public static int[] a1 = new int[110];
	public static int l;
	public static char b;
	public static char g;

	public static void fi(int i)
	{
		int j;
		int k;
		for (j = i + 1; j < l; j++)
		{
			if (a.charAt(j) == g)
			{
				if (a1[j] == 0)
				{
					for (k = j - 1; k >= 0; k--)
					{
						if ((a.charAt(k) == b) && (a1[k] == 0))
						{
							System.out.print(k);
							System.out.print(" ");
							System.out.print(j);
							System.out.print("\n");
							a1[k] = 1;
							a1[j] = 1;
							break;
						}
					}
				}
			}
		}
		return;
	}

	public static int Main()
	{
		int i;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		b = a.charAt(0);
		for (i = 0; i < l; i++)
		{
			if (a.charAt(i) != b)
			{
				g = a.charAt(i);
				break;
			}
		}
		fi(-1);
		System.in.read();
		System.in.read(); //????
		return 0;
	}
}
