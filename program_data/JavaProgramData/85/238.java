package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String s = new String(new char[100]);
			s = new Scanner(System.in).nextLine();
			int r = 0;
			if ((s.charAt(0) <= 'z' && s.charAt(0) >= 'a') || s.charAt(0) == '_' || (s.charAt(0) <= 'Z' && s.charAt(0) >= 'A'))
			{
				for (j = 1;s.charAt(j) != '\0';j++)
				{

					char b;
					b = s.charAt(j);
					if ((b <= 'z' && b >= 'a') || (b <= 'Z' && b >= 'A') || (b <= '9' && b >= '0') || (b == '_'))
					{
						r++;
					}
					else
					{
						System.out.print("no\n");
						 break;
					}
				}
				if (s.charAt(j) == '\0')
				{
					System.out.print("yes\n");
				}
			}
			   else
			   {
				System.out.print("no\n");
			   }
		}
		return 0;
	}
}

