package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***???????***
	//***??????***
	//***???2012.11.14***
	//*************************************************
	public static int Main()
	{
		int i = 0;
		int j;
		int k;
		int p;
		int length;
		String a = new String(new char[100]);
		do
		{
			a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
		} while (a.charAt(i++) != '\n'); //?????
		length = i; //???????
		for (i = 2; i <= length; i++) //??????????????
		{
			for (j = 0; j <= length - i - 1; j++) //??????????????
			{
				p = 1;
				for (k = 0; k <= (i - 1) / 2; k++)
				{
					if (a.charAt(j + k) != a.charAt(j + i - 1 - k)) //?????????????
					{
						p = 0;
					}
				}
				if (p == 1)
				{
					for (k = j; k < i + j; k++)
					{
						System.out.print(a.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

