import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		int j;
		int[] c = new int[600];
		int max = 0;
		String a = new String(new char[600]);
		String p;
		char[][] b = new char[600][5];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //????
		p = a;
		p = new Scanner(System.in).nextLine();
		len = p.length();
		for (i = 0;i <= len - n;i++) //?????n????????????b?
		{
			for (j = 1;j <= n;j++)
			{
				b[i][j] = (p.Substring(i) + j - 1);
			}
		}
		for (i = 0;i < len - n;i++)
		{
			for (j = i + 1;j <= len - n;j++) //?????????????n?????
			{
				for (int k = 1;k <= n;k++) //?????????????
				{
					if (b[i][k] - b[j][k] != 0)
					{
					break;
					}
					if (k == n) //????????????????c????
					{
					c[i]++;
					}
				}
			}
		}
		for (i = 0;i <= len - n;i++)
		{
			if (c[i] > max)
			{
			max = c[i];
			}
		}
		if (max == 0) //??c??????????????????1?????0???NO
		{
		System.out.print("NO");
		}
		else
		{
			System.out.print(max + 1);
			System.out.print("\n");
			for (i = 0;i <= len - n;i++)
			{
				if (c[i] == max) //?????????max????????
				{
						 for (j = 1;j <= n;j++)
						 {
							 if (j == n)
							 {
							 System.out.print(b[i][j]);
							 System.out.print("\n");
							 }
							 else
							 {
							 System.out.print(b[i][j]);
							 }
						 }
				}
			}
		}
		return 0;
	}

}

