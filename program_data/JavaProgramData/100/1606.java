package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		str = new Scanner(System.in).nextLine();
		int[] arr = new int[128];
		int i;
		int b = 0;
		for (i = 0;i < str.length();i++)
		{
			arr[str.charAt(i)]++;
		}
		for (i = 65;i < 91;i++)
		{
			if (arr[i] > 0)
			{
						System.out.printf("%c=%d\n",i,arr[i]);
						b = 1;
			}
		}
		for (i = 97;i < 123;i++)
		{
			if (arr[i] > 0)
			{
						System.out.printf("%c=%d\n",i,arr[i]);
						b = 1;
			}
		}
		if (b == 0)
		{
				 System.out.print("No");
		}
	   // puts(str);
		return 0;
	}

}
