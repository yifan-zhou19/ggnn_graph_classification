package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[300]);
		char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int i;
		int l;
		int j;
		int[] b = new int[26];
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < 26;j++)
			{
			  if (str.charAt(i) == a[j])
			  {
				  b[j] = b[j] + 1;
			  }
			}
		}
		for (i = 0;i < 26;i++)
		{
				 if (b[i] != 0)
				 {
					System.out.printf("%c=%d\n",a[i],b[i]);
				 }

		}
		int sum = 0;
		for (i = 0;i < 26;i++)
		{
			sum = sum + b[i];
		}
		if (sum == 0)
		{
			System.out.print("No");
		}



	}

}
