import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String line = new String(new char[100]);
		int i;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();

		while (n-- != 0)
		{
			line = new Scanner(System.in).nextLine();
			if (line.charAt(0) != '_' && (line.charAt(0) > 'z' || line.charAt(0) < 'a') && (line.charAt(0)>'Z' || line.charAt(0) < 'A'))
			{
				System.out.print("0");
				System.out.print("\n");
				continue;
			}
		//	cout<<"line="<<line<<endl;
			int len = line.length();
			for (i = 1;i < len;i++)
			{
				if (line.charAt(i) != '_' && (line.charAt(i) > 'z' || line.charAt(i) < 'a') && (line.charAt(i)>'Z' || line.charAt(i) < 'A') && (line.charAt(i) < '0' || line.charAt(i)>'9'))
				{
					System.out.print("0");
					System.out.print("\n");
					break;
				}
			}
			if (i == len)
			{
				System.out.print("1");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

