import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*********************
	//* ??? ????   *
	//* 1200012878 ??? *
	//* 1?2?            *
	//*********************
	public static int Main()
	{
		String a = new String(new char[257]); // ???????????????
		String b = new String(new char[257]);
		String c = new String(new char[256]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine(); // ????
		int len1 = a.length(); // ??????????
		int len2 = b.length();
		int len3 = c.length();
		int i;
		int j;
		int count;
		int flag = -1;
		int m;
		for (i = 0; i <= len1 - 1; i++)
		{
			m = 0;
			if (a.charAt(i) == b.charAt(m))
			{
				count = 0;
				for (j = i; j <= i + len2 - 1; j++)
				{
					if (a.charAt(j) == b.charAt(m++))
					{
						count++;
					}
				} // ?????????????
				if (count == len2)
				{
					flag = i;
					break;
				} // ????????????
			}
		}
		if (flag == -1)
		{
			System.out.print(a);
		}
		else
		{
			for (i = flag; i <= flag + len2 - 1; i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, c.charAt(i - flag));
			}
			for (i = 0; i <= len1 - 1; i++)
			{
				System.out.print(a.charAt(i));
			}
		}
		return 0;
	}
}

