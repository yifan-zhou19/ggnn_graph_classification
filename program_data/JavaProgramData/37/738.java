import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int jj;
		int flag;
		int k = 0;
		String a = new String(new char[100000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < t;i++)
		{
			k = 0;
			a = new Scanner(System.in).nextLine();
			for (j = 0;j < a.length();j++)
			{
				flag = 1;
				for (jj = 0;jj < a.length();jj++)
				{
					if ((a.charAt(j) == a.charAt(jj)) && (j != jj))
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					System.out.print(a.charAt(j));
					System.out.print("\n");
					k = 1;
					break;
				}
			}
			if (k == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Character.SIZE / Byte.SIZE));
		}
		return 0;
	}

}

