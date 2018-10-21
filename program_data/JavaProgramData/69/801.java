import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int[] a1 = new int[502];
		int[] b1 = new int[502];
		int[] result = new int[502];
		int length1 = 0;
		int length2 = 0;
		int i = 0;
		int j = 0;
		int length = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		length1 = a.length();
		length2 = b.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result, 0,(Integer.SIZE / Byte.SIZE));
		for (i = 0; i <= length1 - 1; i++)
		{
			a1[i] = (int)a.charAt(length1 - 1 - i) - (int)'0';
		}
		for (i = 0; i <= length2 - 1; i++)
		{
			b1[i] = (int)b.charAt(length2 - 1 - i) - (int)'0';
		}
		for (i = 0; i <= 500; i++)
		{
			result[i] = a1[i] + b1[i] + result[i];
			if (result[i] > 9)
			{
				result[i] = result[i] - 10;
				result[i + 1]++;
			}
		}
		for (i = 500; i >= 0; i--)
		{
			if (result[i] != 0)
			{
				break;
			}
		}
		if (i != 0)
		{
			for (j = i; j >= 0; j--)
			{
				System.out.print(result[j]);
			}
		}
		if (i == -1)
		{
			System.out.print(0);
		}
		System.out.print("\n");
		return 0;
	}
}
