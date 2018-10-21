import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***************************
	//*????????        **
	//*????? 1300012921   **
	//*???2013.11.18        **
	//*************************** 
	public static int Main()

	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int j;
		int k;
		int n;
		int len1;
		int len2;
		int[] c = new int[103];
		int[] d = new int[103];
		int[] e = new int[103];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();

		for (k = 1; k <= n; k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(d,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(e,0,(Integer.SIZE / Byte.SIZE));
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			len1 = a.length();
			len2 = b.length();

			for (i = len1 - 1; i >= 0; i--)
			{
				c[len1 - i] = a.charAt(i) - '0';
			}

			for (i = len2 - 1; i >= 0; i--)
			{
				d[len2 - i] = b.charAt(i) - '0';
			}

			for (i = 1; i <= 101; i++)
			{
				if (c[i] >= d[i])
				{
					e[i] = c[i] - d[i];
				}
				else
				{
					e[i] = c[i] - d[i] + 10;
					c[i + 1] = c[i + 1] - 1;
				}
			}

			for (j = 101; j >= 1; j--) //????
			{
				if (e[j] != 0)
				{
					for (i = j; i >= 1; i--)
					{
						System.out.print(e[i]);
					}
					break;
				}
			}
			System.out.print("\n");
			System.in.read();
		}
		return 0;
	}
}

