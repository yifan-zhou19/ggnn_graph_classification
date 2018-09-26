import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * m.cpp
	 *
	 *  Created on: 2013-12-7
	 *      Author: de
	 */

	public static String p = null;

	public static int t = 0;
	public static int len = 0;
	public static void paiban(tangible.RefObject<String> q, int i)
	{
		if (q.argValue.charAt(i) == ' ')
		{
			q.argValue.charAt(i) = '\n';
		  t += 80;
		  if (len - t <= 80)
		  {
			  System.out.print(p);
			  return;
		  }
		  else
		  {
			  paiban(q.argValue.Substring(i) + 1, 79);
		  }
		}
		else
		{
			if (q.argValue.charAt(i + 1) == ' ')
			{
				q.argValue.charAt(i + 1) = '\n';
			t += 81;
			if (len - t <= 80)
			{
					  System.out.print(p);
					  return;
			}
				  else
				  {
					  paiban(q.argValue.Substring(i) + 2, 79);
				  }
			}
			else
			{
			i--;
			while (q.argValue.charAt(i) != ' ')
			{
				i--;
			}
			q.argValue.charAt(i) = '\n';
			i++;
			t += i;
			if (len - t <= 80)
			{
				System.out.print(p);
			return;
			}
			else
			{
				paiban(q.argValue.Substring(i), 79);
			}
			}
		}
	}
	public static int Main()
	{
		int n;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  String text = new String(new char[42 * n]);
	  p = text;
	   String c = new String(new char[1]);
	   c = new Scanner(System.in).nextLine();
	   text = new Scanner(System.in).nextLine(); //cout<<"*********************"<<strlen(text);
	   len = text.length();
	   if (len > 80)
	   {

   tangible.RefObject<String> tempRef_text = new tangible.RefObject<String>(text);
	   paiban(tempRef_text, 79);
	   text = tempRef_text.argValue;
	   }
	   else
	   {
	   System.out.print(text);
	   System.out.print("\n");
	   }

		return 0;
	}
}

