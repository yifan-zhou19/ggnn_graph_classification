import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int l;
		int flag;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
			flag = 1;
			String str = new String(new char[81]);
			str = new Scanner(System.in).nextLine();
			if (!(str.charAt(0) >= 'A' && str.charAt(0) <= 'z') && (str.charAt(0) != '_'))
			{
			   flag = 0;
			}
			l = str.length();
			if (flag != 0)
			{
				 for (j = 0; j < l;j++)
				 {
					 if (str.charAt(j) >= 'A' && str.charAt(j) <= 'z')
					 {
						flag = 1;
					 }
					 else if (str.charAt(j) >= '0' && str.charAt(j) <= '9')
					 {
							 flag = 1;
					 }
						  else if (str.charAt(j) == '_')
						  {
								  flag = 1;
						  }
							   else
							   {
								   flag = 0;
								   break;
							   }
				 }
			}
			System.out.print(flag);
			System.out.print("\n");
		}
		return 0;
	}
}

