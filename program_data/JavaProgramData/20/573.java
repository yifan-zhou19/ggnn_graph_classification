package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		   int len1;
		   String str1 = new String(new char[1000]);
		   String str2 = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		   char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		   char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		   char * p2;
		   String p0;
		   char max;
		   while ((scanf("%s",str1)) != EOF)
		   {
			   str2 = new Scanner(System.in).nextLine();
			   len1 = str1.length();
			   p2 = str2;
			   p1 = str1;
				   max = str1.charAt(0);
			   for (p = str1;p < str1.Substring(len1);p++)
			   {
				if (max < *p)
				{
					   max = p;
					   p0 = p;
				}
			   }
				for (;p1 < str1.Substring(len1);p1++)
				{
					if (p1 == p0)
					{
						System.out.printf("%c",*p1);
						for (; * p2 != '\0';p2++)
						{
							if (*p2 == ' ')
							{
								continue;
							}
							else
							{
								System.out.printf("%c",*p2);
							}
						}
					}
					if (p1 != p0)
					{
					 System.out.printf("%c",*p1);
					}

				}
				System.out.print("\n");
		   }
	}
}
