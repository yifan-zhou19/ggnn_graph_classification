import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		String str = new String(new char[200]);
		p = str;
		int i;
		int n;
		int j;
		int b = 0;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < n - 1;i++)
		{
			if (*(p.Substring(i)) == ' ')
			{
			  for (j = i + 1;j < n;j++)
			  {
				  if (*(p.Substring(j)) == ' ')
				  {
					b++;
				  }
				  else
				  {
					break;
				  }
			  }
			  i = i + b;
			  b = 0;
			}
			System.out.print((p.Substring(i)));
		}
		System.out.print((p.Substring(n) - 1));
		System.out.print("\n");
	}
}
