import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		String b = new String(new char[105]);
		int[] na = new int[105];
		int[] nb = new int[105];
		int n;
		int i;
		int j;
		int k;
		int lena;
		int lenb;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(na, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(nb, 0, (Integer.SIZE / Byte.SIZE));
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			lena = a.length();
			lenb = b.length();
			for (j = 0; j <= lena - 1; j++)
			{
				na [j] = a.charAt (lena - j - 1) - '0';
			}
			for (j = 0; j <= lenb - 1; j++)
			{
				nb [j] = b.charAt (lenb - j - 1) - '0';
			}
			for (j = 0; j <= lena - 1; j++)
			{
				na[j] = na [j] - nb [j];
				if (na [j] < 0)
				{
					na [j] = na [j] + 10;
					na [j + 1] = na [j + 1] - 1;
				}
			}
			j = 102;
			while (na[j] == 0)
			{
				j--;
			}
			for (; j >= 0; j--)
			{
				if (j != 0)
				{
					System.out.print(na[j]);
				}
				else
				{
					System.out.print(na[j]);
					System.out.print("\n");
				}
			}
			System.in.read();
		}
		return 0;
	}
}

