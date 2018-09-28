package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //????i,l,j
		int l;
		int j;
		String x = new String(new char[101]); //??????x
		cin.get(x,100);
		for (i = 0;i < 100;i++) //????????????
		{
			if (x.charAt(i) == 32 && x.charAt(i + 1) == 32) //????????????????????i????
			{
				for (j = i;j <= 100;j++)
				{
					x = tangible.StringFunctions.changeCharacter(x, j, x.charAt(j + 1));
				}
				i--;
			}
		}

		System.out.print(x);

		return 0;
	}
}

