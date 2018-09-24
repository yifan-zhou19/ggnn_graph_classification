import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String in = new String(new char[501]);
		String zi = new String(new char[501]);
		in = new Scanner(System.in).nextLine();
		int L;
		int judge = 1;
		L = in.length();
		for (int i = 2;i <= L;i++)
		{
		  for (int j = 0;j <= L - i;j++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(zi,0,(Character.SIZE / Byte.SIZE));
				for (int k = j;k - j < i;k++)
				{
					zi = tangible.StringFunctions.changeCharacter(zi, k - j, in.charAt(k));
				}
				judge = 1;
				for (int k = 0;k < i / 2;k++)
				{
					if (zi.charAt(k) != zi.charAt(i - k - 1))
					{
					judge = 0;
					break;
					}
				}
				if (judge == 1)
				{
					System.out.print(zi);
					System.out.print("\n");
				}
		  }
		}
		return 0;
	}

}

