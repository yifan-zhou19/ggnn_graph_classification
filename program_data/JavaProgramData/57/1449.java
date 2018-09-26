package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n + 1;i++)
		{
			String s = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p;
			s = new Scanner(System.in).nextLine();
			int k = 0;
			for (p = s; * p != '\0';p++)
			{
				k++;
			}
			if (s.charAt(k - 2) == 'e' && s.charAt(k - 1) == 'r')
			{
				for (int j = 0;j < k - 3;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
				System.out.printf("%c\n",s.charAt(k - 3));
			}
			else
			{
				if (s.charAt(k - 2) == 'l' && s.charAt(k - 1) == 'y')
				{
				for (int j = 0;j < k - 3;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
				System.out.printf("%c\n",s.charAt(k - 3));
				}
			else
			{
				if (s.charAt(k - 3) == 'i' && s.charAt(k - 2) == 'n' && s.charAt(k - 1) == 'g')
				{
				for (int j = 0;j < k - 4;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
				System.out.printf("%c\n",s.charAt(k - 4));
				}
			else
			{
				for (int j = 0;j < k;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
			}
			}
			}
		}
	}
}

