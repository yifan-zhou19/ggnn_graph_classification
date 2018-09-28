import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[99]);
		int n = 0;
		int[] b = new int[99];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			if ((a.charAt(0) == '_') || (a.charAt(0) == ' ') || (a.charAt(0) == 32) || ((a.charAt(0) >= 65) && (a.charAt(0) <= 90)) || ((a.charAt(0) >= 97) && (a.charAt(0) <= 122)))
			{
			   b[i] = 1;
			}
			for (int j = 0;j < a.length();j++)
			{
			   if (a.charAt(j) == ' ')
			   {
				  b[i] = 0;
			   }
			}
			   for (int m = 0;m < a.length();m++)
			   {
				  if (!(((a.charAt(m) >= 65) && (a.charAt(m) <= 97)) || ((a.charAt(m) >= 97) && (a.charAt(m) <= 122)) || ((a.charAt(m) >= 48) && (a.charAt(m) <= 57)) || (a.charAt(m) == ' ')))
				  {
				   b[i] = 0;
				  }
			   }
		}
		for (int k = 0;k < n;k++)
		{
		   System.out.print(b[k]);
		   System.out.print("\n");
		}
		return 0;
	}

}

