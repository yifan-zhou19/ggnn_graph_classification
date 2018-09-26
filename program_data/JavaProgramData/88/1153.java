import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0; //?????????
		int j;
		int s;
		int m;
		String c = new String(new char[31]); //??????c
		c = new Scanner(System.in).nextLine(); //??????
		m = c.length();
		for (i = 0;i < m;i++)
		{
			if (c.charAt(i) >= '0' && c.charAt(i) <= '9') //??????????
			{
				for (j = i;j < m;j++)
				{
					if (j + 1 <= m != 0 && (c.charAt(j) >= '0' && c.charAt(j) <= '9') && (c.charAt(j + 1) < '0' || c.charAt(j + 1)>'9')) //???????????????????
					{
						for (s = i;s <= j;s++)
						{
							System.out.print(c.charAt(s));
						}
						System.out.print("\n");
						i = j + 1;
						break;
					}
					if (j == m && (c.charAt(j) >= '0' && c.charAt(j) <= '9')) //???????????
					{
						for (s = i;s <= j;s++)
						{
							System.out.print(c.charAt(s));
						}
						System.out.print("\n");
						i = m;
						break;
					}

				}
			}
		}
		return 0;
	}





}
