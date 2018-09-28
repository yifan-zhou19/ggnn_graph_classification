import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int n;
		int m;
		int[] b = new int[100000];
		int[] c = new int[26];
		String a = new String(new char[100000]);
		char out;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < t;i++)
		{
			a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c,0,(Integer.SIZE / Byte.SIZE));
			m = j = 0;
			while (a.charAt(j) != '\0')
			{
				j++;
			}
			n = j;
			for (j = 0;j < n;j++)
			{
				b[j] = a.charAt(j) - 97;
				c[b[j]]++;
			}
			for (j = 0;j < n;j++)
			{
				if (c[b[j]] == 1)
				{
					out = b[j] + 97;
					System.out.print(out);
					System.out.print("\n");
					m = 1;
					break;
				}
			}
			if (m == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

