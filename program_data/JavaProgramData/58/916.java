import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
	 int n;
	 int i = 0;
	 int j = 0;
	 int k = 0;
	 int l;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.in.read();
	 for (i = 0;i < n;i++)
	 {
		a[i] = new Scanner(System.in).nextLine();

	 if (a[i][0] == '_' || (a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z'))
	 {
		  l = String.valueOf(a[i]).length();
		  k = 0;
		for (j = 0;j < l;j++)
		{
		  if (a[i][j] == '_' || (a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= '0' && a[i][j] <= '9'))
		  {
		 k++;
		  }
		}
	if (k == l)
	{
	 System.out.print("1");
	 System.out.print("\n");
	}
	else
	{
		System.out.print("0");
		System.out.print("\n");
	}
	 }
	else
	{
		System.out.print("0");
		System.out.print("\n");
	}
	 }
	return 0;
	}

}

