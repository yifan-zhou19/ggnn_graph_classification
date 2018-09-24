package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[15];
	while (ConsoleInput.lastReadWasGood())
	{
		int temp;
		int num = 0;
		int i = 0;
		int j = 0;
		int k = 0;
	 for ((a[i];i++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	 {
	 if (a[i] == -1)
	 {
	 return 0;
	 }
	 else if (a[i] == 0)
	 {
		for (j = 1;j < i;j++)
		{
	 for (k = 0;k < i - j;k++)
	 {
	 if (a[k] > a[k + 1])
	 {
		 temp = a[k];
	 a[k] = a[k + 1];
	 a[k + 1] = temp;
	 }
	 }
		}
	for (j = 0;j < i;j++)
	{
	for (k = j + 1;k < i;k++)
	{
	if (a[j] * 2 == a[k])
	{
	num++;
	}
	}
	}
	System.out.print(num);
	System.out.print("\n");
	num = 0;
	break;
	 }
	 }
	}

	}



}

