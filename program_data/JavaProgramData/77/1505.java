package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[108]);
		int l;
		char key;
		int i;
		int j;
		int[] a = new int[100];
		int count = 0;

		c = ConsoleInput.readToWhiteSpace(true).charAt(0);

		l = c.length();
		key = c.charAt(0);

		for (i = 0; i < l; i++)
		{
		if (c.charAt(i) != key)
		{
			a[count] = i;
			count++;
		}
		}

		for (i = 0; i < l / 2; i++)
		{
			for (j = a[i]; j >= 0; j--)
			{
				if (c.charAt(j) == key)
				{
					System.out.print(j);
					System.out.print(" ");
					System.out.print(a[i]);
					System.out.print("\n");
					c = tangible.StringFunctions.changeCharacter(c, j, key + 1);
					break;
				}
			}
		}



		return 0;
	}







}

