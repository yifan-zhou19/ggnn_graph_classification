import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[100]);
	 int[][] c = new int[100][2];
	 int i;
	 int j;
	 int k;
	 int l;
	 a = new Scanner(System.in).nextLine();
	 l = a.length();
	 k = 0;
	 i = 0;
	for (i = 0;i < l;i++)
	{
		 if (a.charAt(i) != ' ' && (a.charAt(i + 1) == ' ' || a.charAt(i + 1) == '\0'))
		 {
			c[k][1] = i + 1;
		 k++;
		 }
	  if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
	  {
			c[k][0] = i + 1;
	  }
	}
	for (i = k - 1;i > 0;i--)
	{
		 for (j = c[i][0];j < c[i][1];j++)
		 {
	  System.out.print(a.charAt(j));
		 }
	  System.out.print(" ");
	}
	for (j = c[0][0];j < c[0][1];j++)
	{
	  System.out.print(a.charAt(j));
	}
	  System.in.read();
	  System.in.read();
	  System.in.read();
	return 0;
	}

}
