package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int sum = 1;
		int[] a = new int[100];
		String c = new String(new char[1000]);
		char t;
		c = new Scanner(System.in).nextLine();
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if (c.charAt(i) == ',')
			{
				sum = sum + 1;
			}
		}
		if (sum == 1)
		{
			System.out.print("No");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto loop;
		}
			i = 0;
		for (k = 1;k <= sum;k++)
		{
			for (j = i;c.charAt(j) != ',' && c.charAt(j) != '\0';j++, i++)
			{
			   a[k] = a[k] * 10 + c.charAt(j) - 48;
			}
			i = i + 1;
		}
		for (i = 1;i < sum;i++)
		{
			for (j = 1;j <= sum - i;j++)
			{
				if (a[j + 1] > a[j])
				{
					m = a[j];
					a[j] = a[j + 1];
					a[j + 1] = m;
				}
			}
		}
		for (i = 1;i < sum;i++)
		{
			if (a[i] != a[i + 1])
			{
				System.out.printf("%d",a[i + 1]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
		}
			System.out.print("No");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	;
	}





}
