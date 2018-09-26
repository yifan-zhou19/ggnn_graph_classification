import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static final int LEN = 301;

	public static int Main()
	{
		char[] ch1 = {0};
		char[] ch2 = {0};
		int[] an1 = new int[LEN];
		int[] an2 = new int[LEN];
		//memset(an1,0,sizeof(an1));
		//memset(an2,0,sizeof(an2));
		ch1 = new Scanner(System.in).nextLine();
		ch2 = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		for (i = ch1.length() - 1;i >= 0;i--)
		{
			an1[j++] = ch1[i] - '0';
		}
		j = 0;
		for (i = ch2.length() - 1;i >= 0;i--)
		{
			an2[j++] = ch2[i] - '0';
		}
		for (i = 0;i < LEN;i++)
		{
			an1[i] += an2[i];
			if (an1[i] >= 10)
			{
				an1[i] -= 10;
				an2[i + 1] += 1;
			}
		}
		int judge = 0;
		for (i = LEN - 1;i >= 0;i--)
		{
			if (an1[i] != 0)
			{
				for (;i >= 0;i--)
				{
					System.out.print(an1[i]);
				}
				System.out.print("\n");
				judge = 1;
				break;
			}
		}
		if (judge == 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		return 0;
	}

}
