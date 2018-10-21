package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[100]);
		String t = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = tempVar2.charAt(0);
		}
		int len1;
		int len2;
		int tag = 0;
		int tag1;
		;
		len1 = s.length();
		len2 = t.length();

		int i;
		int j;
		int k;
		i = 0;

			for (j = 0;j < len2;j++)
			{
				if (tag != 1)
				{
				if (s.charAt(i) == t.charAt(j))
				{
					for (k = j + 1,i = i + 1;i < len1;k++)
					{
						if (s.charAt(i) != t.charAt(k))
						{
							i = 0;
							break;
						}
						else
						{
							i++;

							if (i == len1)
							{
								tag = 1;
								tag1 = k - len1 + 1;
							}

						}
					}
				}
				}
				else
				{
					break;
				}
			}
				System.out.printf("%d",tag1);






	}

}

