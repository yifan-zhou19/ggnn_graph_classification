import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a1[300],b1[300];
		int[] a1 = new int[300];
		int[] b1 = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b1, 0,(Integer.SIZE / Byte.SIZE));
		int i;
		int j = 0;
		int k;
		int l;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int len1 = a.length();
		int len2 = b.length();
		for (i = len1 - 1;i >= 0;i--)
		{
			a1[j] = a.charAt(i) - '0';
			j++;
		}
		j = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
			b1[j] = b.charAt(i) - '0';
			j++;
		}
		for (i = 0;i < 250;i++)
		{
			a1[i] = a1[i] + b1[i];
			if (a1[i] >= 10)
			{
				a1[i] = a1[i] - 10;
				a1[i + 1]++;
			}
		}
		j = 251;
		while (a1[j] == 0 && j > 0)
		{
			j--;
		}
		for (i = j;i >= 0;i--)
		{
			System.out.print(a1[i]);
		}
		System.out.print("\n");
		return 0;
	}
}
