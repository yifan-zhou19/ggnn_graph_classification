package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[300]);
		int[] a = new int[300];
		int i = 0;
		int j;
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			a[i] = (int)s.charAt(i); //48-57?0-9???
		}
		for (i = 0;i < s.length();i++)
		{
			if (a[i] > 47 && a[i] < 58)
			{
				for (j = 0;j < s.length() - i;j++)
				{
					if (a[i + j] > 47 && a[i + j] < 58)
					{
						System.out.printf("%c",s.charAt(i + j));
						continue;
					}
					else
					{
						System.out.print("\n");
						break;
					}
				}
				i = i + j;
			}
		}
	}



}
