package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[110]); //??????????
		int N;
		int i;
		int j;
		int s = 1;
		int temp;
		int n = 1;
		int[] add = new int[110];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,'\0',(Character.SIZE / Byte.SIZE));
		num = tangible.StringFunctions.changeCharacter(num, 0, '1');
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < N;i++) //??N?2??
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(add,0,(Integer.SIZE / Byte.SIZE));
			for (j = 0;j < n;j++) //???????2
			{
				temp = (num.charAt(j) - '0') * 2;
				num = tangible.StringFunctions.changeCharacter(num, j, temp % 10 + '0');
				if (temp >= 10)
				{
					add[j + 1] = 1;
					if (num.charAt(j + 1) == '\0')
					{
						s++;
						num = tangible.StringFunctions.changeCharacter(num, j + 1, '1');
					}

				}
			}
			for (j = 0;j < n;j++) //??
			{
				num.charAt(j) += add[j];
			}
			n = s;
		}
		for (i = s - 1;i >= 0;i--) //??
		{
			temp = num.charAt(i) - '0';
			System.out.print(temp);
		}
		return 0;
	}
}

