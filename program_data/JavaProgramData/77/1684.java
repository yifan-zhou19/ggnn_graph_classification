import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[] b = new int[100];
		String a = new String(new char[100]);
		char l;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		l = a.charAt(0);
		for (i = 0;i < n;i++)
		{
			b[i] = i;
		}
			for (i = 0;;i++)
			{
			for (j = 0;j < n - 1;j++)
			{
				if (a.charAt(j) == l && a.charAt(j + 1) != l)
				{
					System.out.print(b[j]);
					System.out.print(" ");
					System.out.print(b[j + 1]);
					System.out.print("\n");
				   for (k = j + 2;k < n;k++)
				   {
					   b[j] = b[k];
					   a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(k));
					   j++;
				   }
				   n = n - 2;
				   break;
				}
			}
			if (n == 0)
			{
				break;
			}

			}
	}


}

