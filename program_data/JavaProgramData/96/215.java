import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		int[] num = new int[101];
		int i;
		int j;
		for (i = 0; i < str.length(); i++)
		{
			num[i] = str.charAt(i) - '0';
		}
		int[] num1 = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num1, 0, (Integer.SIZE / Byte.SIZE));
		for (i = 0; i < str.length() - 1; i++)
		{
			num1[i] = (num[i] * 10 + num[i + 1]) / 13;
			num[i + 1] = (num[i] * 10 + num[i + 1]) % 13;
		}
		j = 0;
		if (num1[j] == 0)
		{
			j = 1;
		}
		for (; j < i ; j++)
		{
			System.out.print(num1[j]);
		}
		if (str.length() <= 2 && num1[0] == 0)
		{
			System.out.print(0);
		}
		System.out.print("\n");
		System.out.print(num[str.length() - 1]);
		System.out.print("\n");
		return 0;
	}


}
