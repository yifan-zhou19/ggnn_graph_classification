package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10000];
		int[] y = new int[10000];
		String ch1 = new String(new char[10000]);
		String ch2 = new String(new char[10000]);
		int i = 0;
		int j = 0;
		int n = 0;
		int Min_h = 1000;
		int Max_h = 0;
		int Max = 0;
		ch1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		ch2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int comma = -1;
		int counter = 0;
		int number = 0;
		for (i = 0 ; i <= 9999 ; i++)
		{
			 if (ch1.charAt(i) == '\0' || ch1.charAt(i) == ',')
			 {
				  if (i - comma == 2)
				  {
					  x[counter] = ch1.charAt(i - 1) - '0';
				  }
				  else if (i - comma == 3)
				  {
					   x[counter] = (ch1.charAt(i - 2) - '0') * 10 + ch1.charAt(i - 1) - '0';
				  }
				  else if (i - comma == 4)
				  {
					   x[counter] = (ch1.charAt(i - 3) - '0') * 100 + (ch1.charAt(i - 2) - '0') * 10 + ch1.charAt(i - 1) - '0';
				  }
				  counter++;
				  comma = i;
				  if (ch1.charAt(i) == '\0')
				  {
					  break;
				  }
			 }
		}
		comma = -1;
		counter = 0;
		for (i = 0 ; i <= 9999 ; i++)
		{
			 if (ch2.charAt(i) == ',' || ch2.charAt(i) == '\0')
			 {
				  if (i - comma == 2)
				  {
					  y[counter] = ch2.charAt(i - 1) - '0';
				  }
				  else if (i - comma == 3)
				  {
					   y[counter] = (ch2.charAt(i - 2) - '0') * 10 + ch2.charAt(i - 1) - '0';
				  }
				  else if (i - comma == 4)
				  {
					   y[counter] = (ch2.charAt(i - 3) - '0') * 100 + (ch2.charAt(i - 2) - '0') * 10 + ch2.charAt(i - 1) - '0';
				  }
				  counter++;
				  comma = i;
				  if (ch2.charAt(i) == '\0')
				  {
					  break;
				  }
			 }
		}
		for (i = 0 ; i <= counter - 1 ; i++)
		{
			 if (x[i] < Min_h)
			 {
				 Min_h = x[i];
			 }
			 if (y[i] > Max_h)
			 {
				 Max_h = y[i];
			 }
		}
		for (i = Min_h ; i <= Max_h ; i++)
		{
			 number = 0;
			 for (j = 0 ; j <= counter - 1 ; j++)
			 {
				  if (x[j] <= i != 0 && y[j] > i)
				  {
				  number++;
				  }
			 }
			 if (number > Max)
			 {
				 Max = number;
			 }
		}
		System.out.print(counter);
		System.out.print(" ");
		System.out.print(Max);
		System.out.print("\n");
		return 0;
	}
}

