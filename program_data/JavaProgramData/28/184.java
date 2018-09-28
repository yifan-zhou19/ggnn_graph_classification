package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j = 0;
		int[] b = new int[300];
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < 300;i++)
		{
			b[i] = 0;
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
		   if (s.charAt(i) != ' ')
		   {
				b[j]++;
		   }
		   else if (s.charAt(i + 1) != ' ')
		   {
			   j++;
		   }
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i <= j;i++)
		{
			System.out.printf(",%d",b[i]);
		}
	}

}
