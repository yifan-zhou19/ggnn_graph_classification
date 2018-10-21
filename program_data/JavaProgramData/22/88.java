package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int flag = 0;
		int l;
		int m = 0;
		int num = 0;
		int temp;
		String str = new String(new char[1500]);
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i <= l;i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				m = m * 10 + str.charAt(i) - '0';
			}
			else
			{
				if (m != 0)
				{
					flag++;
				}
			}
			if (flag == 1)
			{
				a[num++] = m;
				flag = 0;
				m = 0;
			}

		}
		if (num == 1)
		{
			System.out.print("No");
		}
		else if (num == 2)
		{
			if (a[0] != a[1])
			{
				System.out.printf("%d",(a[0] < a[1])?a[0]:a[1]);
			}
			else
			{
				System.out.print("No");
			}
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *max;
			int max;
			for (i = 0;i < num - 1;i++)
			{
				max = a[i];
				for (j = num - 1;j > i;j--)
				{
					if (a[j] > max)
					{
						max = a[j];
					}
				}
				if (max != a[i])
				{
					;
				}
				{
					temp = a[i];
					a[i] = max;
					max = temp;
			}
			}
			for (i = 1;i < num;i++)
			{
				if (a[i] != a[0])
				{
					System.out.printf("%d",a[i]);
					flag++;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("No");
			}
		}

	}
}
