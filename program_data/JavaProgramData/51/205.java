package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int x = 0;
	int pp;
	int[] count = new int[550];
	int max = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String a = new String(new char[550]);
	char[][] b =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	String c = new String(new char[10]);
	c = c.substring(0, n);
	a = new Scanner(System.in).nextLine();
	for (int i = 0;i + n <= a.length();i++)
	{
		pp = 0;
		for (int j = 0;j < n;j++)
		{
			c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i + j));
		}
		for (int k = 0;k < x;k++)
		{
			if (strcmp(c,b[k]) == 0)
			{
				pp = 1;
				count[k]++;
				break;
			}
		}
		if (pp == 0)
		{
			b[x] = c;
			x++;
		}
	}
	for (int i = 0;i < x;i++)
	{
		if (count[i] > max)
		{
			max = count[i];
		}
	}
	if (max != 0)
	{
		System.out.printf("%d\n",max + 1);
	for (int i = 0;i < x;i++)
	{
		if (count[i] == max)
		{
			System.out.printf("%s\n",b[i]);
		}
	}
	}
	else
	{
		System.out.print("NO");
	}
	}

}

