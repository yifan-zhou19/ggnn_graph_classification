import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String zheng = new String(new char[100]);
		int[] shang = new int[100];
		int yushu;
		zheng = new Scanner(System.in).nextLine();
		int len = zheng.length();
		yushu = zheng.charAt(0) - '0';
		if (len == 1)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(yushu);
			System.out.print("\n");
		}
		else
		{
			if (len == 2 && yushu * 10 + zheng.charAt(1) - '0' < 13)
			{
				System.out.print(0);
				System.out.print("\n");
				System.out.print(yushu * 10 + zheng.charAt(1) - '0');
				System.out.print("\n");
			}
			else
			{
				if (yushu * 10 + zheng.charAt(1) - '0' < 13)
				{
					yushu = yushu * 10 + zheng.charAt(1) - '0';
					j = 0;
					for (i = 2; i < len; i++)
					{
						 shang[j++] = (yushu * 10 + zheng.charAt(i) - '0') / 13;
						 yushu = (yushu * 10 + zheng.charAt(i) - '0') % 13;
					}
					for (i = 0; i < j; i++)
					{
						 System.out.print(shang[i]);
					}
					System.out.print("\n");
					System.out.print(yushu);
				}
				else
				{
					j = 0;
					for (i = 1; i < len; i++)
					{
						shang[j++] = (yushu * 10 + zheng.charAt(i) - '0') / 13;
						 yushu = (yushu * 10 + zheng.charAt(i) - '0') % 13;
					}
					for (i = 0; i < j; i++)
					{
						 System.out.print(shang[i]);
					}
					System.out.print("\n");
					System.out.print(yushu);
				}
			}
		}
		return 0;
	}


}
