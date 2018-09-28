package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int want = -1;
		String shu = new String(new char[81]);
		String m = new String(new char[20]);
			m = new Scanner(System.in).nextLine();
		n = Integer.parseInt(m);
		for (i = 0;i < n;i++)
		{
			want = -1;
			shu = new Scanner(System.in).nextLine();
			if (shu.charAt(0) == '_' || (shu.charAt(0) >= 'a' && shu.charAt(0) <= 'z') || (shu.charAt(0) >= 'A' && shu.charAt(0) <= 'Z'))
			{
				for (k = 1;shu.charAt(k) != '\0';k++)
				{
					if (shu.charAt(k) == '_' || (shu.charAt(k) >= 'a' && shu.charAt(k) <= 'z') || (shu.charAt(k) >= 'A' && shu.charAt(k) <= 'Z') || (shu.charAt(k) >= '0' && shu.charAt(k) <= '9'))
					{
						continue;
					}
					else
					{
						System.out.print("0\n");
						want = 0;
						break;
					}
				}
			}
			else
			{
				System.out.print("0\n");
				want = 0;
			}
			if (want == -1)
			{
				System.out.print("1\n");
			}
		}
		return 0;
	}

}
