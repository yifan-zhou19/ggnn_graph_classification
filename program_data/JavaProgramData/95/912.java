import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************//
	//*?????????????*//
	//*?????                *//
	//*???2010.11.17          *//
	//****************************//
	public static int Main()
	{
	  String c1 = new String(new char[80]);
	  String c2 = new String(new char[80]);
	  int len1; //k???????????
	  int len2;
	  int i;
	  int k = 0;
	  c1 = new Scanner(System.in).nextLine();
	  c2 = new Scanner(System.in).nextLine();
	  len1 = c1.length();
	  len2 = c2.length();
	  if (len1 != len2)
	  {
		if (strcmp(c1,c2) == 0)
		{
			System.out.print("=");
		}
		else if (strcmp(c1,c2) == 1)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("<");
		}
	  }
	  else
	  {
		 for (i = 0;i < len1;i++)
		 {
		  if (c1.charAt(i) == c2.charAt(i) || c1.charAt(i) == c2.charAt(i) + 32 || c1.charAt(i) == c2.charAt(i) - 32)
		  {
			  k++;
			  continue;
		  }
		  else if (((c1.charAt(i) > 64 && c1.charAt(i) < 91) && (c2.charAt(i)>64 && c2.charAt(i) < 91)) || ((c1.charAt(i)>96 && c1.charAt(i) < 123) && (c2.charAt(i)>96 && c2.charAt(i) < 123))) //????????????????????
		  {
			if (c1.charAt(i) < c2.charAt(i))
			{
			  System.out.print("<");
			}
			else
			{
			  System.out.print(">");
			}
		  }
		  else if ((c1.charAt(i) > 64 && c1.charAt(i) < 91) && (c2.charAt(i)>96 && c2.charAt(i) < 123))
		  {
			if (c1.charAt(i) + 32 < c2.charAt(i))
			{
			  System.out.print("<");
			}
			else if (c1.charAt(i) + 32 > c2.charAt(i))
			{
			  System.out.print(">");
			}
		  }
		  else if ((c1.charAt(i) > 96 && c1.charAt(i) < 123) && (c2.charAt(i)>64 && c2.charAt(i) < 91))
		  {
			if (c1.charAt(i) - 32 < c2.charAt(i))
			{
			  System.out.print("<");
			}
			else if (c1.charAt(i) - 32 > c2.charAt(i))
			{
			  System.out.print(">");
			}
		  }
		 }
		if (k == len1)
		{
			System.out.print("=");
			System.out.print("\n");
		}
	  }
	  return 0;
	}

}
