package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[10000]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int lone;
		int ltwo;
		int lthree;
		int k;
		int[] shuzu = new int[10000];
		int p = 0;
		int[] count = new int[10000];
		zfc = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		lone = zfc.length();
		ltwo = a.length();
		lthree = b.length();
		for (i = 0;i < lone - ltwo + 1;i++)
		{
			if (i == 0)
			{
				  for (k = 0;k < ltwo;k++)
				  {
					   if (zfc.charAt(k) == a.charAt(k))
					   {
						   count[i] += 1;
					   }
				  }
				  if (count[i] == ltwo && zfc.charAt(ltwo) == ' ')
				  {
					  shuzu[i] = 1;
				  }
			}
			else if (i > 0 && i < lone - ltwo)
			{
				for (k = 0;k < ltwo;k++)
				{
					if (zfc.charAt(k + i) == a.charAt(k))
					{
						count[i] += 1;
					}
				}
				if (count[i] == ltwo && zfc.charAt(i + ltwo) == ' ' && zfc.charAt(i - 1) == ' ')
				{
					shuzu[i] = 1;
				}
			}
			else
			{
				for (k = 0;k < ltwo;k++)
				{
								   if (zfc.charAt(k + i) == a.charAt(k))
								   {
													 count[i] += 1;
								   }
				}
				if (count[i] == ltwo && zfc.charAt(i - 1) == ' ')
				{
											   shuzu[i] = 1;
				}
			}
		}
		while (p < lone)
		{
					 if (shuzu[p] == 0)
					 {
									System.out.printf("%c",zfc.charAt(p));
					 }
					 else
					 {
						 System.out.printf("%s",b);
						 p = p + ltwo - 1;
					 }
					 p++;
		}
		return 0;
	}


}
