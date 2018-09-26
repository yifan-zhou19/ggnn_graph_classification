import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			int j;
			int n1;
			String a = new String(new char[81]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,81);
			a = new Scanner(System.in).nextLine();
			n1 = a.length();
			if (n1 == 1)
			{
				if ((a.charAt(0) >= 'A' && a.charAt(0) <= 'z') || a.charAt(0) == '_')
				{
					System.out.print("1");
					System.out.print("\n");
				}
				else
				{
					System.out.print("0");
					System.out.print("\n");
				}
			}
			else
			{
				if ((a.charAt(0) >= 'A' && a.charAt(0) <= 'z') || a.charAt(0) == '_')
				{
					for (j = 1;a.charAt(j) != '\0';j++)
					{
					  if ((a.charAt(j) >= '0' && a.charAt(j) <= '9') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'z') || a.charAt(j) == '_')
					  {
						  continue;
					  }
						break;
					}
					if (j < n1)
					{
					  System.out.print("0");
					  System.out.print("\n");
					}
					if (j == n1)
					{
					System.out.print("1");
					System.out.print("\n");
					}
				}
				else
				{
				   System.out.print(0);
				   System.out.print("\n");
				}
			}




		}
		return 0;
	}
}

