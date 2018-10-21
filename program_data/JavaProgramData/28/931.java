package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int L;
		int[] l = new int[300];
		char[][] dc = new char[300][100];
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		System.in.read();
		L = s.length();
		n = 0;
		k = 0;
		for (i = 0;i < L;i++)
		{
			if (s.charAt(i) != ' ')
			{
				 dc[n][k] = s.charAt(i);
				 k++;
			}
			else
			{
				   dc[n][k] = '\0';
				   n++;
				   k = 0;
				   while (s.charAt(i + 1) == ' ')
				   {
						 i++;
				   }
			}
		}
		dc[n][k] = '\0';
		for (i = 0;i < n + 1;i++)
		{
			l[i] = String.valueOf(dc[i]).length();
		}
		System.out.printf("%d",l[0]);
		System.in.read();
		for (i = 1;i < n + 1;i++)
		{
			System.out.printf(",%d",l[i]);
			System.in.read();
		}
		return 0;
	}

}
