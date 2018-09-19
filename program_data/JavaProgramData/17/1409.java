import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		int[] b = new int[200];
		int n;
		int len;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			a = new Scanner(System.in).nextLine();
			len = a.length();
			for (int i = 0;i < len;i++)
			{
				System.out.print(a.charAt(i));
				switch (a.charAt(i))
				{
				case '(':
					b[i] = 1;
					break;
				case ')':
					b[i] = 2;
					break;
				default :
					b[i] = 3;
					break;
				}
			}
			System.out.print("\n");
			for (int i = 0;i < len;i++)
			{
				if (b[i] == 2)
				{
					for (int j = i;j >= 0;j--)
					{
						if (b[j] == 1)
						{
							b[j] = 3,b[i] = 3;
							break;
						}
					}
				}
			}
			for (int i = 0;i < len;i++)
			{
				if (b[i] == 1)
				{
					System.out.print('$');
				}
				else if (b[i] == 2)
				{
					System.out.print('?');
				}
				else
				{
					System.out.print(' ');
				}

			}
			System.out.print("\n");
		}



















		return 0;
	}
}

