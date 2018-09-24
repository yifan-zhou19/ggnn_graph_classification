import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[550]);
	 str = new Scanner(System.in).nextLine();
	 int length = str.length();
	 for (int i = 2;i <= length;i++)
	 {
	  for (int j = 0;j <= length - i;j++)
	  {
		   int flag = 1;
		for (int k = 0;flag && k < i / 2;k++)
		{
		  if (str.charAt(j + k) != str.charAt(j + i - 1 - k))
		  {
			 flag = 0;
		  }
		}
		if (flag != 0)
		{
			 for (int k = 0;k < i;k++)
			 {
			System.out.print(str.charAt(j + k));
			 }
		  System.out.print("\n");
		}
	  }
	 }
	 return 0;
	}

}
