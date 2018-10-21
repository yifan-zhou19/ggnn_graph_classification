package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)



	{
		int n;
		int p;
		int i;
		int j;
		int l;
		int large;
		int small;
		String a = new String(new char[50]);
		String max = new String(new char[50]);
		String min = new String(new char[50]);
		large = 0;
		small = 50;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = tempVar2.charAt(0);
				}
				l = a.length();
				small = l;
				large = l;

					for (i = 0;i <= l;i++)
					{
						min = tangible.StringFunctions.changeCharacter(min, i, a.charAt(i));

					}
					for (i = 0;i <= l;i++)
					{
						max = tangible.StringFunctions.changeCharacter(max, i, a.charAt(i));

					}
			for (j = 2;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a = tempVar3.charAt(0);
				}
				l = a.length();
				if (l < small)
				{
					for (i = 0;i <= l;i++)
					{
						min = tangible.StringFunctions.changeCharacter(min, i, a.charAt(i));

					}
					small = l;
				}

				else if (l > large)
				{
					for (p = 0;p <= l;p++)
					{
						max = tangible.StringFunctions.changeCharacter(max, p, a.charAt(p));

					}

					large = l;
				}

			}

			for (i = 0;i <= large-1;i++)
			{
				System.out.printf("%c",max.charAt(i));
			}
			System.out.print("\n");
			for (i = 0;i <= small - 1;i++)
			{
				System.out.printf("%c",min.charAt(i));
			}
	}

	}

}

