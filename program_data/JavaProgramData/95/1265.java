import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int m = 0;
		for (int i = 0;i < 80;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		}
		a = new Scanner(System.in).nextLine(); //??????????
		b = new Scanner(System.in).nextLine();
		for (int i = 0;i < 80;i++) //???????????????
		{
		   if (a.charAt(i) > 90)
		   {
			   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
		   }
		}
		for (int i = 0;i < 80;i++)
		{
		   if (b.charAt(i) > 90)
		   {
			   b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
		   }
		}
		for (int i = 0;i < 80;i++)
		{ //?????????????????????????
		   if ((a.charAt(i) - b.charAt(i)) != 32 && (b.charAt(i) - a.charAt(i)) != 32 && (a.charAt(i) - b.charAt(i) != 0))
		   {
			  if (a.charAt(i) < b.charAt(i))
			  {
				 System.out.print("<");
				 System.out.print("\n");
				 m = m + 1;
			  }
			  else if (a.charAt(i) > b.charAt(i))
			  {
				 System.out.print(">");
				 System.out.print("\n");
				 m = m + 1;
			  }
		   }
		   if (m == 1)
		   {
			   break; //????????????????????????
		   }
		}
		if (m == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		return 0;
	}



}

