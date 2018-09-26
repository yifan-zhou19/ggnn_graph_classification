import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		String a = new String(new char[120000]);
		int i;
		int j;
		int k;
		int c;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
		for (i = 1;i <= t;i++)
		{
		   a = new Scanner(System.in).nextLine();
		   c = a.length();
		   for (j = 0;j < c;j++)
		   {
			   if (a.charAt(j) == '1')
			   {
				   continue;
			   }
			   int x = 0;
			   for (k = j + 1;k < c;k++)
			   {
				   if (a.charAt(k) == a.charAt(j))
				   {
					   a = tangible.StringFunctions.changeCharacter(a, k, '1');
					   x++;
				   }
			   }
			   if (x == 0)
			   {
				   System.out.print(a.charAt(j));
				   System.out.print("\n");
				   break;
			   }


		   }
		   if (j == c)
		   {
			   System.out.print("no");
			   System.out.print("\n");
		   }

		}
		return 0;
	}
}

