package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
		String s3 = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s3 = tempVar3.charAt(0);
		}

		int len1;
		int len2;
		len1 = s1.length();
		len2 = s2.length();

		int i;
		int j;
		int k = 0;
		int tag = 0;
		int tag1;


			for (i = 0,j = 0;j < len1;j++)
			{
				if (tag != 1 && k == 0)
				{
				if (s2.charAt(i) == s1.charAt(j))
				{
					for (k = j + 1,i = i + 1;i < len2;k++)
					{
						if (s2.charAt(i) != s1.charAt(k))
						{
							i = 0;
						}

							else
							{
							i++;
							if (i == len2)
							{
								tag = 1;
								tag1 = k - len2 + 1;
							}
							}
					}
				}
				}
				else if (tag != 1 && k == len1)
				{
					break;
				}
				else if (tag == 1)
				{
					break;
				}


			}

			if (tag == 0)
			{
				System.out.printf("%s",s1);
			}
			else
			{
				int t;
				int m;
				for (t = tag1,m = 0;t < tag1 + len2;t++)
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, t, s3.charAt(m));
					m++;
					if (m == len2)
					{
						break;
					}
				}
				System.out.printf("%s",s1);
			}





	}

}

