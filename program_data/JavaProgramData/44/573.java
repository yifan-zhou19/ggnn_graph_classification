import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void ff(char str[],int x);
		int i;
		int k;
		int fff;
		String str = new String(new char[1000]);
		for (fff = 1;fff <= 6;fff++)
		{
		  str = new Scanner(System.in).nextLine();
		  k = str.length();

		  int v = 0;

		  for (i = k - 1;i >= 0;i--)
		  {
			   if (str.charAt(i) == '0')
			   {
				   v++;
			   }

			   else
			   {
				   break;
			   }
		  }


		  if (v == k)
		  {
			 System.out.print(0);
		  }
		  else if (v == k - 1 && str.charAt(0) == '-')
		  {
				 System.out.print(0);
				 System.out.print("\n");
		  }
		  else
		  {
			  for (i = k - 1;i >= 1;i--)
			  {
				  if (str.charAt(i) == '0' && str.charAt(i - 1) == '0')
				  {
					  str = tangible.StringFunctions.changeCharacter(str, i, 0,str[i - 1] = 0);
					  i--;
				  }
			  else if (str.charAt(i) == '0' && str.charAt(i - 1) != '0')
			  {
						str = str.substring(0, i);
						break;
			  }
			  else
			  {
				  break;
			  }
			  }


			  k = str.length();
			  str = tangible.StringFunctions.changeCharacter(str, k, 'a');
			  str = str.substring(0, k + 1);


			  if (str.charAt(0) != '-')
			  {
				  ff(str, 0);
			  }
			  else
			  {
				  System.out.print("-");
				  for (i = 0;i <= k - 2;i++)
				  {
					 str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i + 1));
				  }
				  str = tangible.StringFunctions.changeCharacter(str, k - 1, 'a');
				  str = str.substring(0, k + 1);
				  ff(str, 0);
			  }
			  System.out.print("\n");
		  }
		}

	  return 0;
	}
	  public static void ff(String str, int x)
	  {

		if (!str[x].equals('a'))
		{
		  x++;
		  ff(str, x);
		  x--;
		}
		if (!str[x].equals('a'))
		{
			System.out.print(str[x]);
		}
	  }

}

