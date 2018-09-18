import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int dg(int a, int b)
	{
		for (int i = a;i <= st.length();i++)
		{
		 //   cout<<b<<endl;
		  //  cout<<b<<' '<<i<<' '<<st2<<endl;
			if (st.charAt(i - 1) == '(')
			{
			  //  cout<<'A'<<endl;
			   int t = dg(i + 1, i);
			   if (t == 0)
			   {
				   st2 = tangible.StringFunctions.changeCharacter(st2, i - 1, '$');
				   break;
			   }
			   if (t > 0)
			   {
				   st2 = tangible.StringFunctions.changeCharacter(st2, i - 1, ' ');
				   i = t;
				   continue;
			   }
			}
			else if (st.charAt(i - 1) == ')')
			{

				 if (b == 0)
				 {
					 st2 = tangible.StringFunctions.changeCharacter(st2, i - 1, '?');
				 }
				 if (b > 0)
				 {
					 st2 = tangible.StringFunctions.changeCharacter(st2, i - 1, ' ');
					 return i;
				 }
			}
			else
			{
				st2 = tangible.StringFunctions.changeCharacter(st2, i - 1, ' ');
			}
		}
		return 0;
	}

	public static String st = new String(new char[1000]);
	public static String st2 = new String(new char[1000]);

	public static int Main()
	{
		while (st = new Scanner(System.in).nextLine())
		{

			  st2 = tangible.StringFunctions.changeCharacter(st2, st.length(), '\0');
			  dg(1, 0);
			  System.out.print(st);
			  System.out.print("\n");
			  System.out.print(st2);
			  System.out.print("\n");
		}

	}

}

