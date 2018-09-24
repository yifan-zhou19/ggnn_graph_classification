package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[3000]);
		int[] num = new int[300];
		int i;
		int l = 0;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (a.charAt(i) == '\0')
			{
				num[k] = l;
				break;
			}
			if (a.charAt(i) == ' ')
			{
				num[k] = l;
				l = 0;
				k++;
				for (i++;;i++)
				{
					if (a.charAt(i) != ' ')
					{
						i--;
						break;
					}
				}
			}
			else
			{
				l++;
			}
		}

		for (i = 0;i < k;i++)
		{
			System.out.printf("%d,", num[i]);
		}
		System.out.printf("%d",num[k]);
		return 0;
	}
}
