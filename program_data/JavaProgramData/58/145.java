import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n; //??????n????k?????i,j
	int k;
	int i;
	int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String c = new String(new char[81]); //???????
		c = new Scanner(System.in).nextLine(); //?????
		for (i = 1 ; i <= n ; i++)
		{ //????n????
			k = 1; //???k=1
			String c = new String(new char[81]);
			c = new Scanner(System.in).nextLine();
			if (((c.charAt(0) <= 'Z') && (c.charAt(0) >= 'A')) || ((c.charAt(0) <= 'z') && (c.charAt(0) >= 'a')) || (c.charAt(0) == '_'))
			{
				for (j = 1 ; j < (int)c.length() ; j++)
				{
					if (((c.charAt(j) <= 'Z') && (c.charAt(j) >= 'A')) || ((c.charAt(j) <= 'z') && (c.charAt(j) >= 'a')) || (c.charAt(j) == '_') || ((c.charAt(j) <= '9') && (c.charAt(j) >= '0')))
					{
						continue; //??????????????????????
					}
					else
					{ //???k=0?????
						k = 0;
						break;
					}
				}
			}
			else //???k=0
			{
				k = 0;
			}
			System.out.print(k);
			if (i != n)
			{
				System.out.print("\n");
			}
		}
		return 0; //????
	}

}

