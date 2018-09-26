package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] num = new int[4];
	int i;
	int[] a = new int[1000];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i < n;i++)
	{
	  if (a[i] <= 18)
	  {
		num[0]++;
	  }
	  else if (a[i] < 36)
	  {
		num[1]++;
	  }
	  else if (a[i] < 61)
	  {
		num[2]++;
	  }
	  else
	  {
		  num[3]++;
	  }
	}
	System.out.print("1-18: ");
	System.out.printf("%.2f", 100.0 * num[0] / n);
	System.out.printf("%.2f", '%');
	System.out.printf("%.2f", "\n");
	System.out.printf("%.2f", "19-35: ");
	System.out.printf("%.2f", 100.0 * num[1] / n);
	System.out.printf("%.2f", '%');
	System.out.printf("%.2f", "\n");
	System.out.printf("%.2f", "36-60: ");
	System.out.printf("%.2f", 100.0 * num[2] / n);
	System.out.printf("%.2f", '%');
	System.out.printf("%.2f", "\n");
	System.out.printf("%.2f", "60??: ");
	System.out.printf("%.2f", 100.0 * num[3] / n);
	System.out.printf("%.2f", '%');
	System.out.printf("%.2f", "\n");

	return 0;
	}
}

