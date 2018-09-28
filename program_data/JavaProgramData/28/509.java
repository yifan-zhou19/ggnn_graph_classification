package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[3000]);
		str = new Scanner(System.in).nextLine();
		int i;
		int len;
		int j = 0;
		len = str.length();
		  for (i = 0;i < len;i++)
		  {
				 if (str.charAt(i) != ' ')
				 {
					 j++;
				 }
				else
				{
					if (j != 0)
					{
						System.out.printf("%d",j);
						if (i < len - 1)
						{
							System.out.print(",");
						}
						j = 0;
					}
				}

		  }
		  j = 0;
		   for (i = 0;i < len;i++)
		   {
				 if (str.charAt(i) != ' ')
				 {
					 j++;
				 }
				else
				{
					j = 0;
				}
		   }
		   System.out.printf("%d\n",j);
	}
}
