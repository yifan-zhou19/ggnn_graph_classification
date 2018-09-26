package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[5000]);
		int n = 0;
		int i;
		int m = 0;
		int flag = 0;
		int k = 0;
		int flag2 = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (s.charAt(i) != '\0')
			{
				n++;
			}
			else
			{
				break;
			}
		} //??
		for (i = 0;i <= n;i++)
		{
				  if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
				  {
					   m++;
					   flag2 = 1;
					   continue;
				  }
				  if (flag != 0 && flag2 != 0)
				  {
					  System.out.printf(",%d",m);
				  }
				  else if (flag2)
				  {
					  System.out.printf("%d",m);
					  flag = 1;
				  }
				  m = 0;
				  flag2 = 0;
		}
	}
}
