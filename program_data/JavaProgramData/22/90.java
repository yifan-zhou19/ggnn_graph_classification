package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int[] num = new int[300];
		int i;
		int j;
		int d = 0;
		int s = 0;
		int t;
		int x;
		int y = 0;
		a = new Scanner(System.in).nextLine();

		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i) >= '0' && a.charAt(i) <= '9') && (a.charAt(i + 1) >= '0' && a.charAt(i + 1) <= '9'))
			{
		  d = d * 10 + a.charAt(i) - '0';
			}
		  else if ((a.charAt(i) >= '0' && a.charAt(i) <= '9') && (a.charAt(i + 1) < '0' || a.charAt(i + 1)>'9'))
		  {
			  d = d * 10 + a.charAt(i) - '0';
		  num[s] = d;
		  s = s + 1;
		  d = 0;
		  }
		}
		s = s - 1;

		for (j = 0;j < s;j++)
		{
				for (i = 0;i < s - j;i++)
				{
				if (num[i] < num[i + 1])
				{
					t = num[i];
					num[i] = num[i + 1];
					num[i + 1] = t;
				}
				}
		}
			for (i = 0;i <= s - 1;i++)
			{

			for (j = 1;j <= s;j++)
			{
				if (num[j] != num[0])
				{
					x = j;
					y = 1;
					break;
				}
			}
			}
				if (y == 1)
				{
					System.out.printf("%d",num[x]);
				}
				if (y == 0)
				{
					System.out.print("No");
				}

	}




}
