import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[500]);
		m = new Scanner(System.in).nextLine();
		int len;
		int f;
		len = m.length();
		for (int i = 2;i <= len;i++) //??
		{
			for (int j = 0;j <= len - i;j++) //?????
			{
				for (int q = j;q < i + j;q++) //q??????
				{
					f = i + j * 2; //???????? ?????????? ???????i j ????
					if (m.charAt(q) != m.charAt(f - q - 1))
					{
						break;
					}
					if ((q + 1) >= (f - q - 2))
					{
						for (int k = j;k < i + j;k++)
						{
							if (k == i + j - 1)
							{
								System.out.print(m.charAt(k));
								System.out.print("\n");
							}
							else
							{
								System.out.print(m.charAt(k));
							}
						}
						break;
					}
				}
			}
		}
				return 0;
	}
}
