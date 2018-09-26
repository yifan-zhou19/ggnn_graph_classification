package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //a?????b????
		int[] a = new int[100];
		int[] b = new int[100];
		int hour = 0;
		int time = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
		  if ((a[i] >= 90) && (a[i] <= 140) && (b[i] >= 60) && (b[i] <= 90)) //????????1
		  {
		  time = time+1;
		  }
		  if ((a[i] < 90) || (a[i]>140) || (b[i] < 60) || (b[i]>90) || (i == n - 1))
		  {
			if (hour < time)
			{
			hour = time; //????????????????
			}
			time = 0;
		  }
		}
		System.out.print(hour);
		System.out.print("\n");
		return 0;
	}

}

