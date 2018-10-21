package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[501]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 2;i <= str.length();i++)
		{
			if (i % 2 == 0)
			{
			   for (int j = 0;j <= str.length() - i;j++)
			   {
				   int k;
				   int l = 1;
				   for (k = j;k < j + i / 2;k++)
				   {
					   if (str.charAt(k) == str.charAt(i + j - l))
					   {
						   l++;
						   continue;
					   }
					   else
					   {
						   break;
					   }
				   }
				   if (k >= j + i / 2)
				   {
					   for (int m = j;m < j + i;m++)
					   {
						   System.out.print(str.charAt(m));
					   }
				   System.out.print("\n");
				   }
			   }
			}

			if (i % 2 == 1)
			{
			   for (int j = 0;j <= str.length() - i;j++)
			   {
				   int k;
				   int l = 1;
				   for (k = j;k < j + i / 2;k++)
				   {
					   if (str.charAt(k) == str.charAt(i + j - l))
					   {
						   l++;
						   continue;
					   }
					   else
					   {
						   break;
					   }
				   }
				   if (k >= j + i / 2)
				   {
					   for (int m = j;m < j + i;m++)
					   {
						   System.out.print(str.charAt(m));
					   }
				   System.out.print("\n");
				   }
			   }

			}
		}
		return 0;
	}
}

