package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int counter = 0;
		int len;
		int i;
		int j;
		int max = 0;
		int temp = 0;
		String s = new String(new char[10000]);
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
						  if (s.charAt(i) == ',')
						  {
						  counter++;
						  }
						  else
						  {
							  x[counter] = x[counter] * 10;
							  x[counter] = x[counter] + s.charAt(i) - '0';
						  }
		}
		s = new Scanner(System.in).nextLine();
		len = s.length();
		counter = 0;
		for (i = 0;i < len;i++)
		{
						  if (s.charAt(i) == ',')
						  {
						  counter++;
						  }
						  else
						  {
							  y[counter] = y[counter] * 10;
							  y[counter] = y[counter] + s.charAt(i) - '0';
						  }
		}
		counter++; //?????
		for (i = 0;i < 1000;i++)
		{
						   temp = 0;
						   for (j = 0;j < counter;j++)
						   {
												   if (x[j] <= i != 0 && y[j]> i)
												   {
												   temp++;
												   }
						   }
						   if (temp > max)
						   {
						   max = temp;
						   }
		}
		System.out.printf("%d %d",counter,max);
		return 0;
	}

}
