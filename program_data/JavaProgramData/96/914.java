import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String bei0 = new String(new char[105]);
		int[] bei = new int[105];
		int[] shang = new int[105];
		int beichu;
		int yushu;
		int[] yu = new int[4];
		int i;
		int j;
		bei0 = new Scanner(System.in).nextLine();
		int n;
		n = bei0.length(); //?????????
		for (i = 0;i <= n - 1;i++)
		{
			bei[i + 1] = bei0.charAt(i) - '0'; //??char???????????int?,?bei[1]???
		}

		if (n == 1)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(bei[1]);
			System.out.print("\n");
		}

		else if (n == 2 && (bei[1] * 10 + bei[2] < 13))
		{
				System.out.print("0");
				System.out.print("\n");
			 System.out.print(bei[1] * 10 + bei[2]);
			 System.out.print("\n");
		}

		else
		{
		yu[1] = bei[0];
		yu[2] = bei[1];
		yu[3] = bei[2];

		for (i = 3;i <= n;i++)
		{
			beichu = yu[1] * 100 + yu[2] * 10 + yu[3];
			shang[i - 2] = beichu / 13;
			yushu = beichu % 13;
			if (yushu < 10)
			{
					yu[1] = 0;
					yu[2] = yushu;
			}
			else
			{
					yu[1] = 1;
					yu[2] = yushu % 10;
			}
			yu[3] = bei[i];
		}
		beichu = beichu = yu[1] * 100 + yu[2] * 10 + yu[3];
		shang[n - 1] = beichu / 13;
		yushu = beichu % 13;
		if (shang[1] == 0)
		{
			for (i = 2;i <= n - 1;i++)
			{
				System.out.print(shang[i]);
			}
		}
		else
		{
			for (i = 1;i <= n - 1;i++)
			{
			System.out.print(shang[i]);
			}
		}
		System.out.print("\n");
		System.out.print(yushu);
		System.out.print("\n");
		}
		return 0;
	}
}
