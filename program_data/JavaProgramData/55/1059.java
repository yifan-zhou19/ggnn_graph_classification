package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012761_306.cpp
	 *?????????????????2???36?????????long??????????
	???????????0?1?...?9?a?b?...?z????0?1?...?9?A?B?...?Z??
	 *  Created on: 2010-11-12
	 *      Author: 378073652
	 */

	public static int Main()
	{
		int a; //??????
		int sn;
		int b;
		int j;
		int k;
		int q;
		int l;
		int t;
		int i;
		double m;
		int s = 0;
		String n = new String(new char[100]); //????????
		String p = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sn = n.length();
		for (i = 0;i < sn;i++)
		{
				if (n.charAt(i) >= 97)
				{
					n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 32);
				}
		}

		for (i = sn - 1;i >= 0;i--) //????10??
		{
			if (n.charAt(i) <= 57)
			{
				j = n.charAt(i) - 48;
				t = sn - 1 - i;
			s = s + (j * Math.pow((double)a,(double)(t)));
			}
			else
			{
				j = n.charAt(i) - 55;
				m = Math.pow((double)a,(double)(sn - 1 - i));
				s = s + j * m;
			} //s?10??? ????
		}



	  if (s == 0)
	  {
		  System.out.print(s);
		  return 0;
	  } //??s?0 ??0
	  for (i = 0;s != 0;i++) //??  ?????b??
	  {
		  q = s % b;
	  if (q <= 9)
	  {
		  p = tangible.StringFunctions.changeCharacter(p, i, (48 + q));
	  }
	  else
	  {
		  p = tangible.StringFunctions.changeCharacter(p, i, (55 + q));
	  }

	  s = (s - q) / b;


	  }
	p = tangible.StringFunctions.changeCharacter(p, i, '\0');
	l = p.length();


	for (i = l - 1;i >= 0;i--) //??
	{
	  System.out.print(p.charAt(i));
	}

	}


}

