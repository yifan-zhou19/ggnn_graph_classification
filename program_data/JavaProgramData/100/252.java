package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[300]);
		int i;
		int j;
		int n = 0;
		int[] num = new int[300];
		str = new Scanner(System.in).nextLine();
		//printf("%d",num[97]);
		for (i = 97;i <= 122;i++)
		{
			for (j = 0;str.charAt(j) != '\0';j++)
			{
				if (str.charAt(j) == i)
				{
					num[i]++;
				}
			}
		}
		for (i = 97;i <= 122;i++)
		{
			if (num[i] != 0)
			{
				n++;
			}
		}
		for (i = 97;i <= 122;i++)
		{
			if (n == 0)
			{
				System.out.print("No");
				break;
			}
			else if (num[i] == 0)
			{
				continue;
			}
			else
			{
				System.out.printf("%c=%d\n",i,num[i]);
			}
		}
	}
}
