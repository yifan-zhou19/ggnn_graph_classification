import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int tf;
		int num;
		String su = new String(new char[100000]);
		char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < t; i++)
		{
			su = new Scanner(System.in).nextLine();
			tf = 0;
			for (j = 0; j < 26 ; j++)
			{
				num = 0;
				for (k = 0; ; k++)
				{
					if (su.charAt(k) == ch[j])
					{
						num = num + 1;
					}
					if (su.charAt(k) == '\0')
					{
						break;
					}
				}
				if (num == 1)
				{
					System.out.print(ch[j]);
					System.out.print("\n");
					tf = 1;
					break;
				}
			}
			if (tf == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

