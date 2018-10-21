import java.util.*;

package <missing>;

public class GlobalMembers
{
	//shu ru fa huai le bu xie zhu shi le = =!
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int t = 0;
		int[][] number = new int[51][2];
		int n = 0;
		while (true)
		{
			if (str.charAt(n) == '\0')
			{
				break;
			}
			n++;
		}
		for (i = 0;i < n - 1;i++)
		{
			if (str.charAt(0) == '\0')
			{
				break;
			}
			if (str.charAt(i) == str.charAt(0))
			{
				for (j = i + 1;j < n;j++)
				{
					if (str.charAt(j) != str.charAt(0))
					{
						for (k = j;k >= 0;k--)
						{
							if (str.charAt(k) == str.charAt(0))
							{
								break;
							}
						}
						str = tangible.StringFunctions.changeCharacter(str, j, str[k] = '\0');
						number[t][0] = k;
						number[t++][1] = j;
					}
				}
			}
		}
		int d;
		for (i = 0;i < t - 1;i++)
		{
			for (j = i + 1;j < t;j++)
			{
				if (number[i][1] > number[j][1])
				{
					d = number[i][1];
					number[j][1] = number[i][1];
					number[i][1] = d;
					d = number[i][0];
					number[j][0] = number[i][0];
					number[i][0] = d;
				}
			}
		}
		for (i = 0;i < t;i++)
		{
			System.out.print(number[i][0]);
			System.out.print(" ");
			System.out.print(number[i][1]);
			System.out.print("\n");
		}
		return 0;
	}
}

