import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void subtract()
	{
		String str1 = new String(new char[maxlen + 1]);
		String str2 = new String(new char[maxlen + 1]);
		int[] a1 = new int[maxlen];
		int[] a2 = new int[maxlen];
		int len1;
		int len2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a2,0,(Integer.SIZE / Byte.SIZE));
		str1 = new Scanner(System.in).nextLine(); //???????
		str2 = new Scanner(System.in).nextLine();
		len1 = str1.length();
		len2 = str2.length();
		int i;
		int j;
		for (i = 0,j = len1 - 1;j >= 0;j--) //????????????,??????,??????????
		{
			a1[i++] = str1.charAt(j) - '0';
		}
		for (i = 0,j = len2 - 1;j >= 0;j--)
		{
			a2[i++] = str2.charAt(j) - '0';
		}
		for (i = 0;i < maxlen;i++)
		{
			if (a1[i] >= a2[i])
			{
				a1[i] = a1[i] - a2[i];
			}
			else
			{
				a1[i + 1] = a1[i + 1] - 1;
				a1[i] = a1[i] + 10 - a2[i];
			}
		}
		i = maxlen - 1; //?????????????0??,?????
		while (a1[i] == 0)
		{
			i--;
		}
		for (j = i;j >= 0;j--)
		{
			System.out.print(a1[j]);
		}
		System.out.print("\n");
	}
	public static final int maxlen = 100;
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			subtract();
			System.in.read();
		}
		return 0;
	}
}

