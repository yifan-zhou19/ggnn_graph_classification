import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		int[] b = new int[110];
		int[] c = new int[110];
		char s1;
		char s2;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int q = 0;
		a = new Scanner(System.in).nextLine(); //??
		n = a.length();
		s1 = a.charAt(0);
		for (i = 1;i < n;i++)
		{
			if (a.charAt(i) != a.charAt(0))
			{
				s2 = a.charAt(i);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == s2) //?????????
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (a.charAt(j) == s1) //??????
					{
						break;
					}
				}
				b[q] = j;
				c[q] = i; //??
				q = q + 1;
				a = tangible.StringFunctions.changeCharacter(a, i, '\0');
				a = tangible.StringFunctions.changeCharacter(a, j, '\0'); //??
			}

		}
		for (k = 0;k < q;k++)
		{
			System.out.print(b[k]);
			System.out.print(" ");
			System.out.print(c[k]);
			System.out.print("\n");
		}
		return 0;
	}

}

