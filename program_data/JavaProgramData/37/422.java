package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int ls;
		int num;
		int[] z = new int[100];
		String s = new String(new char[200]);
		String x = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			ls = s.length();
			for (j = 0;j < ls - 1;j++)
			{
				num = 0;
				for (k = j + 1;k < ls;k++)
				{
					if (s.charAt(k) == s.charAt(j) && s.charAt(j) != '!')
					{
						s = tangible.StringFunctions.changeCharacter(s, k, '!');
						num++;
					}
				}
					if (num == 0 && s.charAt(j) != '!')
					{
						break;
					}
			}
			   if (num != 0)
			   {
				   z[i] = 1;
			   }
			   else
			   {
				 x = tangible.StringFunctions.changeCharacter(x, i, s.charAt(j));
				 z[i] = 0;
			   }
		}
		for (i = 0;i < n;i++)
		{
		if (z[i] != 1)
		{
			System.out.printf("%c\n",x.charAt(i));
		}
		else
		{
			System.out.print("no\n");
		}
		}
			return 0;
	}

}

