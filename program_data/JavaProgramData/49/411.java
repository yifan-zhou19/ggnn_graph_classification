package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   String s = new String(new char[500]);
		   int length;
		   int l;
		   int i;
		   int j;
		   int p;
		   int k;
		   s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		   length = s.length();
		   for (l = 2;l <= length;l++)
		   {
			  for (i = 0;i < length - l + 1;i++)
			  {
				int flag = 0;
				for (j = i,p = 1;j < l / 2 + i;j++)
				{
					 if (s.charAt(j) != s.charAt(j + l - p))
					 {
						flag = 1;
						break;
					 }
					else
					{
						p += 2;
					}
				}
				if (flag == 0)
				{
					for (k = i;k < i + l;k++)
					{
						System.out.print(s.charAt(k));
					}
					System.out.print("\n");
				}
			  }
		   }
			  return 0;
	}

}

