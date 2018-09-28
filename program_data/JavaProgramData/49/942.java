import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		int j;
		int k;
		int len;
		int l;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (l = 2;l < len; l++) //??????2????
		{
			for (i = 0 ; i < len + 1 - l; i++)
			{
				for (j = i,k = 0;j <= i + l / 2; j++,k++)
				{
					if (a.charAt(j) != a.charAt(i + l - 1 - k))
					{
						break;
					}
				}
				if (j > i + l / 2)
				{
					for (j = i; j < i + l;j++)
					{
						System.out.print(a.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}
