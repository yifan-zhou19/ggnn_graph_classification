package <missing>;

public class GlobalMembers
{
	//???2?N??//
	//??????//
	//???1000011029//
	//???2010?12?21?//

	public static int Main()
	{
		int n = 0; //????//
		String sum = new String(new char[101]); //???????//
		int i = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = sum.charAt(1); //????//
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum,'0',(Character.SIZE / Byte.SIZE));

		*p = '1';

		for (i = 1;i <= n;i++) //?????????????,???//
		{
			p = sum.charAt(100);
			while (true)
			{
				if ((*p - '0') * 2 >= 20)
				{
					(*(p + 1)) += 2;
					*p = (*p - '0') * 2 % 20 + '0';
				}
				else if ((*p - '0') * 2 >= 10 && (*p - '0') * 2 < 20)
				{
						(*(p + 1))++;
						*p = (*p - '0') * 2 % 10 + '0';
				}
					else
					{
						*p = (*p - '0') * 2 + '0';
					}

				p--;

				if (p == sum.charAt(0))
				{
					break;
				}
			}
		}

		for (i = 1;i <= 100;i++) //?????????//
		{
			if (sum.charAt(i) - '0' >= 10)
			{
				sum.charAt(i + 1)++;
				sum = tangible.StringFunctions.changeCharacter(sum, i, sum.charAt(i) % 10);
			}
		}

		for (i = 100;i >= 1;i--) //?????//
		{
			if (sum.charAt(i) - '0' > 0)
			{
				break;
			}
		}
		for (;i > 0;i--) //??//
		{
			System.out.print(sum.charAt(i));
		}

		return 0;
	}









}

