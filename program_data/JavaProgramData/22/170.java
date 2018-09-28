package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 String str = new String(new char[300]);
		 int[] sum = new int[200];
		 int counter = 0;
		 int i = 0;
		 int j;
		 int t;
		 str = new Scanner(System.in).nextLine();


		while (str.charAt(i) != '\0')
		{
			if (str.charAt(i) != ',')
			{
		   sum[counter] = sum[counter] * 10 + (str.charAt(i) - '0');
			}
		else
		{
			counter++;
		}
		   i++;
		}

		if (counter <= 0)
		{
		System.out.print("No");
		}
		else
		{
			for (i = 0;i < counter;i++)
			{
			  for (j = i + 1;j <= counter;j++)
			  {
				if (sum[i] < sum[j])
				{
					t = sum[i];
					sum[i] = sum[j];
					sum[j] = t;
				}
			  }
			}
			 t = 0;
			for (i = 1;i <= counter;i++)
			{
				if (sum[i] == sum[0])
				{
					t++;
				}
			}
		 if (t == counter)
		 {
			 System.out.print("No");
		 }
		 else
		 {
			 System.out.printf("%d",sum[t + 1]);
		 }
		}
	}
}
