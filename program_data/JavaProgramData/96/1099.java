package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[1000]);
		int[] str2 = new int[1000];
		int m;
		int n;
		int i;
		int no;
		int a;
		int c;
		no = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		a = str1.charAt(0) - 48;
		if (a < 10 && str1.charAt(1) == '\0')
		{
			System.out.printf("%c\n%d",'0',a);
		}
		else
		{
		 for (i = 0;;i++)
		 {
							  m = (str1.charAt(i) - 48) * 10 + (str1.charAt(i + 1) - 48);
							  str2[i] = m / 13;
							  str1 = tangible.StringFunctions.changeCharacter(str1, i + 1, m % 13 + 48);
							  if (str1.charAt(i + 2) == '\0')
							  {
								  break;
							  }
		 }
		 c = str1.charAt(i + 1) - '0';
		 n = i + 1;
		 for (i = 0;i < n;i++)
		 {
						if (no == 1)
						{
									   if (str2[i] == 0 && str2[i + 1] != 0)
									   {
										   continue;
									   }
									   else if (str2[i] == 0 && str2[i + 1] == 0)
									   {
										   System.out.printf("%d",str2[i]);
									   }
									   else
									   {
										   System.out.printf("%d",str2[i]);
									   }
									   no = 0;
						}
						else
						{
							System.out.printf("%d",str2[i]);
						}
		 }
		 System.out.print("\n");
		 System.out.printf("%d",c);
		}
		return 0;
	}

}

