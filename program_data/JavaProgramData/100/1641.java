package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String xl = new String(new char[300]);
		String zm = new String(new char[300]);
		char e;
		int i;
		int m;
		int k = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			xl = tempVar.charAt(0);
		}
		n = xl.length();

		for (i = 0;i < n;i++)
		{
			if ((xl.charAt(i) >= 65 && xl.charAt(i) <= 90) || (xl.charAt(i) >= 97 && xl.charAt(i) <= 122))
			{
				  zm = tangible.StringFunctions.changeCharacter(zm, k, xl.charAt(i));
				  k++;
			}
		}


		for (m = 1;m <= k;m++)
		{
			for (i = 0;i < k - m;i++)
			{
				if (zm.charAt(i) > zm.charAt(i + 1))
				{
					  e = zm.charAt(i);
					  zm = tangible.StringFunctions.changeCharacter(zm, i, zm.charAt(i + 1));
					  zm = tangible.StringFunctions.changeCharacter(zm, i + 1, e);
				}
			}
		}
		zm = tangible.StringFunctions.changeCharacter(zm, k, '\0');

		m = 0;
		for (i = 0;i < k;i++)
		{
			if (zm.charAt(i) == zm.charAt(i + 1))
			{
				for (m = i + 1;m < k;m++)
				{
					if (zm.charAt(m) == zm.charAt(m + 1))
					{
						continue;
					}
					else
					{

							System.out.printf("%c=%d\n",zm.charAt(i),m - i + 1);
							i = m;
						break;
					}

				}
			}
			else
			{
				System.out.printf("%c=1\n",zm.charAt(i));
			}
		}
		if (m == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

