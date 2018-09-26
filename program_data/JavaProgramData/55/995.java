import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ????
	 * ???1000010549
	 * ?????
	 * ???2010-11-13
	 */
	public static int Main()
	{
		double a; //??????
		double[] n1 = new double[10000];
		double sum1;
		int i;
		int j;
		int b;
		int sum2;
		int k1;
		int k2;
		int la;
		int[] s = new int[1000];
		String l = new String(new char[10000]);
		String n = new String(new char[10000]);
		String n2 = new String(new char[10000]);
		String a1 = new String(new char[2]);
		String b1 = new String(new char[2]);
		l = new Scanner(System.in).nextLine(); //?????
		i = 0;
		while (l.charAt(i) != ' ') //??????n????
		{
			a1 = tangible.StringFunctions.changeCharacter(a1, i, l.charAt(i));
			i++;
		}
		la = i;
		i = i + 1;
		k1 = 0;
		k2 = 0;
		while (l.charAt(i) != ' ') //??????????
		{
			n = tangible.StringFunctions.changeCharacter(n, k1, l.charAt(i));
			i++;
			k1++;
		}
		i = i + 1;
		while (l.charAt(i) != '\0') //????????
		{
			b1 = tangible.StringFunctions.changeCharacter(b1, k2, l.charAt(i));
			i++;
			k2++;
		}
		if (la == 1) //????????
		{
			a = (int)a1.charAt(0) - 48;
		}
		else
		{
			a = ((int)a1.charAt(0) - 48) * 10 + (int)a1.charAt(1) - 48;
		}
		if (k2 == 1)
		{
			b = (int)b1.charAt(0) - 48;
		}
		else
		{
			b = ((int)b1.charAt(0) - 48) * 10 + (int)b1.charAt(1) - 48;
		}
		for (i = 0;i < k1;i++) //????????????
		{
			if ('a' <= n.charAt(i) && n.charAt(i) <= 'z')
			{
			n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 32);
			}
		}
		sum1 = 0;
		for (i = 0;i < k1;i++)
		{
			if ('0' <= n.charAt(i) && n.charAt(i) <= '9')
			{
				n1[i] = (int)(n.charAt(i)) - 48;
				sum1 = sum1 + n1[i] * Math.pow(a,k1 - i - 1);
			}
			else
			{
				n1[i] = (int)(n.charAt(i)) - 55;
				sum1 = sum1 + n1[i] * Math.pow(a,k1 - i - 1);
			}
		}
		sum2 = (int)sum1;
		if (b == 10) //?????????????
		{
			System.out.print(sum2);
			System.out.print("\n");
		}
		else if (b < 10) //??????????
		{
		 for (i = 0;i < 1000;i++)
		 {
			s[i] = 1;
		 }
		 i = 0;
		 while (sum2 >= b)
		 {
			s[i] = sum2 % b;
			sum2 = (sum2 - s[i]) / b;
			i++;
		 }
		 System.out.print(sum2);
		 for (j = i - 1;j >= 0;j--)
		 {
			System.out.print(s[j]);
		 }
		}
		else if (10 < b && b <= 36) //????11?36???
		{
				  for (i = 0;i < 1000;i++)
				  {
					 s[i] = 1;
				  }
				  i = 0;
				  while (sum2 >= b)
				  {
						s[i] = sum2 % b;
						sum2 = (sum2 - s[i]) / b;
						if (s[i] < 10)
						{
							   n2 = tangible.StringFunctions.changeCharacter(n2, i, '0' + s[i]);
						}
						else
						{
							   n2 = tangible.StringFunctions.changeCharacter(n2, i, 'A' + s[i] - 10);
						}
						i++;
				  }
				  if (sum2 < 10)
				  {
						  n2 = tangible.StringFunctions.changeCharacter(n2, i, '0' + sum2);
				  }
				  else
				  {
						  n2 = tangible.StringFunctions.changeCharacter(n2, i, 'A' + sum2 - 10);
				  }
				  for (j = i;j >= 0;j--)
				  {
						  System.out.print(n2.charAt(j));
				  }
		}
		return 0;
	}

}

