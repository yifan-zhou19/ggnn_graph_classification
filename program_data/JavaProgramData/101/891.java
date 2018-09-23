package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[3];
		int[] t = new int[3];
		int i;
		int j;
		int k;
		int temp;
		String c1 = new String(new char[3]);
		String c2 = new String(new char[3]);
		char c;
		for (a[0] = 1;a[0] <= 3;a[0]++)
		{
			for (a[1] = 1;a[1] <= 3;a[1]++)
			{
				for (a[2] = 1;a[2] <= 3;a[2]++) //????????
				{
					t[0] = (a[1] > a[0]) + (a[2] == a[0]);
					t[1] = (a[0] > a[1]) + (a[0] > a[2]);
					t[2] = (a[2] > a[1]) + (a[1] > a[0]); //????????????
					c1 = tangible.StringFunctions.changeCharacter(c1, 0, c2[0] = 'A');
					c1 = tangible.StringFunctions.changeCharacter(c1, 1, c2[1] = 'B');
					c1 = tangible.StringFunctions.changeCharacter(c1, 2, c2[2] = 'C'); //???a,b???????
					for (i = 0;i < 3;i++)
					{
						for (j = 1;j < 3;j++)
						{
							if (a[j] > a[j - 1])
							{
								k = j - 1;
								   temp = a[i];
								   a[i] = a[k];
								   a[k] = temp;
								c = c1.charAt(i);
								c1 = tangible.StringFunctions.changeCharacter(c1, i, c1.charAt(k));
								c1 = tangible.StringFunctions.changeCharacter(c1, k, c);
							}
						}
					} //????a(c1)
					for (i = 0;i < 3;i++)
					{
						for (j = 1;j < 3;j++)
						{
							if (t[j] > t[j - 1])
							{
								k = j - 1;
								   temp = t[i];
								   t[i] = t[k];
								   t[k] = temp;
								c = c2.charAt(i);
								c2 = tangible.StringFunctions.changeCharacter(c2, i, c2.charAt(k));
								c2 = tangible.StringFunctions.changeCharacter(c2, k, c);
							}
						}
					} //????b(c2)
					if ((c1.charAt(0) == c2.charAt(2)) && (c1.charAt(1) == c2.charAt(1)) && (c1.charAt(2) == c2.charAt(0))) //??????
					{
						System.out.print(c1.charAt(0));
						System.out.print(c1.charAt(1));
						System.out.print(c1.charAt(2));
						System.out.print("\n");
						return 0;
					}
				}
			}
		}
		return 0;
	}
}

