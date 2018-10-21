import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int MAX_LENTH = 250; //???????????MAX_LENTH????250.
		int[] an1 = new int[MAX_LENTH]; //?????????????
		int[] an2 = new int[MAX_LENTH];
		String seLine1 = new String(new char[MAX_LENTH + 1]); //????????
		String seLine2 = new String(new char[MAX_LENTH + 1]);
		seLine1 = new Scanner(System.in).nextLine();
		seLine2 = new Scanner(System.in).nextLine(); //?????????????
		int len1 = seLine1.length(); //?????
		int len2 = seLine2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an2,0,(Integer.SIZE / Byte.SIZE)); //?????0,??????
		int i;
		int j = 0;
		for (i = len1 - 1;i >= 0;i--)
		{
			an1[j++] = seLine1.charAt(i) - '0';
		} //???????????????
		j = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
			an2[j++] = seLine2.charAt(i) - '0';
		} //???????????????
		for (i = 0;i < MAX_LENTH;i++)
		{
			an1[i] += an2[i]; //??????
			if (an1[i] >= 10)
			{
				an1[i] -= 10;
				an1[i + 1]++;
			}
		} //??
		i = MAX_LENTH - 1;
		while (an1[i] == 0)
		{
			i--;
		} //???????0??
		if (i < 0)
		{
			System.out.print(0);
		} //?????0 0???
		else
		{
			for (;i >= 0;i--)
			{
				System.out.print(an1[i]);
			}
		} //????
		System.out.print("\n");
		return 0;
	}
}
