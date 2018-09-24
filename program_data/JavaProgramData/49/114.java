package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int i;
		int j;
		int ii;
		int jj;
		int len;
		int q;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (q = 2; q <= len; q++)
		{
		for (i = 1; str.charAt(i) != 0; i++)
		{
			ii = i;
			jj = i;
			if (str.charAt(i - 1) == str.charAt(i + 1))
			{
				while ((str.charAt(ii) == str.charAt(jj)) && (ii >= 0) && (str.charAt(jj) != 0))
				{
					if (ii != jj)
					{
						if (jj - ii + 1 == q)
						{
						for (j = ii; j <= jj; j++)
						{
							System.out.print(str.charAt(j));
						}
						System.out.print("\n");
						}
					}
					ii--;
					jj++;
				}
			}
			/*else
				if ((str[i - 1] == str[i]))
				{
					ii --;
					while ((str[ii] == str[jj]) && (ii >= 0) && (str[jj] != 0))
				{
					if (ii != jj)
					{
						for (j = ii; j <= jj; j++)
							cout << str[j];
						cout << endl;
					}	
					ii --;
					jj ++;
				}
				}*/
				else
				{
					if (str.charAt(i) == str.charAt(i + 1))
					{
					jj++;
					while ((str.charAt(ii) == str.charAt(jj)) && (ii >= 0) && (str.charAt(jj) != 0))
					{
					if (ii != jj)
					{
						if (jj - ii + 1 == q)
						{
						for (j = ii; j <= jj; j++)
						{
							System.out.print(str.charAt(j));
						}
						System.out.print("\n");
						}
					}
					ii--;
					jj++;
					}
					}
				}
		}
		}
		return 0;
	}
}

