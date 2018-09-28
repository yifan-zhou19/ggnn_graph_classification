package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int n;
		int[] a = new int[5];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0;j < 5;j++)
		{
			   a[j] = n % 10;
			   n = n / 10;
		}
		for (int i = 0;i < 5;i++)
		{
			   if (a[i] > 0)
			   {
			System.out.print(a[i]);
			   }
		} //??????????0???????

		return 0;
	}


}

