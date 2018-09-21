package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[300]);
		int i;
		int[] num = new int[30];
		int j = 0;
		int n;
		int max;
		int min;
		int sum1 = 0;
		int sum2 = 0;

		str = new Scanner(System.in).nextLine();
		for (i = 0;i < 30;i++)
		{
			num[i] = 0;
		}
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) == ' ')
			{
				j++;
			}
		else
		{
			num[j]++;
		}
		}
		n = j + 1;
		max = 0;
		min = 0;
		for (j = 0;j < n;j++)
		{
			   if (num[j] > num[max])
			   {
				   max = j;
			   }
			if (num[j] < num[min])
			{
				min = j;
			}
		}
		for (j = 0;j < max;j++)
		{
		sum1 = sum1 + num[j];
		}
		for (j = 0;j < min;j++)
		{
		sum2 = sum2 + num[j];
		}
		for (i = sum1 + max;i < sum1 + max + num[max];i++)
		{

		System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
		for (i = sum2 + min;i < sum2 + min + num[min];i++)
		{
			System.out.printf("%c",str.charAt(i));
		}




	}



}
