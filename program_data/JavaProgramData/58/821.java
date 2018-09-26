import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ff = char str[];
		int t;
		int i;
		int p;
		String str = new String(new char[1000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= t;i++)
		{
		str = new Scanner(System.in).nextLine();
		p = ff(str);
		System.out.print(p);
		System.out.print("\n");
		str = null;
		}
	return 0;
	}


	   public static int ff(String str)
	   {
		  int j;
		  int n = 0;
		  int x = 1;

		  if ((str[0].compareTo(65) >= 0 && str[0].compareTo(90) <= 0) || (str[0].compareTo(97) >= 0 && str[0].compareTo(122) <= 0) || (str[0].equals('_')))
		  {
			   for (j = 1;j <= str.length() - 1;j++)
			   {
				   if ((str[j].compareTo(65) >= 0 && str[j].compareTo(90) <= 0) || (str[j].compareTo(97) >= 0 && str[j].compareTo(122) <= 0) || (str[j].equals('_')) || (str[j].compareTo(48) >= 0 && str[j].compareTo(57) <= 0))
				   {
						  n = 1;
						  continue;
				   }
				   else
				   {
					   x = 0;
					   n = 0;
					   break;
				   }
			   }
			   {
				if (n != 0)
				{
						x = 1;
						n = 0;
				}
				else
				{
					x = x;
				}
			}
		  }
		  else
		  {
			  x = 0;
		  }
		return (x);
	   }




}

