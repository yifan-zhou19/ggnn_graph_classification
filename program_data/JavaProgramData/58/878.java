import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String sen = new String(new char[100]);
		while (sen = new Scanner(System.in).nextLine())
		{
			flag = 0;
			i = 1;
			if (sen.charAt(0) != '_' && (sen.charAt(0) < 'a' || sen.charAt(0) >'z') && (sen.charAt(0) < 'A' || sen.charAt(0) >'Z'))
			{
				System.out.print(0);
				System.out.print("\n");
				flag = 1;
				continue;
			}
			else
			{
				while (sen.charAt(i) != '\0')
				{
					if (sen.charAt(i) != '_' && (sen.charAt(i) < 'a' || sen.charAt(i) >'z') && (sen.charAt(i) < 'A' || sen.charAt(i) >'Z') && (sen.charAt(i) < '0' || sen.charAt(i) >'9'))
					{
						System.out.print(0);
						System.out.print("\n");
						flag = 1;
						break;
					}
					i++;
				}
				if (flag == 0)
				{
					System.out.print(1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}










}

