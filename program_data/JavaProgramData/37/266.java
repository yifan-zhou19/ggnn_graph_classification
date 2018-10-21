import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int s = 0;
		int m = 0;
		int len;
		String str = new String(new char[100001]);
		int[] a = new int[100001];
		String result = new String(new char[1000]);
		int[] flag = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
			  str = new Scanner(System.in).nextLine();
			  len = str.length();
			  for (j = 0; j < len; j++)
			  {
					for (k = 0; k < len; k++)
					{
					   if (j == k)
					   {
					   continue;
					   }
						  if (str.charAt(k) == str.charAt(j))
						  {
									s++;
						  }
					}
					if (s == 0)
					{
						  result = tangible.StringFunctions.changeCharacter(result, i, str.charAt(j));
						  break;
					}
					else
					{
						  m++;
					}
					s = 0;
			  }
			  if (m == len)
			  {
				  flag[i] = 1;
			  }
			  m = 0;
		}
		for (i = 1; i <= n; i++)
		{
			  if (flag[i] == 1)
			  {
				  System.out.print("no");
				  System.out.print("\n");
			  }
			  else
			  {
				  System.out.print(result.charAt(i));
				  System.out.print("\n");
			  }
		}
		return 0;
	}
}

