package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		int n;
		int j;
		int i;
		int sum = 1;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{

			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				if (s.charAt(i + 1) == s.charAt(i) || s.charAt(i + 1) == s.charAt(i) + 32)
				{
					sum++;
				continue;
				}
				else
				{
					System.out.printf("(%c,%d)",s.charAt(i),sum);
					 sum = 1;
					 continue;
				}
			}
			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{

		   if (s.charAt(i + 1) == s.charAt(i) || s.charAt(i + 1) == s.charAt(i) - 32)
		   {
					sum++;
				continue;
		   }
				else
				{
					System.out.printf("(%c,%d)",s.charAt(i) - 32,sum);
					 sum = 1;
					 continue;
				}
			}
		}
			return 0;
	}






}
