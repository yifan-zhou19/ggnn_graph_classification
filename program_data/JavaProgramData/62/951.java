import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();
		int L = a.length();
		String p = a;
		int num = 0;
		for (int i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) == ' ' && *(p.Substring(i) + 1) == ' ')
			{
				for (int j = i;j < L - 1 - num;j++)
				{
				*(p.Substring(j)) = *(p.Substring(j) + 1);
				}
				i--;
				num++;
			}
		}
		for (int i = 0;i < L - num;i++)
		{
		 System.out.print((p.Substring(i)));
		}
	   System.out.print("\n");
		return 0;
	}

}
