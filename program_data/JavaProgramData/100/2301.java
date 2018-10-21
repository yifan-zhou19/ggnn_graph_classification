package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int num;
		int j = 0;
		int k = 0;
		char a;
		String s = new String(new char[350]);
		s = new Scanner(System.in).nextLine();
		for (a = 'A';a <= 'Z';a++)
		{
			num = 0;
			for (i = 0;s.charAt(i) != '\0';i++)
			{
				if (s.charAt(i) == a)
				{
					num++;
				}
			}
			if (num != 0)
			{
				System.out.printf("%c=%d\n",a,num);
			   j++;
			}
		}

	   for (a = 'a';a <= 'z';a++)
	   {
			num = 0;
			for (i = 0;s.charAt(i) != '\0';i++)
			{
				if (s.charAt(i) == a)
				{
					num++;
				}
			}
			if (num != 0)
			{
				System.out.printf("%c=%d\n",a,num);
			   k++;
			}
	   }
	   if (j == 0 && k == 0)
	   {
		   System.out.print("No");
	   }
	   return 0;
	}
}
