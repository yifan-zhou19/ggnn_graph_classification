import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int[] b = new int[200];
		int len1;
		int len2;
		int n;
		int k;
		String str1 = new String(new char[200]);
		String str2 = new String(new char[200]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			System.in.read();
			str1 = new Scanner(System.in).nextLine();
			str2 = new Scanner(System.in).nextLine();
			len1 = str1.length();
			len2 = str2.length();
			k = 0;
			for (int j = len1 - 1;j >= 0;j--)
			{
				a[k] = str1.charAt(j) - '0';
				k++;
			}
			k = 0;
			for (int j = len2 - 1;j >= 0;j--)
			{
				b[k] = str2.charAt(j) - '0';
				k++;
			}
			for (int j = 0;j < len1;j++)
			{
				a[j] = a[j] - b[j];
				if (a[j] < 0)
				{
					a[j] = a[j] + 10;
					a[j + 1]--;
				}
			}
			for (int j = len1 - 1;j >= 0;j--)
			{
				System.out.print(a[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}




}

