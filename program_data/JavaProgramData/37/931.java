import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  System.in.read();
	  int i = 0;
	  while (i < n)
	  {
		i++;
		String a = new String(new char[100001]);
		a = new Scanner(System.in).nextLine();
		int j;
		int k;
		int l;
		l = a.length();
		final int l1 = l;
		int[] b = new int[l1];
		for (j = 0;j < l;j++)
		{
		  b[j] = 0;
		}
		for (j = 0;j < l;j++)
		{
		  for (k = 0;k < l;k++)
		  {
			if (a.charAt(j) == a.charAt(k))
			{
			  b[j]++;
			}
		  }
		}
		int t = 0;
		for (j = 0;j < l;j++)
		{
		  if (b[j] == 1)
		  {
			System.out.print(a.charAt(j));
			System.out.print("\n");
			t++;
			break;
		  }
		}
		if (t == 0)
		{
		  System.out.print("no");
		  System.out.print("\n");
		}
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}

}

