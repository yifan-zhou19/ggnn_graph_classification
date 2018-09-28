import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***************************
	//*?????? 1300012809 **
	//*???2013-12-13        **
	//*???n-gram????    **
	//***************************
	public static int Main()
	{
		int n; //????
		int i;
		int j;
		int k;
		int changdu;
		int max1 = 0;
		int[] jishu = new int[550];
		String p = null; //????
		String c = new String(new char[550]);
		char[][] bz = new char[550][550];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //????
		c = new Scanner(System.in).nextLine(); //?????
		changdu = c.length(); //???????
		for (i = 0; i < 550; i++)
		{
			jishu[i]++; //???????1
		}
		for (i = 0; i <= changdu - n; i++)
		{
			for (j = 0.0; j <= n - 1; j++)
			{
				bz[i][j] = c.charAt(i + j); //????????bz???
			}
		}
		for (i = 0; i <= changdu - n; i++)
		{
			for (j = n; j <= 449; j++)
			{
				bz[i][j] = 0; //?????????�\0�
			}
		}
		for (i = 0; i <= changdu - n; i++)
		{
			for (j = i + 1; j <= changdu - n; j++)
			{
				if (strcmp(bz[i], bz[j]) == 0)
				{
					jishu[i]++; //?????????????
				}
			}
			if (jishu[i] > max1)
			{
				max1 = jishu[i]; //???????
			}
		}
		p = bz[0];
		if (max1 > 1)
		{
			System.out.print(max1);
			System.out.print("\n");
			for (i = 0; i <= changdu - n; i++)
			{
				if (jishu[i] == max1)
				{
					for (j = 0; j < n; j++)
					{
						System.out.print((p.Substring(j)));
					}
					System.out.print("\n");
				}
				p = bz[i + 1]; //????????
			}
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}


		return 0;
	}
}

