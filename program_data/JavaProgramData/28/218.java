package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[10000]);
		char c;
		int[] num = new int[300];
		int i;
		int j;
		int k = 0;
		int flag = 0;
		int t = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;(c = s.charAt(i)) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
				if (flag == 0)
				{
					flag = 1;
					for (j = 0;(c = s.charAt(i + j)) != ' ' && (c = s.charAt(i + j)) != '\0';j++)
					{
						num[k]++;
					}
				}
			}
			else if (s.charAt(i - 1) != ' ')
			{
				flag = 0;
				k++;
			}
				else
				{
					flag = 0;
				}
		}
		System.out.printf("%d",num[0]);
		for (i = 1;i <= k;i++)
		{
			System.out.printf(",%d",num[i]);
		}
	}
}
