import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String shu = new String(new char[101]);
		int[] num = new int[101];
		int[] result = new int[101];
		int i;
		int j;
		int yushu;
		int flag = 0;
		shu = new Scanner(System.in).nextLine();
		for (i = 0; shu.charAt(i) != '\0'; i++)
		{
		  num[i] = shu.charAt (i) - '0';
		}






			for (i = 0; shu.charAt(i) != '\0'; i++)
			{
			result[i] = num[i] / 13;
			num [i + 1] = num [i + 1] + (num[i] % 13) * 10;
			}
		yushu = num[i - 1] % 13;


			for (j = 0; shu.charAt(j) != '\0';j++)
			{
			if (result[j] != 0)
			{
			flag = 1;
			break;
			}
			}
			if (flag != 0)
			{

	for (;shu.charAt(j) != '\0'; j++)
	{
			System.out.print(result[j]);
	}
			}
	else
	{
		System.out.print("0");
		System.out.print("\n");
	}
	System.out.print("\n");
	System.out.print(yushu);
	System.out.print("\n");
				return 0;
	}
}
