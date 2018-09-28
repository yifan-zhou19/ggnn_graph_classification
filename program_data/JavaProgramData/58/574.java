import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int g = 0;
		int h = 1;
		int l = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		char[][] a = new char[1000][88];
		for (i = 1;i <= n;i++)
		{
		   a[i] = new Scanner(System.in).nextLine();
		   if (((a[i][0] >= 'a') && (a[i][0] <= 'z')) || ((a[i][0] >= 'A') && (a[i][0] <= 'Z')) || (a[i][0] == '_'))
		   {
		   g = 1;
		   }
		   l = String.valueOf(a[i]).length();
		   for (k = 1;k < l;k++)
		   {
			  if (!(((a[i][k] >= 'a') && (a[i][k] <= 'z')) || ((a[i][k] >= 'A') && (a[i][k] <= 'Z')) || ((a[i][k] >= '0') && (a[i][k] <= '9')) || (a[i][k] == '_')))
			  {
				 h = 0;
				 break;
			  }
		   }
		   if ((g == 1) && (h == 1))
		   {
		   System.out.print("1");
		   System.out.print("\n");
		   }
		   else
		   {
		   System.out.print("0");
		   System.out.print("\n");
		   }
		   h = 1;
		   g = 0;
		}
		return 0;
	}
}

