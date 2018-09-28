import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[500]);
	  a = new Scanner(System.in).nextLine();
	  int i;
	  int j;
	  int k = 1;
	  int l;
	  l = a.length();
	  while (k < l)
	  {

		for (i = 0,j = k; j < l; i++,j++)
		{
				int begin = i;
				int end = j;
				while (begin < end)
				{
					if (a.charAt(begin) != a.charAt(end))
					{
						break;
					}
					else
					{
						begin++;
						end--;
					}
				}
				if (begin >= end)
				{
					int print = i;
					for (print; print <= j; print++)
					{
						System.out.print(a.charAt(print));
					}
					System.out.print("\n");
				}
		}
		k++;
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}

}
