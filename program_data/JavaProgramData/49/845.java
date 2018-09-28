package <missing>;

public class GlobalMembers
{
	//**************************
	//*???????          *
	//*?????? 1200012775 *
	//*???2012/11/13        *
	//**************************
	public static int Main()
	{
		String str = new String(new char[500]); //?????
		int leap; //??????
		int i;
		int length;
		int k;
		int j;
		for (i = 0; ; i++)
		{
			cin.get(str.charAt(i)); //????
			if (str.charAt(i) == '\n') //?????
			{
				length = i - 1; //??????????1
				break; //????
			}
		}
		for (j = 1; j < length; j++) //???2?length
		{
			for (i = 0; i <= length - j; i++) //???0???
			{
				leap = 0; //????leap?0
				for (k = 0; k <= j / 2 + 1; k++)
				{
					if (str.charAt(i + k) != str.charAt(i + j - k)) //????
					{
						leap = 1; //?????
						break; //????
					}
				}
				if (leap == 0) //????
				{
					for (k = i; k <= i + j; k++)
					{
						System.out.print(str.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
