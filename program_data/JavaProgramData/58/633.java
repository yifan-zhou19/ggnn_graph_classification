import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int flag;
		int i;
		int j;
		int m = 0;
		String c = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n ; i++)
		{
			c = new Scanner(System.in).nextLine();
			flag = 1;
			if ((c.charAt(0) == '_') || (c.charAt(0) >= 'a' && c.charAt(0) <= 'z') || (c.charAt(0) >= 'A' && c.charAt(0) <= 'Z'))
			{
			flag = 1;
			}
			else
			{
				flag = 0;
			}
			j = 1;
			while (c.charAt(j) != '\0')
			{
				 if ((c.charAt(j) >= 'a' && c.charAt(j) <= 'z') || (c.charAt(j) >= 'A' && c.charAt(j) <= 'Z') || (c.charAt(j) >= '0' && c.charAt(j) <= '9') || c.charAt(j) == '_')
				 {
				  m++; // ??????????,???????IF????
				 }
				 else
				 {
					 flag = 0;
				 }
				 j++;
			}
			 System.out.print(flag);
			 System.out.print("\n");
		}
		return 0;
	}





}

