package <missing>;

public class GlobalMembers
{
	/*
	 * pp5.cpp
	 *
	 *  Created on: 2010-11-13
	 *      Author: d
	 */
	public static int Main()
	{
		int a;
		int b;
		int i = 0;
		int sum = 0;
		int count = 0;
		int sum1;
		int[] k = new int[100];
		int[] p = new int[100];
		char temp;
		String n = new String(new char[100]);
		String m = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n.charAt(i) != '\0') //????????
		{
			if (n.charAt(i) >= 65 && n.charAt(i) <= 90)
			{
				p[i] = n.charAt(i) - 55;
			}
			 if (n.charAt(i) >= 97 && n.charAt(i) <= 122)
			 {
				p[i] = n.charAt(i) - 87;
			 }
			if (n.charAt(i) >= 48 && n.charAt(i) <= 57)
			{
				p[i] = n.charAt(i) - 48;
			}
			i++;
		}
		for (i = 0;i < n.length();i++) //??????
		{
		sum = sum + Math.pow((double)a,(double)i) * p[n.length() - i - 1];
		}
		sum1 = sum;
		if (sum1 == 0)
		{
			System.out.print("0");
		}
		else
		{
		while (sum1 != 0)
		{
			sum1 /= b;
			 count++;
		}
		}

			  for (i = 0;i < count;i++)
			  {
			   k[i] = (sum / (int)Math.pow((double)b,(double)i)) % b;
			  }
			  for (i = 0;i < count;i++) //????????
			  {
			if (k[i] > 9)
			{
			m = tangible.StringFunctions.changeCharacter(m, i, k[i] + 55);
			}
			else
			{
				m = tangible.StringFunctions.changeCharacter(m, i, k[i] + 48);
			}
			  }
			  for (i = 0;i < (int)(count / 2);i++)
			  {
				  temp = m.charAt(i);
				  m = tangible.StringFunctions.changeCharacter(m, i, m.charAt(count - 1 - i));
				  m = tangible.StringFunctions.changeCharacter(m, count - 1 - i, temp);
			  }
			  for (i = 0;i < count;i++)
			  {
				  System.out.print(m.charAt(i));
			  }
			  System.out.print("\n");

		return 0;
	}

}

