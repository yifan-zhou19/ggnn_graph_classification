import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String line = new String(new char[101]);
	  String label = new String(new char[101]);
	  int[] pos = new int[101];
	  int n;
	  int j;
	  int left;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.in.read();
	  for (j = 1 ;j <= n ;j++)
	  {
		   left = 0;

		   line = new Scanner(System.in).nextLine();
		   int len = line.length();
		   for (int i = 0 ;i <= 100 ; i++)
		   {
		   label = tangible.StringFunctions.changeCharacter(label, i, ' ');
		   }
		   for (int i = 0 ;i <= len - 1; i++)
		   {
					if (line.charAt(i) == '(')
					{
							left++;
							pos[left] = i;
					}
					   if (line.charAt(i) == ')')
					   {
								  if (left == 0)
								  {
									label = tangible.StringFunctions.changeCharacter(label, i, '?');
								  }
								   else
								   {
									left--;
								   }
					   }
		   }
		  for (int i = 1 ;i <= left ; i++)
		  {
			   label = tangible.StringFunctions.changeCharacter(label, pos[i], '$');
		  }
			   label = tangible.StringFunctions.changeCharacter(label, len, '\0');
			   System.out.print(line);
			   System.out.print("\n");
			   System.out.print(label);
			   System.out.print("\n");
	  }
	  return 0;
	}

}

