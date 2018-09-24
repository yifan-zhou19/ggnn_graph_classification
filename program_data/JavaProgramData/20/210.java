package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char t;
		char g;
		final String c = "";
		char[][] a = new char[100][3];
		int i;
		int b;
		int j;
		int k;
		int[] h = new int[100];
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			if (c.charAt(i)[0] == '\0')
			{
				break;
			}
		}

		b = i + 1;


		for (i = 0;i < b;i++)
		{


			h[i] = String.valueOf(c.charAt(i)).length();
			t = c.charAt(i)[0];
			for (j = 0;j < h[i];j++)
			{
				if (c.charAt(i)[j] > t)
				{
					t = c.charAt(i)[j];
				}

			}


			for (j = 0;j < h[i];j++)
			{
				if (c.charAt(i)[j] == t)
				{
					for (k = (h[i] - 1);k > j;k--)
					{
						c.charAt(i)[k + 3] = c.charAt(i)[k];
					}
					c.charAt(i)[j + 1] = a[i][0];
					c.charAt(i)[j + 2] = a[i][1];
					c.charAt(i)[j + 3] = a[i][2];

					break;

				}
			}
			System.out.printf("%s\n",c.charAt(i));
		}

		return 0;
	}


}

