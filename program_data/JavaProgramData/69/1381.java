import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int maxlen = 250;
		int[] an1 = new int[maxlen];
		int[] an2 = new int[maxlen];
		String seline1 = new String(new char[maxlen + 1]);
		String seline2 = new String(new char[maxlen + 1]);
		seline1 = new Scanner(System.in).nextLine();
		seline2 = new Scanner(System.in).nextLine();
		int nlen1 = seline1.length();
		int nlen2 = seline2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an2,0,(Integer.SIZE / Byte.SIZE));
		int i;
		int j = 0;
		for (i = nlen1 - 1;i >= 0;i--)
		{
			an1[j++] = seline1.charAt(i) - '0';
		}
		j = 0;
		for (i = nlen2 - 1;i >= 0;i--)
		{
			an2[j++] = seline2.charAt(i) - '0';
		}
		for (i = 0;i < maxlen;i++)
		{
			an1[i] += an2[i];
			if (an1[i] >= 10)
			{
				an1[i] -= 10;
				an1[i + 1]++;
			}
		}
		i = maxlen - 1;
		if (seline1.length() == 1 && seline1.charAt(0) == '0' && seline2.length() == 1 && seline2.charAt(0) == '0')
		{
			System.out.print(0);
		}
		else
		{
			while (an1[i] == 0)
			{
				i--;
			}
			for (;i >= 0;i--)
			{
				System.out.print(an1[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}
