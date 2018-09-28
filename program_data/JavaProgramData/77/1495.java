package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[110]);
	   int i = 0;
	   int j;
	   int k;
	   int l;
	   int t1;
	   int t2;
	   for (;;)
	   {
			a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
			if (a.charAt(i) == '\n')
			{
				break;
			}
			i++;
	   }
		l = i - 1;
		for (i = 0;i <= l;i++)
		{
			if (a.charAt(i) != a.charAt(0))
			{
				a = a.substring(0, i);
				for (j = i;j >= 0;j--)
				{
					if (a.charAt(j) == a.charAt(0))
					{
						a = a.substring(0, j);
					System.out.print(j);
					System.out.print(" ");
					break;
					}
				}
				System.out.print(i);
				System.out.print("\n");
			}
		}
			return 0;
	}
}

