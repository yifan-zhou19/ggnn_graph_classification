package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int[] flag = new int[101];
		int i;
		int j;
		int len;
		int count;
		int sign;

		while (true)
		{
			sign = 0;
			i = -1;
			do
			{
				i++;
				if (cin.get(a.charAt(i)))
				{
					sign = 1;
				}
			}while (a.charAt(i) != '\n');
			if (sign == 0)
			{
				break;
			}
			a = a.substring(0, i);
			len = i; //i???a???
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,' ',(Character.SIZE / Byte.SIZE));
			b = b.substring(0, i);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(flag,0,(Integer.SIZE / Byte.SIZE)); //?????

			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) == '(') //???????????
				{
					j = i + 1;
					count = 0;
					while (j < len)
					{
						if (a.charAt(j) == '(')
						{
							count++;
						}
						else if (a.charAt(j) == ')')
						{
							if (count == 0)
							{
								flag[i] = 1;
								flag[j] = 1;
								break;
							} //???????
							else
							{
								count--;
							}
						}
						j++;
					}
					if (flag[i] == 0)
					{
						b = tangible.StringFunctions.changeCharacter(b, i, '$');
					}
				}
				else if ((a.charAt(i) == ')') && (flag[i] == 0))
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '?'); //???????????????????
				}
			}
			System.out.print(a);
			System.out.print("\n");
			System.out.print(b);
			System.out.print("\n");
		}
	}

}

