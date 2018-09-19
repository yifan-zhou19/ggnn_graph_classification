package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf1 = new String(new char[110]);
		String zfa = new String(new char[110]);
		String zfb = new String(new char[110]);
		zf1 = new Scanner(System.in).nextLine();
		zfa = new Scanner(System.in).nextLine();
		zfb = new Scanner(System.in).nextLine();
		int x = zf1.length();
		int y = zfa.length();
		int z = zfb.length();
		int i;
		int j;
		int k = 0;
		int m = 0;
		int g = 0;
		int h = 0;
		int[] sz = new int[100];
		for (i = 0;i < x;i++)
		{
		 if (i == 0)
		 {
			if (zf1.charAt(i) == zfa.charAt(0))
			{
					k = 0;
					if (zf1.charAt(i + y) == ' ' || zf1.charAt(i + y) == '\0')
					{
						for (j = 0;j < y;j++)
						{
						  if (zf1.charAt(i + j) == zfa.charAt(j))
						  {
						   k++;
						  }
						}
						if (k == y)
						{
						  sz[m] = i;
						  m++;
						}
					}
			}
		 }
		 if (i != 0)
		 {
			   if (zf1.charAt(i) == zfa.charAt(0) && zf1.charAt(i - 1) == ' ')
			   {
					k = 0;
					if (zf1.charAt(i + y) == ' ' || zf1.charAt(i + y) == '\0')
					{
						for (j = 0;j < y;j++)
						{
						  if (zf1.charAt(i + j) == zfa.charAt(j))
						  {
						   k++;
						  }
						}
						if (k == y)
						{
						  sz[m] = i;
						  m++;
						}
					}
			   }
		 }
		}
		for (j = 0;j < x;j++)
		{
			h = 0;
			for (i = 0;i < m;i++)
			{
				if (j == sz[i])
				{
					System.out.printf("%s",zfb);
					j = j + y - 1;
					h = 1;
					break;
				}
			}

			if (h != 1)
			{
						 System.out.printf("%c",zf1.charAt(j));
			}
		}
		return 0;
	}

}
