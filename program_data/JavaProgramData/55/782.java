package <missing>;

public class GlobalMembers
{
	//*******************************************
	//????5.cpp
	//????a??????b??
	//?????
	//*******************************************

	public static int Main()
	{

		int m; //????
		int i;
		int dec = 0;
		double temp = 0;
		double b;
		double a;
		String num = new String(new char[32]); //???????
		int[] p = new int[32]; //????
		int[] q = new int[32];
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		m = num.length(); //??num???
		for (i = 0;i < m;i++)
		{
			p[i] = num.charAt(i); //??????????????
				if (p[i] < 58) //??????????
				{
				   p[i] = p[i] - 48;
				}
				else if (p[i] < 91)
				{
				   p[i] = p[i] - 55;
				}
				else if (p[i] < 123)
				{
					p[i] = p[i] - 87;
				}
		}
			for (i = 0;i < m;i++) //for?????????
			{
			 dec += p[i] * Math.pow(a,m - 1 - i);
			}
			if (dec == 0)
			{
				System.out.print("0");
			}
			else
			{
				for (i = 0;i < 32;i++) //????b???????
				{
				  temp = Math.pow(b,i);
				  if (temp > dec)
				  {
					m = i;
					break;
				  }
				}

				q[0] = dec / Math.pow(b,m - 1); //??b???
				for (i = 1;i < m;i++)
				{
				   q[i] = (dec - q[i - 1] * Math.pow(b,m - i)) / Math.pow(b,m - 1 - i);
				   dec = dec - q[i - 1] * Math.pow(b,m - i);
				}
				for (i = 0;i < m;i++) //????????????
				{
				   if (q[i] < 10)
				   {
				   q[i] = q[i] + 48;
				   }
				   else
				   {
					   q[i] = q[i] + 55;
				   }
				}
				for (i = 0;i < m;i++)
				{
				   num = tangible.StringFunctions.changeCharacter(num, i, q[i]); //?????????
				}

				num = tangible.StringFunctions.changeCharacter(num, m, '\0');
				System.out.print(num);
			}
				return 0;
	}
}

