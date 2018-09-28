package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[SIZE]);
		String b = new String(new char[SIZE]);
		char r;
		int[] bn = new int[SIZE];
		int i;
		int n;
		int l;
		int j;
		int k;
		int ok;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while ((r = System.in.read()) != '\n')
		{
			;
		}
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i + l <= n;i++)
		{
			bn[i] = 0;
		}
		for (i = 0;i + l <= n;i++)
		{

			for (j = 0;j < l;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i + j));
			}
			for (k = i + 1;k + l <= n;k++)
			{
				ok = 1;
				for (j = 0;j < l;j++)
				{
					if (b.charAt(j) != a.charAt(k + j))
					{
						ok = 0;
						break;
					}
				}
				if (ok != 0)
				{
					bn[i]++;
				}
			}
			if (bn[i] > max)
			{
				max = bn[i];
			}
		}
		if (max > 0)
		{
		System.out.printf("%d\n",max + 1);
		for (i = 0;i + l <= n;i++)
		{
			if (bn[i] == max)
			{
					for (j = 0;j < l;j++)
					{

					System.out.printf("%c",a.charAt(i + j));
					}
					System.out.print("\n");
			}
		}
		}
					else
					{
					System.out.print("NO");
					}

					return 0;
	}

}

