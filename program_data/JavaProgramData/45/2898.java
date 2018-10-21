package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[N]);
		c = new Scanner(System.in).nextLine();
		int len;
		int len1;
		len = c.length();
		int i;
		int j;
		int k = 0;
		for (i = 0;i < len;i++)
		{
			if (c.charAt(i) != ' ')
			{
				k = k++;
			}
			else
			{
				break;
			}
		}
		len1 = k; //printf("%d\n",len1);
		for (i = len1 + 1;i <= len - len1;i++)
		{
			k = 0;
		   for (j = 0;j < len1;j++)
		   {
			   if (c.charAt(i + j) == c.charAt(j))
			   {
				   k = k++;
			   }
		   }
		   if (k == len1)
		   {
			   System.out.printf("%d\n",i - len1 - 1);
			   break;
		   }
		}

		return 0;
	}
}
