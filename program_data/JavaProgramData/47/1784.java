package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] str = new int[100];
	int n;
	int i;
	int temp;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	   str[i] = ConsoleInput.readToWhiteSpace(true);
	}
	for (i = 0;i < n / 2;i++)
	{
	   temp = str[i];
	   str[i] = (str + n - i - 1); //????????
	   str[n - i - 1] = temp;
	}
	for (i = 0;i < n - 1;i++) //?????
	{
	   System.out.print((str + i));
	   System.out.print(" ");
	}
	System.out.print((str + n - 1));
	return 0;
	}
}

