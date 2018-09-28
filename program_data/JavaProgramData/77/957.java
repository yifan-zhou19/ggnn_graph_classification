package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[400]);
		char c1;
		int top = 0;
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] a = new int[100];
		s = new Scanner(System.in).nextLine();
		c1 = s.charAt(0);
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) == c1)
			{
			   top++;
			   a[top] = i;
			}
			else
			{
				 System.out.printf("%d %d\n",a[top],i);
				 top--;
			}
		}
		return 0;
	}

}
