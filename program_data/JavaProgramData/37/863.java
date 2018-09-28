import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			String string = new String(new char[202]);
			String lu = new String(new char[30]);
			int j;
			int k;
			int p = 0;
			int w;
			int q;
			int t;
			int[] sum = new int[200];
			int x = 0;
			for (w = 0;w < 200;w++)
			{
				sum[w] = 0;
			}
			String = new Scanner(System.in).nextLine();
			for (j = 0;string.charAt(j) != '\0';j++)
			{
				t = (int)string.charAt(j);
				sum[t] = sum[t] + 1;
			}
			for (j = 0;string.charAt(j) != '\0';j++)
			{
			  t = (int)string.charAt(j);
			  if (sum[t] == 1)
			  {
				  x = x + 1;
			  System.out.print(String[j]);
			  System.out.print("\n");
			   break;
			  }
			}
			if (x == 0)
			{
			System.out.print("no");
			System.out.print("\n");
			}
		}
		System.in.read();
		return 0;
	}
}

