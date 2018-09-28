import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char[][] b = new char[20][10];
		int i;
		int j;
		int k;
		int t = 0;
		int sign = 0;

		for (i = 0;i <= 20;i++)
		{
			  for (j = 0;j <= 10;j++)
			  {
					b[i][j] = '\0';
			  }
		}

		a = new Scanner(System.in).nextLine();
		for (j = 0;sign != 1;j++)
		{
			  for (k = 0, i = t;a.charAt(i) != ' ';k++, i++)
			  {
					if (a.charAt(i) == '\0')
					{
							sign = 1;
							break;
					}
					b[j][k] = a.charAt(i);
			  }
			  t = i + 1;
		}

		for (i = 10;i > 0;i--)
		{
			  if (b[i][0] != '\0')
			  {
			  System.out.print(b[i]);
			  System.out.print(" ");
			  }
		}
		System.out.print(b[0]);

		return 0;
	}
}
